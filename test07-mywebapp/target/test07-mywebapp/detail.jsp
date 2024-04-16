<%@ page import="java.util.List" %>
<%@ page import="WebSystem.bean.Car" %><%--
  Created by IntelliJ IDEA.
  User: 丁海斌
  Date: 2023/7/9
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品的详情</title>
</head>
<body>
<center>
    <h1>商品详情</h1>
    <table border="1px">
        <% List<Car> list = (List<Car>) request.getAttribute("cars");%>
    <%
        int i=0;
        for(Car car:list){
    %>
    <tr>
        <td align="center"><%=++i%></td>
        <td align="center"><%=car.getId()%></td>
        <td align="center"><%=car.getCarNum()%></td>
        <td align="center"><%=car.getBrand()%></td>
        <td align="center"><%=car.getGuidePrice()%></td>
        <td align="center"><%=car.getProduceTime()%></td>
        <td align="center"><%=car.getCarType()%></td>
    </tr>
    <%
        }%>
    </table>
</center>
</body>
</html>
