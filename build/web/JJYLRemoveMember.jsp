<%-- 
    Document   : JJYLRemoveMember
    Created on : 16-Apr-2020, 8:31:28 PM
    Author     : jujeo
    Revision History:
        Jeonghwan Ju, 2020.04.16: Created
--%>

<jsp:include page = "JJYLBanner.jsp" />

<section>
    <h1>Do you want to delete this member?</h1>
    <p style="color:red;font-style: italic;">${messages}</p>
    <form action="/JJYLClub/JJYLMemberAdmin" method="post">
        <input type="hidden" id="action" name="action" value="deleteMember" />
        <input type="hidden" id="email" name="email" 
               value="${member.emailAddress}" />
        
        <label for="email">Email:</label>
        <input type="text" id="emailView" name="emailView" 
               value="${member.emailAddress}" style="width:300px;" disabled />
        <br />
        
        <label for="fullName">Full Name:</label>
        <input type="text" id="fullName" name="fullName" 
               value="${member.fullName}" style="width:200px;" disabled />
        <br />
        
        <label for="phoneNumber">Phone:</label>
        <input type="text" id="phoneNumber" name="phoneNumber"
               value="${member.phoneNumber}" style="width:150px;" disabled />
        <br />
        
        <label for="programName">IT Program:</label>
        <input type="text" id="programName" name="programName"
               value="${member.programName}" style="width:100px;" disabled />
        <br />
        
        <label for="yearLevel">Year Level:</label>
        <input type="text" id="yearLevel" name="yearLevel"
               value="${member.yearLevel}" style="width:100px;" disabled />
        <br />
        
        <label>&nbsp;</label>
        <input type="submit" value="Yes" />   
        <a href="/JJYLClub/JJYLMemberAdmin">
            <input type="button" value="No" />
        </a>
    </form>
</section>

<jsp:include page = "JJYLFooter.jsp" />
