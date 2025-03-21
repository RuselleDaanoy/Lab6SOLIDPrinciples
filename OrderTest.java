public class OrderTest {
    public static void main(String[] args) {

        OrderInfo totalCalculator = new OrderProcess();
        OrderPlace orderPlacer = new OrderProcess();
        InvoiceReports invoiceGenerator = new InvoiceEmailService();
        EmailNotifications emailNotifier = new InvoiceEmailService();
        Order order = new Order(totalCalculator, orderPlacer, invoiceGenerator, emailNotifier);

        order.processOrder(10.0, 2, "John Doe", "123 Main St", "order_123.pdf", "johndoe@example.com");
    }
}

