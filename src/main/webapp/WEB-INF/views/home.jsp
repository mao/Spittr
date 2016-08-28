<%--
  Created by IntelliJ IDEA.
  User: daniyyel
  Date: 8/20/16
  Time: 4:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spittr Home</title>
</head>
<body>
  <h1>Welcome to Spittr modified #2</h1>
  <a href="<s:url value="/spittles" />">Spittles</a>
  <a href="<s:url value="/spitter/register" /> ">Register</a>
</body>
</html>
