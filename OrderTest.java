public class OrderTest {
    public static void main(String[] args) {
        // Creating an order with appropriate dependencies
        OrderInfo totalCalculator = new OrderProcess();
        OrderPlace orderPlacer = new OrderProcess();
        InvoiceReports invoiceGenerator = new InvoiceEmailService();
        EmailNotifications emailNotifier = new InvoiceEmailService();
        Order order = new Order(totalCalculator, orderPlacer, invoiceGenerator, emailNotifier);

        // Processing the order
        order.processOrder(10.0, 2, "John Doe", "123 Main St", "order_123.pdf", "johndoe@example.com");
    }
}
