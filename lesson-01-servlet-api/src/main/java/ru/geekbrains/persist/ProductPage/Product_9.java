package ru.geekbrains.persist.ProductPage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/product/9")
public class Product_9 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter wr = resp.getWriter();
        wr.println("<table>");
        wr.println("<tr>");
        wr.println("<th>Наггетсы с соусом барбекю большая порция\n</th>");
        wr.println("</tr>");
        wr.println("<tr>");
        wr.println("<th> Состав\n</th>");
        wr.println("</tr>");
        wr.println("<tr>");
        wr.println("<th>Наггетсы: мясо бескостное кусковое цыплят-бройлеров, вода питьевая, панировочная смесь \n" +
                "(мука кукурузная, мука пшеничная, загустители, соль, крахмал пшеничный, разрыхлители, декстроза, \n" +
                "сахар, белый перец), мясо цыплят-бройлеров, кожа цыплят-бройлеров, панировочная смесь (мука пшеничная, \n" +
                "мука кукурузная, соль, разрыхлители, черный перец. Соус барбекю.\n </th>");
        wr.println("</tr>");
        wr.println("</table>");
    }
}


