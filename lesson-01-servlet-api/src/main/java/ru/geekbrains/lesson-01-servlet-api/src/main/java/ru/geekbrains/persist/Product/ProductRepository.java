package ru.geekbrains.persist.Product;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Component
    public class ProductRepository {
        private final Map<Long, Product> productMap = new ConcurrentHashMap<>();

        private final AtomicLong identity = new AtomicLong(0);

        public List<Product> findAll() {
            return new ArrayList<>(productMap.values());
        }

        public void saveOrUpdate(Product product) {
            if (product.getId() == null) {
                Long id = Long.valueOf((productMap.size() + 1));
                product.setId((long) Math.toIntExact(id));
            }
            productMap.put(product.getId(), product);
        }

        public Product findById(Integer id) { return productMap.get(id); }

        public void deleteById(Integer id) {
            productMap.remove(id);
        }

        public void insert(Product product) {
            long id = identity.incrementAndGet();
            product.setId(id);
            productMap.put(id, product);
        }
}
