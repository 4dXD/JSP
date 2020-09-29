<%-- 
    Document   : JJYLELoan
    Created on : 7-Apr-2020, 2:36:03 PM
    Author     : Yoonho Lee
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page = "JJYLBanner.jsp" />

<section>
    <form>
        <table>
            <tr>
                <th style="border: 0px solid black;">Code</th>
                <th style="border: 0px solid black;">Description</th>
                <th style="border: 0px solid black;">QOH</th>
                <th style="border: 0px solid black;">Action</th>

            </tr>
            <c:forEach var="book" items="${books}">
            <tr>
                <td style="border: 0px solid black;">${book.code}</td>
                <td style="border: 0px solid black;">${book.description}</td>
                <td style="border: 0px solid black; text-align: right;">${book.quantity}</td>
                <td style="border: 0px solid black; text-align: right;">
                    <c:if test = "${book.quantity != 0}">
                        <a href="JJYLCart?action=reserve&code=${book.code}">Reserve</a>
                    </c:if>
                    <c:if test = "${book.quantity == 0}">
                        N/A
                    </c:if>
                </td>
            </tr>
            </c:forEach>
            
        </table>
    </form>
</section>


<jsp:include page = "JJYLFooter.jsp" />
