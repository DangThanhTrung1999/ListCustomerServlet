<%--
  Created by IntelliJ IDEA.
  User: Trung
  Date: 5/31/2019
  Time: 3:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

<html>
<head>
    <title>DANH SÁCH KHÁCH HÀNG</title>
</head>
<body>
<body style="margin:0 auto; width:1024px">
<h1>Danh sách khách hàng</h1>
<table width="100%" border="1" cellpadding="1" cellspacing="1">
    <tr>
        <th width="20%">Tên</th>
        <th width="20%">Ngày sinh</th>
        <th width="20%">Địa chỉ</th>
        <th width="20%">Ảnh</th>
    </tr>
    <c:forEach items="${listKH}" var="KH">
        <tr>
            <td>${KH.name }</td>
            <td>${KH.date }</td>
            <td>${KH.address }</td>
            <td><img style=" width:200px; height:200px"src="${KH.image}"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
