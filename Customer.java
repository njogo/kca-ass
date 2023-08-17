public class Customer {
    private int customerId;
    private String name;
    private String address;

    public Customer(int customerId, String name, String address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
    }

    public void placeOrder(Order order) {
        System.out.println(name + " placed an order with ID: " + order.getOrderId());
    }

    public void viewOrderHistory() {
        System.out.println(name + " is viewing order history.");
    }

    public static void main(String[] args) {
        // Code to be executed when running the program using the Customer class.
        // You can create instances of Customer and interact with its methods here.

        // Example usage:
        Customer customer = new Customer(5678, "Alice Johnson", "123 Main St");
        Product product = new Product(1, "Apple", 0.99, 50);
        Order order = new Order(1001, customer, new Product[] { product });

        customer.placeOrder(order);
        customer.viewOrderHistory();
    }
}
