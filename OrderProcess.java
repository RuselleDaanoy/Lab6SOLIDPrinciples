public class OrderProcess implements OrderInfo, OrderPlace {
    @Override
    public double calculateTotal(double price, int quantity) {
        // Implement calculation logic here
        return price * quantity;
    }

    @Override
    public void placeOrder(String customerName, String address) {
        // Implement order placing logic here
        System.out.println("Order placed for " + customerName + " at " + address);
    }
}
