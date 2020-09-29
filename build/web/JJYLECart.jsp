<%-- 
    Document   : JJYLECart
    Created on : 8-Apr-2020, 4:14:35 PM
    Author     : Yoonho
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page = "JJYLBanner.jsp" />

<section>
    <h3>Your Loan Cart</h3>
    <table>
        <tr>
            <th style="border: 0px solid black;">Code</th>
            <th style="border: 0px solid black;">Description</th>
            <th style="border: 0px solid black;">Quantity</th>

        </tr>
        <c:forEach var="book" items="${cart.items}">
        <tr>
            <td style="border: 0px solid black;">${book.code}</td>
            <td style="border: 0px solid black;">${book.description}</td>
            <td style="border: 0px solid black; text-align: right;">${book.quantity}</td>
        </tr>
        <c:set var= "total" value="${total + book.quantity}"/>
        </c:forEach>
        <tr></tr>
        <tr>
            <td></td>
            <td style="text-align: right">Total:</td>
            <td style="text-align: right"><c:out value="${total}"/></td>
        </tr>
    </table>
    <br><br>
    <a href="JJYLClearCart">Clear the cart</a><br><br>
    <a href="JJYLLoan">Return to eLoan</a>
</section>
<jsp:include page = "JJYLFooter.jsp" />

