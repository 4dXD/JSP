<%-- 
    Document   : JJYLAddMember
    Created on : 16-Apr-2020, 4:41:59 PM
    Author     : jujeo
    Revision History:
        Jeonghwan Ju, 2020.04.16: Created
--%>

<jsp:include page = "JJYLBanner.jsp" />

<section>
    <h1>Add a New Member</h1>
    <p style="color:red;font-style: italic;">${messages}</p>
    <form action="/JJYLClub/JJYLMemberAdmin" method="post">
        <input type="hidden" id="action" name="action" value="saveMember" />
        <input type="hidden" id="db_operation" name="db_operation" value="insert" />
        
        <label for="email">Email:</label>
        <input type="text" id="email" name="email" style="width:300px;" /><br />
        
        <label for="fullName">Full Name:</label>
        <input type="text" id="fullName" name="fullName" 
               style="width:200px;" /><br />
        
        <label for="phoneNumber">Phone:</label>
        <input type="text" id="phoneNumber" name="phoneNumber" 
               style="width:150px;" /><br />
        
        <label for="programName">IT Program:</label>
        <select id="programName" name="programName" style="width:100px;">
            <option value="CAD">CAD</option>
            <option value="CPA">CPA</option>
            <option value="CP">CP</option>
            <option value="ITID">ITID</option>
        </select><br />
        
        <label for="yearLevel">Year Level:</label>
        <select id="yearLevel" name="yearLevel" style="width:50px;">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
        </select><br />
        
        <label>&nbsp;</label>
        <input type="submit" value="Save" />
        <input type="reset" value="Reset" />   
    </form>
</section>

<jsp:include page = "JJYLFooter.jsp" />
