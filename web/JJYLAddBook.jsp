<%-- 
    Document   : JJYLAddBook
    Created on : 26-Feb-2020, 4:13:16 PM
    Author     : jujeo
    Revision History:
        Jeonghwan Ju, 2020.02.26: Created
--%>

<jsp:include page = "JJYLBanner.jsp" />

<section>
    <h1>Add a Book</h1>
    <p style="color:red;font-style: italic;">${messages}</p>
    <form>
        <label for="code">Code:</label>
        <input type="text" id="code" name="code" value="${book.code}" 
            style="width:80px;" /><br />
        
        <label for="description">Description:</label>
        <input type="text" id="description" name="description" 
            value="${book.description}" style="width:200px;" /><br />
        
        <label for="quantity">Quantity:</label>
        <input type="text" id="quantity" name="quantity" 
            value="${book.quantity}" style="width:40px;" /><br />
        
        <label>&nbsp;</label>
        <input type="submit" formaction="/JJYLClub/JJYLAddBook" 
               formmethod="post" value="Save" />
        <input type="reset" formaction="/JJYLClub/JJYLDisplayBooks"
               formmethod="post" value="Cancel" />   
    </form>
</section>

<jsp:include page = "JJYLFooter.jsp" />
