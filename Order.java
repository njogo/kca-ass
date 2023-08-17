import java.util.Date;

public class Order {
    private int orderId;
    private Customer customer;
    private Product[] products;
    private Date orderDate;

    public Order(int orderId, Customer customer, Product[] products) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = products;
        this.orderDate = new Date();
    }

    public int getOrderId() {
        return orderId;
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Product product : products) {
            totalCost += product.getPrice() * product.getQuantity();
        }
        return totalCost; // Return the calculated total cost
    }

    public void confirmPayment(Payment payment) {
        System.out.println("Order " + orderId +  " Your Order is confirmed." + products + orderDate);
        // You can implement the logic to link the payment to this order.
    }

    public static void main(String[] args) {
        // Creating a Customer instance
        Customer customer = new Customer(1, "John Doe", "123 Main St");

        // Creating Product instances
        Product apple = new Product(1, "Apple", 0.99, 10);
        Product banana = new Product(2, "Banana", 0.75, 8);
        Product orange = new Product(3, "Orange", 1.25, 5);

        // Creating an array of products for the order
        Product[] products = { apple, banana, orange };

        // Creating an Order instance
        Order order = new Order(1001, customer, products);

        // Calculate total cost of the order
        double totalCost = order.calculateTotalCost();

        // Create a Payment instance
       Payment payment = new Payment(12345, totalCost, new Date());

        // Confirm payment for the order
        order.confirmPayment(payment);
    }
}

