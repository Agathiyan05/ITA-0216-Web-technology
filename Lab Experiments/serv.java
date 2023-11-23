import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Registration Form</title></head><body>");
        out.println("<h2>Registration Form</h2>");
        out.println("<form method=\"post\" action=\"registration\">");
        out.println("  <label for=\"username\">Username:</label>");
        out.println("  <input type=\"text\" id=\"username\" name=\"username\" required><br>");
        out.println("  <label for=\"password\">Password:</label>");
        out.println("  <input type=\"password\" id=\"password\" name=\"password\" required><br>");
        out.println("  <label for=\"email\">Email:</label>");
        out.println("  <input type=\"email\" id=\"email\" name=\"email\" required><br>");
        out.println("  <input type=\"submit\" value=\"Register\">");
        out.println("</form>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Registration Successful</title></head><body>");
        out.println("<h2>Registration Successful</h2>");
        out.println("<p>Username: " + username + "</p>");
        out.println("<p>Password: " + password + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("</body></html>");
    }
}
