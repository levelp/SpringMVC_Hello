<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Мой первый MVC проект</title>
</head>
<body>
<h1>Мой первый MVC проект</h1>


<table border="1">
    <% for (int i = 1; i <= 10; i++) { %>
    <tr>
        <% for (int j = 1; j <= 10; j++) { %>
        <td>
            <%=i * j%>
        </td>
        <% } %>
    </tr>
    <% } %>
</table>

</body>
</html>
