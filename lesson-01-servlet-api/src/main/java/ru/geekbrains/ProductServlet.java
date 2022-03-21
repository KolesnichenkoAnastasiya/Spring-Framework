package ru.geekbrains;
import ru.geekbrains.persist.Product;
import ru.geekbrains.persist.ProductRepository;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

    @WebServlet(urlPatterns = "/product/*")
    public class ProductServlet extends HttpServlet {

        private ProductRepository productRepository;

        @Override
        public void init() throws ServletException {
            this.productRepository = new ProductRepository();
            this.productRepository.insert(new Product("Сырники со сметаной и брусничным соусом", 174));
            this.productRepository.insert(new Product("Запеканка творожная", 202));
            this.productRepository.insert(new Product("Сырники со сгущёнкой", 146));
            this.productRepository.insert(new Product("Каша рисовая на молоке с персиками, орехами и кокосом", 146));
            this.productRepository.insert(new Product("Каша из полбы на кокосовом молоке", 160));
            this.productRepository.insert(new Product("Картофель фри с рыбными палочками и соусом тартар", 223));
            this.productRepository.insert(new Product("Попкорн куриный с двумя соусами", 216));
            this.productRepository.insert(new Product("Наггетсы с фри и сырным соусом", 251));
            this.productRepository.insert(new Product("Наггетсы с соусом барбекю большая порция", 223));
            this.productRepository.insert(new Product("Попкорн куриный с картофелем фри и кисло-сладким соусом", 209));
        }

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
//                wr.println("<td>" + urlProductNow  + "</td>");
                wr.println("</tr>");
            }
            wr.println("</table>");
        }
    }
