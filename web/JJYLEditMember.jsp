<%-- 
    Document   : JJYLEditMember
    Created on : 16-Apr-2020, 8:03:38 PM
    Author     : jujeo
    Revision History:
        Jeonghwan Ju, 2020.04.16: Created
--%>

<jsp:include page = "JJYLBanner.jsp" />

<section>
    <h1>Edit an Existing Member</h1>
    <p style="color:red;font-style: italic;">${messages}</p>
    <form action="/JJYLClub/JJYLMemberAdmin" method="post">
        <input type="hidden" id="action" name="action" value="saveMember" />
        <input type="hidden" id="db_operation" name="db_operation" 
               value="update" />
        <input type="hidden" id="email" name="email" 
               value="${member.emailAddress}" />
        
        <label for="email">Email:</label>
        <input type="text" id="emailView" name="emailView" 
               value="${member.emailAddress}" style="width:300px;" disabled />
        <br />
        
        <label for="fullName">Full Name:</label>
        <input type="text" id="fullName" name="fullName" 
               value="${member.fullName}" style="width:200px;" /><br />
        
        <label for="phoneNumber">Phone:</label>
        <input type="text" id="phoneNumber" name="phoneNumber"
               value="${member.phoneNumber}" style="width:150px;" /><br />
        
        <label for="programName">IT Program:</label>
        <select id="programName" name="programName" style="width:100px;">
            <option value="CAD" ${member.programName.equals("CAD") ?
                                  "selected" : ""}>CAD</option>
            <option value="CPA" ${member.programName.equals("CPA") ?
                                  "selected" : ""}>CPA</option>
            <option value="CP" ${member.programName.equals("CP") ?
                                  "selected" : ""}>CP</option>
            <option value="ITID" ${member.programName.equals("ITID") ?
                                  "selected" : ""}>ITID</option>
        </select><br />
        
        <label for="yearLevel">Year Level:</label>
        <select id="yearLevel" name="yearLevel" style="width:50px;">
            <option value="1" ${(member.yearLevel == 1) ?
                                  "selected" : ""}>1</option>
            <option value="2" ${(member.yearLevel == 2) ?
                                  "selected" : ""}>2</option>
            <option value="3" ${(member.yearLevel == 3) ?
                                  "selected" : ""}>3</option>
            <option value="4" ${(member.yearLevel == 4) ?
                                  "selected" : ""}>4</option>            
        </select><br />
        
        <label>&nbsp;</label>
        <input type="submit" value="Save" />
        <input type="reset" value="Reset" />   
    </form>
</section>

<jsp:include page = "JJYLFooter.jsp" />
