package level2;

public class CartItem {

    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = 0;
    }

    public void addItem(int qty) {
        if (qty > 0) {
            quantity += qty;
            System.out.println(qty + " items added.");
        }
    }

    public void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " items removed.");
        } else {
            System.out.println("Not enough items to remove.");
        }
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public void displayTotalCost() {
        System.out.println("Item       : " + itemName);
        System.out.println("Quantity   : " + quantity);
        System.out.println("Total Cost : " + getTotalCost());
    }
}

