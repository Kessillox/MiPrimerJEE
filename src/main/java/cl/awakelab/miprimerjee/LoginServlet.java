package cl.awakelab.miprimerjee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String usuario = req.getParameter("usuario");
        String password = req.getParameter("password");

        if("user".equals(usuario)&&"pass".equals(password)){
            HttpSession session = req.getSession();
            session.setAttribute("usuario", usuario);

            Cookie cookie = new Cookie("loginCookkie", "loggedIn");
            cookie.setMaxAge(60*60);
            resp.addCookie(cookie);
            resp.sendRedirect("bienvenida.jsp");
        }
    }
}
