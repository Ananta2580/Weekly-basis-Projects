<%@page import="com.java.lib.model.Books"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search and Issue Books</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f7fa;
        margin: 0;
        padding: 40px;
    }

    .container {
        max-width: 900px;
        margin: auto;
        background-color: #ffffff;
        padding: 30px;
        border-radius: 10px;
        box-shadow: 0px 4px 12px rgba(0, 0, 0, 0.1);
    }

    h2 {
        text-align: center;
        color: #2c3e50;
        margin-bottom: 20px;
    }

    form {
        margin-top: 20px;
    }

    table {
        width: 100%;
        border-collapse: collapse;
        margin: 20px 0;
    }

    table, th, td {
        border: 1px solid #ddd;
    }

    th, td {
        padding: 12px;
        text-align: center;
    }

    th {
        background-color: #3498db;
        color: white;
    }

    tr:nth-child(even) {
        background-color: #f2f2f2;
    }

    tr:hover {
        background-color: #e6f2ff;
    }

    input[type="checkbox"] {
        width: 20px;
        height: 20px;
    }

    input[type="submit"] {
        background-color: #3498db;
        color: white;
        padding: 10px 20px;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        font-size: 16px;
        width: 100%;
        margin-top: 20px;
    }

    input[type="submit"]:hover {
        background-color: #2980b9;
    }

</style>

</head>
<body>

<jsp:include page="Menu.jsp" />

<jsp:useBean id="libraryDao" class="com.java.lib.dao.LibraryDaoImpl" />
<%
    String searchType = request.getParameter("searchtype");
    String searchValue = request.getParameter("searchvalue");
    List<Books> booksList = libraryDao.searchBooks(searchType, searchValue);
%>

<div class="container">
    <h2>Search and Issue Books</h2>
    <form action="Issue.jsp">
        <table>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Author</th>
                <th>Edition</th>
                <th>Department</th>
                <th>Total Books</th>
                <th>Select</th>
            </tr>
            <%
                for (Books book : booksList) {
                    int btotal = book.getNoOfBooks();
            %>
            <tr>
                <td><%=book.getId() %></td>
                <td><%=book.getName() %></td>
                <td><%=book.getAuthor() %></td>
                <td><%=book.getEdition() %></td>
                <td><%=book.getDept() %></td>
                <td><%=book.getNoOfBooks() %></td>
                <td>
                    <%
                        if (btotal > 0) {
                    %>
                    <input type="checkbox" name="bookid" value="<%=book.getId() %>">
                    <%
                        }
                    %>
                </td>
            </tr>
            <%
                }
            %>
        </table>
        <input type="submit" value="Issue Book(s)" />
    </form>
</div>

</body>
</html>
