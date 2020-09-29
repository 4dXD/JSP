/*
    Document   : JJYLMemberAdminServlet
    Author     : jujeo
    Revision History:
        Jeonghwan Ju, 2020.04.16: Created
*/
package club.admin;

import club.business.Member;
import club.data.MemberDB;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 *
 * @author jujeo
 */
public class JJYLMemberAdminServlet extends HttpServlet {

    // doGet
    @Override
    protected void doGet(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException {
        
        // get current action
        String action = request.getParameter("action");
        String url = "/JJYLDisplayMembers.jsp";
        
        if (action == null) {
            action = "displayMembers";  // default action
        }
        
        // perform action and set URL to appropriate page
        if (action.equals("displayMembers")) {            
            // get list of members
            ArrayList<Member> members = MemberDB.selectMembers();
            request.setAttribute("members", members);
            url = "/JJYLDisplayMembers.jsp";
        }
        else if (action.equals("addMember")) {
            url = "/JJYLAddMember.jsp";
        }
        else if (action.equals("editMember")) {
            String emailAddress = request.getParameter("email");
            Member member = MemberDB.selectMember(emailAddress);
            request.setAttribute("member", member);
            url = "/JJYLEditMember.jsp";
        }
        else if (action.equals("removeMember")) {
            String emailAddress = request.getParameter("email");
            Member member = MemberDB.selectMember(emailAddress);
            request.setAttribute("member", member);
            url = "/JJYLRemoveMember.jsp";
        }
        
        getServletContext().getRequestDispatcher(url)
                .forward(request, response);        
    }
    
    // doPost
    @Override
    protected void doPost(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException {
        
        // get current action
        String action = request.getParameter("action");
        String url = "";
        
        // perform action and set URL to appropriate page
        if (action.equals("saveMember")) {
            url = saveMember(request, response);
        }
        else if (action.equals("deleteMember")) {
            // get the member
            String emailAddress = request.getParameter("email");
            Member member = MemberDB.selectMember(emailAddress);            
            // delte the member
            MemberDB.delete(member);            
            // get and set updated members
            ArrayList<Member> members = MemberDB.selectMembers();    
            request.setAttribute("members", members);  
            url = "/JJYLDisplayMembers.jsp";
        }
        
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
        
    // Save Member Method
    private String saveMember(HttpServletRequest request,
            HttpServletResponse response) {
        // insert / update
        String db_operation = (String) request.getParameter("db_operation");
        String url = "/JJYLDisplayMembers.jsp";
        String errorMessage = "";
        
        String fullName = request.getParameter("fullName");
        String emailAddress = request.getParameter("email");
        String phoneNumber = request.getParameter("phoneNumber");
        String programName = request.getParameter("programName");
        int yearLevel = Integer.parseInt(request.getParameter("yearLevel"));
        
        Member member = new Member();
        member.setFullName(fullName);
        member.setEmailAddress(emailAddress);
        member.setPhoneNumber(phoneNumber);
        member.setProgramName(programName);
        member.setYearLevel(yearLevel);
        
        // ArrayList<Member> members = new ArrayList<Member>();
        //         (ArrayList<Member>) request.getAttribute("members");
        ArrayList<Member> members = 
                (ArrayList<Member>) request.getAttribute("members");
        
        if (db_operation.equals("update")) {
            if (!member.isValid()) {
                errorMessage = "Cannot update record."
                        + " Please provide a valid name.";
                request.setAttribute("member", member);
                url = "/JJYLEditMember.jsp";
            }
            else {
                MemberDB.update(member);
                members = MemberDB.selectMembers();
                request.setAttribute("members", members);
            }
        }
        else {                          // insert (default)
            if (!member.isValid()) {
                errorMessage = "Cannot insert a new record."
                        + " Please provide a valid name and/or email.";
                url = "/JJYLAddMember.jsp";
            }
            else {
                MemberDB.insert(member);
                members = MemberDB.selectMembers();
                request.setAttribute("members", members);
            }
        }
        
        request.setAttribute("messages", errorMessage);
        return url;
    }
}
