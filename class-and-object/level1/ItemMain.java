package level1;

public class ItemMain {
    public static void main(String[] args) {

        Item item = new Item(101, "Keyboard", 750.0);

        item.displayItemDetails();

        int quantity = 3;
        System.out.println("Quantity  : " + quantity);
        System.out.println("Total Cost: " + item.calculateTotalCost(quantity));
    }
}

