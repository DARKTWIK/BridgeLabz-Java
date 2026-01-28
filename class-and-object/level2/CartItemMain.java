package level2;

public class CartItemMain {
    public static void main(String[] args) {

        CartItem item = new CartItem("Laptop", 55000);

        item.addItem(2);
        item.removeItem(1);
        item.displayTotalCost();
    }
}

