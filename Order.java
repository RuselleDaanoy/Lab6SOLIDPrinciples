public class Order {
        OrderInfo infoOrder;
        OrderPlace orderPlacer;
        InvoiceReports invoiceGenerator;
        EmailNotifications emailNotifier;

    public Order(OrderInfo infoOrder, OrderPlace orderPlacer, InvoiceReports invoiceGenerator, EmailNotifications emailNotifier) {
        this.infoOrder = infoOrder;
        this.orderPlacer = orderPlacer;
        this.invoiceGenerator = invoiceGenerator;
        this.emailNotifier = emailNotifier;
    }

    public void processOrder(double price, int quantity, String customerName, String address, String invoiceFileName, String email) {
        double total = infoOrder.calculateTotal(price, quantity);
        System.out.println("Order total: $" + total);
        orderPlacer.placeOrder(customerName, address);

        // Additional functionalities not required for all orders
        invoiceGenerator.generateInvoice(invoiceFileName);
        emailNotifier.sendEmailNotification(email);
    }
}
