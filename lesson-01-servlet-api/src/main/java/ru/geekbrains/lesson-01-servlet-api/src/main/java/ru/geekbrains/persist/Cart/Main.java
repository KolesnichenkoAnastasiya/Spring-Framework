package ru.geekbrains.persist.Cart;
import ru.geekbrains.persist.Cart.CartRepository;
import ru.geekbrains.persist.Product.Product;

public class Main {
    public static void main(String[] args) {
        CartRepository nowCart = new CartRepository();
        nowCart.put(new Product(1l, "Сырники со сметаной и брусничным соусом", 174f));
        nowCart.put(new Product(2l, "Запеканка творожная", 202f));
        nowCart.put(new Product(3l, "Сырники со сгущёнкой", 146.56f));
        System.out.println(nowCart.findAll().toString());
        System.out.println(nowCart.findById(2L));
        nowCart.findById(2L).changePrice(5.0f);
        System.out.println(nowCart.findById(2L));

    }
}
