package ru.geekbrains.persist.ProductPage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/product/1")
public class Product_1 extends HttpServlet {
@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      PrintWriter wr = resp.getWriter();
        wr.println("<table>");
        wr.println("<tr>");
        wr.println("<th>Сырники со сметаной и брусничным соусом\n</th>");
        wr.println("</tr>");
        wr.println("<tr>");
        wr.println("<th> Состав\n</th>");
        wr.println("</tr>");
        wr.println("<tr>");
        wr.println("<th> Сырники: продукт творожный: обезжиренное молоко, стабилизатор, консервант, закваска чистых культур \n" +
                "молочнокислых микроорганизмов, мука пшеничная высшего сорта, меланж яичный пастеризованный, сахар, ванильный \n" +
                "сахар. Сметана с м.д.ж 20%. Соус брусничный: вино красное сух., брусника с/м, сахар-песок, соус деми-глас, вода,\n" +
                " соус карамельный (вода, сахар-песок, имбирь корень св., чеснок св., концентрат лимонного сока, соус табаско, соус\n" +
                " соевый), крахмал кукурузный, вода. Сахарная пудра.\n </th>");
        wr.println("</tr>");
        wr.println("</table>");
    }
}

