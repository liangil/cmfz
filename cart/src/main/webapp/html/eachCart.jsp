<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page pageEncoding="UTF-8" isELIgnored="false" contentType="text/html; UTF-8" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <script src="${pageContext.request.contextPath}/js/jquery-2.2.1.min.js"></script>
    <script>
        function addCart(){
            $.ajax({
                url:"${pageContext.request.contextPath}/cart/showCart",
                typeL:"POST",
                data:null,
                datatype:"json",
                success:function (data) {
                    console.log(data);
                }
            })
        }
    </script>
    <title>Document</title>
</head>
<body onload="addCart()">

</body>
</html>