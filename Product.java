public class Product {
    private int productId;
    private String name;
    private double price;
    private int quantity;

    public Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void updateQuantity(int newQuantity) {
        this.quantity = newQuantity; // Set the new quantity provided as the argument
    }

    public static void main(String[] args) {
        // Create a new Product instance
        Product apple = new Product(1, "Apple", 0.99, 50);

        // Display the initial quantity
        System.out.println("Initial Quantity: " + apple.getQuantity());

        // Update the quantity
        apple.updateQuantity(30);

        // Display the updated quantity
        System.out.println("Updated Quantity: " + apple.getQuantity());
    }
}
