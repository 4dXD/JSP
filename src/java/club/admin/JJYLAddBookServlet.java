/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club.admin;

import club.business.Book;
import club.data.BookIO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jujeo
 */
public class JJYLAddBookServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        // Variables
        String messages = "";
        String url = "";
        
        // Get the request values
        String code = request.getParameter("code");
        String description = request.getParameter("description");
        
        int quantity = 0;
        if (request.getParameter("quantity") == "") {
            quantity = 0;
        }
        else {
            quantity = Integer.parseInt(request.getParameter("quantity"));
        }
        
        if (code == "") {
            messages += "Book code is required.<br />";
        }
        if (description.length() < 3) {
            messages += "Description must have at least 3 characters.<br />";
        }
        if (quantity <= 0) {
            messages += "Quantity must be a positive number.";
        }
            
        // Store data in Book object
        Book book = new Book(code, description, quantity);
        
        if (messages != "") {
            url = "/JJYLAddBook.jsp";            
        }
        else {
            url = "/JJYLDisplayBooks";
            
            ServletContext context = getServletContext();
            
            String path = context.getRealPath("/WEB-INF/book.txt");
            BookIO.insert(book, path);
        }
        
        // Store Book object in request
        request.setAttribute("book", book);
        request.setAttribute("messages", messages);
        getServletContext().getRequestDispatcher(url)
            .forward(request,response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. 
    // Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, 
            HttpServletResponse response)
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
    protected void doPost(HttpServletRequest request, 
            HttpServletResponse response)
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
