<%-- 
    Document   : JJYLError.jsp
    Created on : 26-Feb-2020, 6:23:40 PM
    Author     : jujeo
    Revision History:
        Jeonghwan Ju, 2020.02.26: Created
--%>

<jsp:include page = "JJYLBanner.jsp" />

<section>
    <h1>Java Error</h1>
    <p>Sorry, Java has thrown an exception.</p>
    <p>To continue, click the Back button.</p>

    <h2>Details</h2>
    <p>Type: ${pageContext.exception["class"]}</p>
    <p>Message: ${pageContext.exception.message}</p>
</section>

<jsp:include page = "JJYLFooter.jsp" />

