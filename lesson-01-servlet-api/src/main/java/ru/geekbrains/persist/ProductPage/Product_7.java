package ru.geekbrains.persist.ProductPage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/product/7")
public class Product_7 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter wr = resp.getWriter();
        wr.println("<table>");
        wr.println("<tr>");
        wr.println("<th>Попкорн куриный с двумя соусами\n</th>");
        wr.println("</tr>");
        wr.println("<tr>");
        wr.println("<th> Состав\n</th>");
        wr.println("</tr>");
        wr.println("<tr>");
        wr.println("<th>Попкорн куриный: Попкорн: мясо цыпленка, мука пшеничная, масло растительное, вода питьевая, \n" +
                "крахмал, соль пищевая, сахар, пряности. Кисло-сладкий соус: вода, сахар, чеснок, уксус спиртовой, \n" +
                "соль, перец красный чили дробленый, ксантановая камедь, усилитель вкуса Е627, сорбат калия. \n" +
                "Сырный соус: масло растительное, вода питьевая, желток яичный, сахар, соль, порошок сырный, крахмал \n" +
                "модифицированный, кислота уксусная, сок лимонный, ароматизаторы: куркума и сыр; пектин, краситель \n" +
                "натуральный паприка.\n </th>");
        wr.println("</tr>");
        wr.println("</table>");
    }
}


