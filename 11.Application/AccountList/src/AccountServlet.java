import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/AccountServlet")
public class AccountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Truy vấn dữ liệu từ DB
        List<Account> list = DBUtils.queryAccounts();
        //Lưu dữ liệu vào thuộc tính "accounts" của request
        request.setAttribute("accounts", list);
        //Tạo đối tượng dispatcher để chuyển tiếp yêu cầu tới index.jsp
        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        //Chuyển tiếp yêu cầu , để hiển thị dữ liệu lên trang jsp
        dispatcher.forward(request, response);
    }
}
