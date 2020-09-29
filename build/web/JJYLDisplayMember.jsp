<%-- 
    Document   : JJYLDisplayMember
    Created on : 3-Feb-2020, 1:34:20 PM
    Author     : yunho
    Revision History:
        Jeonghwan Ju, 2020.02.26: Updated
--%>

<jsp:include page = "JJYLBanner.jsp" />

<section>
    <form action="JJYLRegister.jsp">
        <label>Full Name:</label>
        <p>${param.fullName}</p>
        <br>
        <label>Email:</label>
        <p>${param.email}</p>
        <br>
        <label>Phone:</label>
        <p>${param.phone}</p>
        <br>
        <label>IT Program:</label>
        <p>${param.itProgram}</p>
        <br>
        <label>Year Level:</label>
        <p>${param.year}</p>
        <br>
        <p>To register another member, click on the Back button in your browser 
            or<br> the Return button shown below</p>

        <input type="submit" value="Return">
    </form>
</section>
            
<jsp:include page = "JJYLFooter.jsp" />
