<%-- 
    Document   : JJYLDisplayBooks
    Created on : 26-Feb-2020, 4:20:30 AM
    Author     : jujeo
    Revision History:
        Jeonghwan Ju, 2020.02.26: Created
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page = "JJYLBanner.jsp" />

<section>
    <h1>List of Books</h1>
    <table>
        <tr>
            <th style="border: 1px solid black;">Code</th>
            <th style="border: 1px solid black;">Description</th>
            <th style="border: 1px solid black;">Code</th>
        </tr>
        <c:forEach var="book" items="${books}">
        <tr>
            <td style="border: 1px solid black;">${book.code}</td>
            <td style="border: 1px solid black;">${book.description}</td>
            <td style="border: 1px solid black;">${book.quantity}</td>
        </tr>
        </c:forEach>
    </table>
    
    <form action="JJYLAddBook.jsp">
        <button>Add Book</button>
    </form>    
</section>
            
<jsp:include page = "JJYLFooter.jsp" />
