package ru.geekbrains.persist.ProductPage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/product/4")
public class Product_4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter wr = resp.getWriter();
        wr.println("<table>");
        wr.println("<tr>");
        wr.println("<th>Каша рисовая на молоке с персиками, орехами и кокосом\n</th>");
        wr.println("</tr>");
        wr.println("<tr>");
        wr.println("<th> Состав\n</th>");
        wr.println("</tr>");
        wr.println("<tr>");
        wr.println("<th> Каша рисовая: (молоко 3.2%, вода питьевая, рис, соль пищевая, крахмал картофельный, масло \n" +
                "сливочное 82,5%, сахар песок), персик консервированный: (персик, вода питьевая, сахар песок, лимонная\n " +
                "кислота.), арахис, кокосовая стружка сухая.\n </th>");
        wr.println("</tr>");
        wr.println("</table>");
    }
}


