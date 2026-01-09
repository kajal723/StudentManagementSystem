package dao;

import java.sql.*;
import java.util.*;
import model.Student;

public class StudentDAO {
    private String url = "jdbc:mysql://localhost:3306/student_db";
    private String user = "root";
    private String pass = "password";

    private Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, user, pass);
    }

    public List<Student> getAllStudents() throws Exception {
        List<Student> list = new ArrayList<>();
        Connection con = getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM students");
        while (rs.next()) {
            list.add(new Student(rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("course")));
        }
        con.close();
        return list;
    }

    public void addStudent(Student s) throws Exception {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO students(name,email,course) VALUES(?,?,?)");
        ps.setString(1, s.getName());
        ps.setString(2, s.getEmail());
        ps.setString(3, s.getCourse());
        ps.executeUpdate();
        con.close();
    }

    public void updateStudent(Student s) throws Exception {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement(
            "UPDATE students SET name=?, email=?, course=? WHERE id=?");
        ps.setString(1, s.getName());
        ps.setString(2, s.getEmail());
        ps.setString(3, s.getCourse());
        ps.setInt(4, s.getId());
        ps.executeUpdate();
        con.close();
    }

    public void deleteStudent(int id) throws Exception {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement(
            "DELETE FROM students WHERE id=?");
        ps.setInt(1, id);
        ps.executeUpdate();
        con.close();
    }
}
