<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Мой первый MVC проект</title>
</head>
<body>
<h1>Таблица умножения размера ${size}</h1>


<table border="1">

    <%
        Object table = request.getAttribute("table");
        for (int[] data : (int[][]) table) { %>
    <tr>
        <% for (int x : data) { %>
        <td>
            <%=x%>
        </td>
        <% } %>
    </tr>
    <% } %>
</table>

</body>
</html>