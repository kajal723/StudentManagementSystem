<!DOCTYPE html>
<html>
<head>
    <title>Add Student</title>
</head>
<body>
<h2>Add Student</h2>

<form action="add" method="post">
    Name: <input type="text" name="name" required><br><br>
    Email: <input type="email" name="email" required><br><br>
    Course: <input type="text" name="course" required><br><br>
    <input type="submit" value="Add Student">
</form>

<a href="listStudents.jsp">View Students</a>
</body>
</html>
