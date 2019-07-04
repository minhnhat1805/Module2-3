package controller;

import model.Product;
import service.ProductServerImpl;
import service.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {
    public ProductService productService = new ProductServerImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String action = request.getParameter("action");
     if (action == null){
         action ="";
     }
     switch (action){
         case "create":
             break;
         case "edit":
             break;
         case "delete":
             break;
         default:
             break;
     }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action = request.getParameter("action");

    if (action==null){
        action = "";
    }
    switch (action){
        case "create":
            break;
        case  "edit":
            break;
        case "delete":
            break;
        case "view":
            break;
        default:
            listProducts(request,response);
            break;
        }
    }
    private void listProducts(HttpServletRequest request, HttpServletResponse response){
        List<Product> products = this.productService.findAll();
        request.setAttribute("products",products);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
