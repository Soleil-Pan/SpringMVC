<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/2/10
  Time: 0:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    ${requestScope.user}
    <hr/>
    ${sessionScope.user}
    <hr/>
    ${applicationScope.user}
</body>
</html>
