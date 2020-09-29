<%-- 
    Document   : JJYLRegister.jsp
    Created on : 3-Feb-2020, 1:19:07 PM
    Author     : yunho
    Revision History:
        Jeonghwan Ju, 2020.02.26: Updated
--%>

<jsp:include page="JJYLBanner.jsp" />

<section>
    <h2>New Member Registration Form</h2>
    <br>
    <form action="JJYLDisplayMember.jsp" method="post">

        <label>Full Name:</label>
        <input type="text" name="fullName" style="width: 200px" required><br>
        <label>Email:</label>
        <input type="email" name="email" style="width: 300px" required><br>
        <label>Phone:</label>
        <input type="text" name="phone" style="width: 100px"><br>

        <label>IT Program:</label>
        <select name="itProgram">
            <option value="CAS" selected>CAS</option>
            <option value="SQATE">SQATE</option>
            <option value="CPA">CPA</option>
            <option value="CPA">CP</option>
            <option value="CPA">ITID</option>
            <option value="CPA">CAD</option>
            <option value="CPA">ITSS</option>
        </select>
        <br>
        <label>Year Level:</label>
        <select name="year">
            <option value="1" selected>1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
        </select>
        <br>
        <input type=submit value="Register Now!">
        <input type="reset" value="Reset">
    </form>
</section>

<jsp:include page = "JJYLFooter.jsp" />

