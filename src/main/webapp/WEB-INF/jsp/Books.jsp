<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="trth" uri="http://java.sun.com/jsp/jstl/core" %>
<?xml version="1.0" encoding="UTF-8"?>
<root xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:c="http://java.sun.com/jsp/jstl/core" version="2.0">
    <%@page contentType="text/html" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="en">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!— Bootstrap CSS —>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <body>
    <h1> Books ${version}</h1>
         <table>
            <thread>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                </tr>
            </thread>
             <tbody>
             <%--<c:forEach var="book" items="${books}">--%>
                 <%--<tr>--%>
                     <%--<td> ${book.id}</td>--%>
                     <%--<td style="padding-left: 15px" align="left">${book.name}</td>--%>
                 <%--</tr>--%>
             <%--</c:forEach>--%>

             <c:forEach var="book" items="${books}">
                 <tr>
                     <td> ${book.id}</td>
                     <td style="padding-left: 15px" align="left"><a href="/authors?bookId=${book.id}">${book.name}</a> </td>
                     <td><a class="btn btn-warning" href="/UpdateBook?bookId=${book.id}">Update</a></td>
                     <td><a class="btn btn-danger" href="/Delete?bookId=${book.id}">Delete</a></td>
                 </tr>
             </c:forEach>
             <tr>
                 <td><a class="btn btn-primary" href="/AddBookForm">Add new book</a></td>
             </tr>

                 <%--<tr th:forEach="book : ${books}">--%>
                     <%--<td th:text="${book.id}"></td>--%>
                     <%--<td th:text="${book.name}"></td>--%>
                 <%--</tr>--%>
            </tbody>
        </table>
     </body>
    </html>
</root>