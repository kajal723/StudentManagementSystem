<!DOCTYPE html>
<html>
<head>
    <title>Update Student</title>
</head>
<body>
<h2>Update Student</h2>

<form action="update" method="post">
    <input type="hidden" name="id" value="${student.id}">
    Name: <input type="text" name="name" value="${student.name}"><br><br>
    Email: <input type="email" name="email" value="${student.email}"><br><br>
    Course: <input type="text" name="course" value="${student.course}"><br><br>
    <input type="submit" value="Update Student">
</form>

</body>
</html>
