<%-- 
    Document   : JJYLDisplayMembers
    Created on : 16-Apr-2020, 4:04:26 PM
    Author     : jujeo
    Revision History:
        Jeonghwan Ju, 2020.04.16: Created
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page = "JJYLBanner.jsp" />

<section>    
    <h1>List of Members</h1>
    <table>
        <tr>
            <th>Email</th>
            <th>Full Name</th>
            <th>Program</th>
            <th>Year</th
        </tr>
        <c:forEach var="member" items="${members}">        
        <tr>
            <td>${member.emailAddress}</td>
            <td>${member.fullName}</td>
            <td>${member.programName}</td>
            <td>${member.yearLevel}</td>
            <td>
                <a href="/JJYLClub/JJYLMemberAdmin?action=editMember&AMP;email=${member.emailAddress}">Edit</a>
                <a href="/JJYLClub/JJYLMemberAdmin?action=removeMember&AMP;email=${member.emailAddress}">Remove</a>
            </td>
        </tr>
        </c:forEach>
    </table>
    
    <form action="/JJYLClub/JJYLMemberAdmin" method="GET">
        <input type="hidden" id="action" name="action" value="addMember" />
        <button type="submit">Add Member</button>
    </form>
</section>

<jsp:include page = "JJYLFooter.jsp" />

