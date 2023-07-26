package cl.awakelab.miprimerjee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/adiosServlet")
public class AdiosServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("!DOCTYPE html");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\"/>\n" +
                "      <title>Título de la web</title>");
        out.println("</head>");
        out.println("<body style=\"color: aqua; background-color:black\">");
        out.println("Este es el mejor cursito de java");
        out.println("</body>");
        out.println("</html>");
    }
}
