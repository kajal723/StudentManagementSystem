# 🎓 Student Management System

A full-stack **Student Management System** web application developed using **Java Servlets, JSP, JDBC, and MySQL**, deployed on **Apache Tomcat 10.1**.

This project demonstrates **CRUD operations**, authentication, and database connectivity using standard Java EE (Jakarta EE) technologies.

---

## 📌 Features

- 🔐 Admin Login Authentication
- ➕ Add Student Details
- 📋 View All Students
- ✏️ Update Student Information
- ❌ Delete Student Records
- 🗄️ MySQL Database Integration
- 🧩 MVC Architecture (Model–View–Controller)

---

## 🛠️ Technologies Used

| Technology | Description |
|---------|------------|
| Java (JDK 21) | Core programming language |
| JSP | View layer |
| Java Servlets (Jakarta) | Controller layer |
| JDBC | Database connectivity |
| MySQL | Backend database |
| Apache Tomcat 10.1 | Web server |
| Git & GitHub | Version control |

---

## 🏗️ Project Architecture (MVC)

View (JSP) → Controller (Servlets) → Model (JDBC + MySQL)


- **Model**: MySQL database + DAO classes  
- **View**: JSP pages  
- **Controller**: Servlets  

---

## 📁 Project Structure



StudentManagementSystem
│
├── src/main/java
│ ├── servlet
│ │ ├── LoginServlet.java
│ │ ├── AddStudentServlet.java
│ │ ├── UpdateStudentServlet.java
│ │ └── DeleteStudentServlet.java
│ │
│ ├── dao
│ │ └── StudentDAO.java
│ │
│ ├── model
│ │ └── Student.java
│ │
│ └── util
│ └── DBUtil.java
│
├── src/main/webapp
│ ├── login.jsp
│ ├── addStudent.jsp
│ ├── listStudents.jsp
│ └── updateStudent.jsp
│
└── README.md


---


⚙️ How to Run the Project
1️⃣ Prerequisites

Java JDK 21

Apache Tomcat 10.1

MySQL & MySQL Workbench

MySQL Connector/J (JDBC driver)

2️⃣ Configure Database

Update database credentials in DBUtil.java

jdbc:mysql://localhost:3306/studentdb
username: root
password: your_password

3️⃣ Add JDBC Driver

Copy:

mysql-connector-j-*.jar


Into:

tomcat/lib/

4️⃣ Deploy Project

Place project folder inside:

tomcat/webapps/

5️⃣ Compile Servlets
javac -cp "tomcat/lib/*" -d "WEB-INF/classes" ServletName.java

6️⃣ Start Tomcat
catalina.bat run

7️⃣ Open in Browser
http://localhost:8080/StudentManagementSystem/login.jsp

🔑 Login Credentials
Username: admin
Password: admin123


(Can be modified in LoginServlet.java)

🚀 Future Enhancements

Bootstrap-based UI

Session management & logout

Search and pagination

Role-based authentication

Cloud deployment

🎓 Academic Use

This project is suitable for:

Mini projects

College assignments

Java web development practice

Viva & lab examinations

👤 Author

Kajal Shah
GitHub: https://github.com/kajal723
