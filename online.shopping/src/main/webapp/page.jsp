<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>

    <head>

        
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Shop Homepage - ${title}</title>


        <script>
            window.menu = '${title}';
        </script>

        <!-- Bootstrap core CSS -->
        <link href="${css}/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="${css}/myApp.css" rel="stylesheet">

    </head>

    <body>

        <div class="wrapper">

            <!-- Navigation -->
            <%@include file="./shared/nevBar.jsp"%>

            <!-- Page Content -->

            <div class="content">
                <c:if test="${userClickHome == true}">
                    <%@include file="home.jsp"%>  
                </c:if>

                <!-- /.container -->

                <c:if test="${userClickAbout == true}">
                    <%@include file="about.jsp"%>  
                </c:if>

                <c:if test="${userClickContact == true}">
                    <%@include file="contact.jsp"%>  
                </c:if>
            </div>
            <!-- Footer -->
            <%@include file="./shared/footer.jsp"%>


            <!-- Bootstrap core JavaScript -->
            <script src="${js}/jquery.js"></script>
            <script src="${js}/bootstrap.min.js"></script>

            <!-- self coded javascript -->
            <script src="${js}/myApp.js"></script>

        </div>
    </body>

</html>
