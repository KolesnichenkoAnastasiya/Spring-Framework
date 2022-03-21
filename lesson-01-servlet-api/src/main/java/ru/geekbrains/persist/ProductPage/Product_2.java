package ru.geekbrains.persist.ProductPage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/product/2")
public class Product_2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter wr = resp.getWriter();
        wr.println("<table>");
        wr.println("<tr>");
        wr.println("<th>Запеканка творожная\n</th>");
        wr.println("</tr>");
        wr.println("<tr>");
        wr.println("<th> Состав\n</th>");
        wr.println("</tr>");
        wr.println("<tr>");
        wr.println("<th>Основа (масло сливочное 82%, шоколад белый, масло растительное рафинированное дезодорированное,\n" +
                " печенье: (мука пшеничная высшего сорта, масло сливочное 82%, сахар песок, яичный меланж, яичный желток,\n" +
                "разрыхлитель, соль)). Крем для запеканки (яичный желток, сахар песок, творог 9%, сметана 20%, сливки 33%,\n" +
                " соль, мука пшеничная высшего сорта, крахмал картофельный). Соус ягодный (сахар песок, вода, малина с/м\n " +
                "быстрозамороженная)</th>");
        wr.println("</tr>");
        wr.println("</table>");
    }
}


