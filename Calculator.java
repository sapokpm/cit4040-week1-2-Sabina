public class Calculator {
    public static void main (String[] args) {
        String productName = "Apple";
        double price = 0.99;
        int stockQuantity = 5;
        boolean inStock = true;
        char sizeCode = 'M';
        double totalPrice = calculateTotal(price, stockQuantity);
        System.out.println ("Product: " + productName + ", Price: $" + price + ", Stock Quantity: " + stockQuantity + ", In Stock: " + inStock + ", Size Code: " + sizeCode + ", Total Price: $" + totalPrice);
    }

    public static double calculateTotal(double price, int quantity) {
        if (price < 0 || quantity < 0) {
            System.out.println("Warning: price and quantity must not be negative.");
            return 0;
        }

        double total = price * quantity;

        if (quantity >= 10) {
            total = total * 0.9;
        }

        return total;
    }
}