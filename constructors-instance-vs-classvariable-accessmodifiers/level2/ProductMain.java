package level2;

public class ProductMain {

    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 65000);
        Product p2 = new Product("Mouse", 1200);

        p1.displayProductDetails();
        System.out.println();

        p2.displayProductDetails();
        System.out.println();

        Product.displayTotalProducts(); // static method call
    }
}

