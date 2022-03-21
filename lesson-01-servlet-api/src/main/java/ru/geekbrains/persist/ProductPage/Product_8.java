package ru.geekbrains.persist.ProductPage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/product/8")
public class Product_8 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter wr = resp.getWriter();
        wr.println("<table>");
        wr.println("<tr>");
        wr.println("<th>Наггетсы с фри и сырным соусом\n</th>");
        wr.println("</tr>");
        wr.println("<tr>");
        wr.println("<th> Состав\n</th>");
        wr.println("</tr>");
        wr.println("<tr>");
        wr.println("<th>Наггетсы: мясо бескостное кусковое цыплят-бройлеров, вода питьевая, панировочная смесь \n" +
                "(мука кукурузная, мука пшеничная, загустители, соль, крахмал пшеничный, разрыхлители, декстроза, \n" +
                "сахар, белый перец), мясо цыплят-бройлеров, кожа цыплят-бройлеров, панировочная смесь (мука пшеничная, \n" +
                " мука кукурузная, соль, разрыхлители, черный перец. Картофель фри: картофель, панировка (загустители \n" +
                "(Е1412, Е1414), рисовая мука, декстрин, разрыхлители (Е450, Е500), мальтодекстрин, загуститель Е415), \n" +
                "масло подсолнечное с добавлением рапсового, соль, декстроза моногидрат, стабилизатор. Сырный соус: вода, \n" +
                " масло подсолнечное рафинированное дезодорированное, (содержит уплотнитель Е509), продукты яичные, \n" +
                "загустители (Е1422, Е415), сахар, соль, регулятор кислотности Е260, ароматизатор натуральный, сок лимонный \n" +
                "концентрированный, консервант Е202, красители (Е100, Е160с), антиокислитель.\n </th>");
        wr.println("</tr>");
        wr.println("</table>");
    }
}


