<%--
  Created by IntelliJ IDEA.
  User: 丁海斌
  Date: 2023/7/9
  Time: 18:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body background="t01a44596706ed343dd.jpg">

<center>
    <h1>欢迎使用该车辆售货系统，请先登录</h1>
    <form action="http://localhost:8080/mywebapp/login" method="post">
        <table style="background-color: cadetblue">
            <tr>
                <td>账号</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td><input type="submit" value="登录"></td>
                <td><input type="reset" value="清空" align="center">
                    <a href="/register" type="button">注册</a></td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>

