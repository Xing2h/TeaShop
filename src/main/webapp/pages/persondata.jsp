<%@ page import="com.tee.pojo.User" %><%--
  Created by IntelliJ IDEA.
  User: 27226
  Date: 2021/11/23
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人资料</title>
</head>
<body>
<%
    User user = (User) session.getAttribute("user");
%>
<form action="../DataModifyServlet" class="form-horizontal" method="post">
    <div class="form-group">
        <label for="id" class="col-sm-2 control-label">id</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="id" id="id" value="<%=user.getId()%>" disabled>
        </div>
    </div>
    <div class="form-group">
        <label for="username" class="col-sm-2 control-label">username</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="username" id="username" value="<%=user.getUsername()%>">
        </div>
    </div>
    <div class="form-group">
        <label for="email" class="col-sm-2 control-label">email</label>
        <div class="col-sm-10">
            <input type="email" class="form-control" name="email" id="email" value="<%=user.getEmail()%>">
        </div>
    </div>
    <div class="form-group">
        <label for="tel" class="col-sm-2 control-label">tel</label>
        <div class="col-sm-10">
            <input type="tel" class="form-control" name="tel" id="tel" value="<%=user.getTel()%>">
        </div>
    </div>
    <div class="form-group">
        <label for="password" class="col-sm-2 control-label">password</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="password" id="password" value="<%=user.getPassword()%>">
        </div>
    </div>
    <button type="submit" id="mod">提交修改</button>
</form>
</body>
</html>
