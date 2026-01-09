package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String u = req.getParameter("username");
        String p = req.getParameter("password");

        String context = req.getContextPath(); // IMPORTANT

        if ("kajal".equals(u) && "kajal@123".equals(p)) {
            res.sendRedirect(context + "/addStudent.jsp");
        } else {
            res.sendRedirect(context + "/login.jsp");
        }
    }
}
