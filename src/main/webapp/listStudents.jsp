<%@ page import="java.util.*, model.Student" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student List</title>
</head>
<body>
<h2>Student List</h2>

<table border="1">
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Email</th>
    <th>Course</th>
</tr>

<%
List<Student> list = (List<Student>) request.getAttribute("students");
if(list != null){
    for(Student s : list){
%>
<tr>
    <td><%= s.getId() %></td>
    <td><%= s.getName() %></td>
    <td><%= s.getEmail() %></td>
    <td><%= s.getCourse() %></td>
</tr>
<%
    }
}
%>
</table>

</body>
</html>
