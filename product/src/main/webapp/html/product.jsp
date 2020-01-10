<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page pageEncoding="UTF-8" isELIgnored="false" contentType="text/html; UTF-8" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <script src="${pageContext.request.contextPath}/js/jquery-2.2.1.min.js"></script>
    <title>Document</title>
</head>
<body>
<h1>商品展示</h1>
<table>
    <tr><td>分类</td><td>ID</td><td>商品名称</td><td>价格</td><td>加入购物车</td></tr>
    <c:forEach var="cate" items="${requestScope.product}">
    <tr>
        <td>${cate.categoryId}</td>
    </tr>
        <c:forEach var="product" items="${cate.list}">
         <tr>
             <td>&nbsp;</td>
        <td>${product.productId}</td>
        <td>${product.productName}</td>
        <td>${product.productPrice}</td>
        <td><a href="${pageContext.request.contextPath}/addCart?id=${product.productId}">加入购物车</a></td>
         </tr>
        </c:forEach>
    </c:forEach>
    <a href="http://localhost:10001/html/eachCart.jsp">查看购物车</a>
</table>
</body>
</html>