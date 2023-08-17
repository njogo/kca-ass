public class Main {
 public static void main(String[] args) {
        UserLogin user = new UserLogin("JohnDoe", "password123");
        user.login();
        user.logout();

        Employee employee = new Employee(1234, "Jane Smith", "Manager");
        Product product = new Product(1, "Apple", 0.99, 50);
        employee.addProduct(product);
        employee.removeProduct(product);

        Customer customer = new Customer(5678, "Alice Johnson", "123 Main St");
        Order order = new Order(1001, customer, new Product[]{product});
        customer.placeOrder(order);
        customer.viewOrderHistory();
    }
}