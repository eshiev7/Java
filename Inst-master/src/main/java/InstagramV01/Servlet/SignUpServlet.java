package InstagramV01.Servlet;

import InstagramV01.Interface.ResourceWriter;
import InstagramV01.WorkClasses.DBWriter;
import InstagramV01.WorkClasses.User;
import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

public class SignUpServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userLogin = request.getParameter("login");
        String userName = request.getParameter("name");
        String userPassword = request.getParameter("password");
        User user = new User(userLogin, userName, userPassword);
        ResourceWriter dbWriter = new DBWriter();
        dbWriter.saveNewUser(user);
        response.sendRedirect(request.getContextPath() + "/signin.jsp");
    }
}
