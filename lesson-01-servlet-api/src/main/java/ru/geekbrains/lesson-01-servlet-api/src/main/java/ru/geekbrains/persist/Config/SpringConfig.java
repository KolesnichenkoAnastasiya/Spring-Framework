package ru.geekbrains.persist.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import ru.geekbrains.persist.Cart.CartRepository;
import ru.geekbrains.persist.Product.Product;
import ru.geekbrains.persist.Product.ProductRepository;

@Configuration
public class SpringConfig {
    private ProductRepository productRepository;
    private CartRepository cartRepository;

    @Bean (name="product")
    @Lazy (value = true)
    public ProductRepository getProductRep (){
            this.productRepository = new ProductRepository();
            this.productRepository.insert(new Product(1l,"Сырники со сметаной и брусничным соусом", 174f));
            this.productRepository.insert(new Product(2l, "Запеканка творожная", 202f));
            this.productRepository.insert(new Product(3l, "Сырники со сгущёнкой", 146.56f));
            this.productRepository.insert(new Product(4l,"Каша рисовая на молоке с персиками, орехами и кокосом", 146.5f));
            this.productRepository.insert(new Product(5l,"Каша из полбы на кокосовом молоке", 160.25f));
            return productRepository;
        }
}
