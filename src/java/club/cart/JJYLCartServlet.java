/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club.cart;

import club.business.Book;
import club.business.ECart;
import club.business.ELoan;
import club.data.BookIO;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import sun.security.x509.EDIPartyName;
/**
 *
 * @author Yoonho Lee
 */
public class JJYLCartServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ServletContext context = getServletContext();
        HttpSession session = request.getSession();

        ECart cart = (ECart)session.getAttribute("cart");

        if (cart == null) {
                cart = new ECart();
        }
        
        String action = "";

        if(request.getParameter("action") != null){
            action = request.getParameter("action");
        }
        
        if(action.equals("reserve")){
            ArrayList<Book> books = (ArrayList<Book>)context.getAttribute("books");
            String code = request.getParameter("code");
            Book book = ELoan.findItem( books, code);
            cart.addItem(book);

            ELoan.subtractFromQOH(books, code, 1);
            
            String path = getServletContext().getInitParameter("booksFilePath");
            path = context.getRealPath(path);
            BookIO.update(book, path);
        
            session.setAttribute("cart", cart);
        }
        
        
        //context.setAttribute("books", cart.getItems());
        getServletContext().getRequestDispatcher("/JJYLECart.jsp").forward(request,response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
