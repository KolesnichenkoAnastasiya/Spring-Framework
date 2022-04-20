package ru.geekbrains.persist.Product.ProductPage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/product/5")
public class Product_5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter wr = resp.getWriter();
        wr.println("<table>");
        wr.println("<tr>");
        wr.println("<th>Каша из полбы на кокосовом молоке\n</th>");
        wr.println("</tr>");
        wr.println("<tr>");
        wr.println("<th> Состав\n</th>");
        wr.println("</tr>");
        wr.println("<tr>");
        wr.println("<th>Полба крупа, кокосовое молоко: (перераьотанная мякоть кокосового ореха 70%, \n" +
                "вода питьевая 29,99%. ), вода питьевая, соль пищевая, сахар песок, курага, чернослив, \n" +
                "изюм.\n </th>");
        wr.println("</tr>");
        wr.println("</table>");
    }
}


