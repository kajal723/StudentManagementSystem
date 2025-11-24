package web;

import model.Student;
import dao.StudentDAOImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {
    private final StudentDAOImpl dao = new StudentDAOImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        try {
            String name = req.getParameter("name");
            int age = Integer.parseInt(req.getParameter("age"));
            String course = req.getParameter("course");
            String email = req.getParameter("email");
            Student s = new Student(name, age, course, email);
            dao.addStudent(s);
            resp.getWriter().write("OK");
        } catch (Exception e) {
            resp.getWriter().write("ERROR: " + e.getMessage());
        }
    }
}
