package ru.geekbrains.persist.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.geekbrains.persist.Product.Product;
import ru.geekbrains.persist.Product.ProductRepository;
import ru.geekbrains.persist.Config.SpringConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/product/*")

public class ProductServlet extends HttpServlet{

        public static ProductRepository productRepository;

        public void init() throws ServletException {
            AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
            ctx.register(SpringConfig.class);
            ctx.refresh();
            productRepository = (ProductRepository) ctx.getBean("product");
        }

        protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String urlProduct = "localhost:8080" + req.getContextPath() + req.getServletPath() + "/";
            PrintWriter wr = resp.getWriter();
            wr.println("<table>");
            wr.println("<tr>");
            wr.println("<th>Id</th>");
            wr.println("<th>Product</th>");
            wr.println("<th>Cost</th>");
            wr.println("</tr>");

            for(Product product : productRepository.findAll()) {
                String urlProductNow = urlProduct + product.getId();
                wr.println("<tr>");
                wr.println("<td><a href=" + req.getContextPath() + req.getServletPath() + "/" + product.getId() + ">" + product.getId() +"</a></td>");
                wr.println("<td>" + product.getTitle() + "</td>");
                wr.println("<td>" + product.getCost() + "</td>");
                wr.println("</tr>");
            }
            wr.println("</table>");
        }
}

