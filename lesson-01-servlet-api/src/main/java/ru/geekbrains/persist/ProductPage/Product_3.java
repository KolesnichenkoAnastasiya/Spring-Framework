package ru.geekbrains.persist.ProductPage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/product/3")
public class Product_3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter wr = resp.getWriter();
        wr.println("<table>");
        wr.println("<tr>");
        wr.println("<th>Сырники со сгущёнкой\n</th>");
        wr.println("</tr>");
        wr.println("<tr>");
        wr.println("<th> Состав\n</th>");
        wr.println("</tr>");
        wr.println("<tr>");
        wr.println("<th> Продукт творожный: обезжиренное молоко, стабилизатор, консервант, закваска чистых культур \n" +
                "молочнокислых микроорганизмов, мука пшеничная высшего сорта, меланж яичный пастеризованный, сахар, \n" +
                "ванильный сахар. Сгущенное молоко.\n </th>");
        wr.println("</tr>");
        wr.println("</table>");
    }
}


