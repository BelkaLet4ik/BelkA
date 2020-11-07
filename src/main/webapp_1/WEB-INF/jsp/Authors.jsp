<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="trth" uri="http://java.sun.com/jsp/jstl/core" %>
<?xml version="1.0" encoding="UTF-8"?>
<root xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:c="http://java.sun.com/jsp/jstl/core" version="2.0">
    <%@page contentType="text/html" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="en">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <body>
    <h1> The authors of the book:</h1>
    <table>
        <tr>
            <tbody>
            <c:forEach var="author" items="${authorList}">
                <tr>
                    <td style="padding-left: 15px" align="left">${author.name}</td>
                </tr>
            </c:forEach>
            </tbody>
        </tr>
    </table>