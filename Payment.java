import java.util.Date;

public class Payment {
    private int paymentId;
    private double amount;
    private Date paymentDate;

    public Payment(int paymentId, double amount, Date paymentDate) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    public void processPayment() {
        System.out.println("Processing payment...");
        // Add any payment processing logic here
        System.out.println("Payment processed successfully! Thank for Shopping with Us");
    }

    public void getPaymentDetails() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Amount: $" + amount);
        System.out.println("Payment Date: " + paymentDate);
    }

    public static void main(String[] args) {
        // Creating a Payment instance
        Payment payment = new Payment(156, 2000.0, new Date());

        // Call the processPayment method
        payment.processPayment();

        // Display the payment details
        payment.getPaymentDetails();
    }
}