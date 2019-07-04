import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description  = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        float ratio = (Float.parseFloat(request.getParameter("ratio")))/100;

        double discount = price*ratio;

        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        writer.println("<h1>Description: "+description+"</h1>");
        writer.println("<h1>Discount:"+discount+"</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
