public class InvoiceEmailService implements InvoiceReports, EmailNotifications {
    @Override
    public void generateInvoice(String fileName) {
        // Implement invoice generation logic here
        System.out.println("Invoice generated: " + fileName);
    }

    @Override
    public void sendEmailNotification(String email) {
        // Implement email sending logic here
        System.out.println("Email notification sent to: " + email);
    }
}