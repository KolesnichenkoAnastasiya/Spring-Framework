package ru.geekbrains.persist.Cart;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.geekbrains.persist.Product.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Component
@Scope("prototype")
public class CartRepository {
    private final Map<Long, Product> cartMap = new ConcurrentHashMap<>();

    private final AtomicLong identity = new AtomicLong(0);

    public List<Product> findAll() {
        return new ArrayList<>(cartMap.values());
    }

    public void saveOrUpdate(Product product) {
        if (product.getId() == null) {
            Long id = Long.valueOf((cartMap.size() + 1));
            product.setId((long) Math.toIntExact(id));
        }
        cartMap.put(product.getId(), product);
    }
    public void put (Product product) {
        cartMap.put(product.getId(), product);
    }

    public Product findById(Long id) { return cartMap.get(id); }

    public void deleteById(Integer id) {
        cartMap.remove(id);
    }
}
