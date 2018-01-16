<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd"><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP List Users Records</title>
</head>
<body>
    <sql:setDataSource
        var="myDS"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost/library"
        user="root" password="mysql"
    />
     
    <sql:query var="listUsers"   dataSource="${myDS}">
        SELECT * FROM books;
    </sql:query>
     
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Books</h2></caption>
            <tr>
                <th>BookID</th>
                <th>BookName</th>
                <th>BookCount</th>
            </tr>
            <c:forEach var="books" items="${listUsers.rows}">
                <tr onclick="selectRow(this)">
                    <td><c:out value="${books.BookId}" /></td>
                    <td><c:out value="${books.BookName}" /></td>
                    <td><c:out value="${books.BooksCount}" /></td>
                </tr>
            </c:forEach>
        </table>
        <br>
        <form method="post" action="AddBooks">
        <table>
        <tr>
                <th>BookID</th>           
                <th>BookName</th>              
                <th>BookCount</th>
                
            </tr>
         <tr>
                  <td><input type="text" name="bookId"></td>
                   <td><input type="text" name="bookName"></td>
                  <td><input type="text" name="bookCount"></td>
                </tr>
                <tr><td></td><td><input type="submit" value="ADD"></td></tr>
                </table>
                </form>
       
        <p id="demo"></p>
        <script>
function myFunction() {
    document.getElementById("demo").innerHTML = "Sucessfully Done";
}
function selectRow(row) {
	if(row.style.backgroundColor!="red")
    	row.style.backgroundColor="red";
	else
		row.style.backgroundColor="white";
}
</script>
    </div>
</body>
</html>