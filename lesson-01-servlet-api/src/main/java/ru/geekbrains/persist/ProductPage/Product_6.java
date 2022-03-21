package ru.geekbrains.persist.ProductPage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/product/6")
public class Product_6 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter wr = resp.getWriter();
        wr.println("<table>");
        wr.println("<tr>");
        wr.println("<th>Картофель фри с рыбными палочками и соусом тартар\n</th>");
        wr.println("</tr>");
        wr.println("<tr>");
        wr.println("<th> Состав\n</th>");
        wr.println("</tr>");
        wr.println("<tr>");
        wr.println("<th>Картофель: картофель, панировка (загустители (Е1412, Е1414), рисовая мука, декстрин, \n" +
                "разрыхлители (Е450, Е500), мальтодекстрин, загуститель Е415), масло подсолнечное с добавлением \n" +
                "рапсового, соль, декстроза моногидрат, стабилизатор E450i. Рыбные палочки: филе минтая, сухари \n" +
                "панировочные (сухарная крошка (пшеничная мука, соль, дрожжи), пшеничная мука), вода, смесь \n" +
                "панировочная (пшеничная мука, рисовая мука, рисовый крахмал, соль, пшеничный крахмал, сахар, \n" +
                "разрыхлители (Е 450i, Е 500ii), сывороточный порошок, специи (содержат горчицу)), рапсовое масло, \n" +
                "смесь панировочная (пшеничная мука, пшеничный крахмал, сахар, соль, разрыхлители (Е 450i, Е 500ii)). \n" +
                " Соус тартар: майонез, огурцы маринованные, укроп св., вода питьевая, соус табаско, концентрат " +
                "лимонного сока, соль.\n </th>");
        wr.println("</tr>");
        wr.println("</table>");
    }
}


