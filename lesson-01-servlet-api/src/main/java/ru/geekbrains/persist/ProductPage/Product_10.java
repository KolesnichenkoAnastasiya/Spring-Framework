package ru.geekbrains.persist.ProductPage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/product/10")
public class Product_10 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter wr = resp.getWriter();
        wr.println("<table>");
        wr.println("<tr>");
        wr.println("<th>Попкорн куриный с картофелем фри и кисло-сладким соусом\n</th>");
        wr.println("</tr>");
        wr.println("<tr>");
        wr.println("<th> Состав\n</th>");
        wr.println("</tr>");
        wr.println("<tr>");
        wr.println("<th>Попкорн: мясо цыплёнка, мука пшеничная, масло растительное, вода питьевая, крахмал, \n" +
                "соль пищевая, сахар, пряности. Картофель фри: картофель, панировка (загустители (E1412, E1414), \n" +
                "рисовая мука, декстрин, разрыхлители (E450, E500), мальтодекстрин, загуститель E415), масло \n" +
                "подсолнечное с добавлением рапсового, соль, декстроза моногидрат, стабилизатор E450i. Кисло-сладкий \n" +
                "соус: вода, сахар, чеснок, уксус спиртовой, соль, перец красный чили дробленый, ксантановая камедь, \n" +
                "усилитель вкуса E627, сорбат калия.\n </th>");
        wr.println("</tr>");
        wr.println("</table>");
    }
}


