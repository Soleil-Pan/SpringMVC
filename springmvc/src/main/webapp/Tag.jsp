<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/2/10
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <h2>学生信息</h2>
        <form>
            学生ID:<input type="text" name="id" value="${student.id}"><br/>
            学生姓名:<input type="text" name="name" value="${student.name}"><br/>
            学生年龄:<input type="text" name="age" value="${student.age}"><br/>
            <input type="submit" value="提交">
        </form>

        <h2>学生信息</h2>
        <form:form modelAttribute="student">
            学生ID:<form:input path="id"/><br/>
            学生姓名:<form:input path="name"/><br/>
            学生年龄:<form:input path="age"/><br/>
            <input type="submit" value="提交">
        </form:form>

</body>
</html>
