import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet",urlPatterns = "/calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       Float firstNumber = Float.parseFloat(request.getParameter("first"));
       Float secondNumber = Float.parseFloat(request.getParameter("second"));
       String operator = request.getParameter("operator");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        switch (operator) {
            case "Addition": {
                Float addition = firstNumber + secondNumber;
                writer.println("<h1> Resulf:"+"<br>" +firstNumber+" + "+secondNumber+" = " + addition + "</h1>");
                break;
            }
            case "Subtraction":{
                Float subtraction = firstNumber- secondNumber;
                writer.println("<h1> Resulf:" +"<br>"+firstNumber+" - "+secondNumber+" = "+ subtraction + "</h1>");
                break;
            }
            case "Division": {
                Float division = firstNumber/secondNumber;
                writer.println("<h1> Resulf:"+"<br>"+firstNumber+" / "+secondNumber+" = " + division + "</h1>");
                break;
            }
            case "Multiplication":{
                Float multiplication = firstNumber*secondNumber;
                writer.println("<h1> Resulf: "+"<br>" +firstNumber+" * "+secondNumber+" = "+ multiplication + "</h1>");
                break;

            }
            default:
                writer.println("<h1> NOT FIND:</h1>");
                break;


        }
        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
