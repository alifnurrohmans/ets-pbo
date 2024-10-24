import java.util.ArrayList;

public class Order {
    private ArrayList<MenuItem> menuItems;
    private double totalPrice;
    private boolean isPaid;

    public Order() {
        menuItems = new ArrayList<>();
        totalPrice = 0;
        isPaid = false;
    }

    public void addItem(MenuItem item) {
        menuItems.add(item);
        calculateTotalPrice(); // Hitung ulang total harga
    }

    private void calculateTotalPrice() {
        totalPrice = 0;
        for (MenuItem item : menuItems) {
            totalPrice += item.getPrice();
        }
    }

    public void payOrder() {
        isPaid = true;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Order: " + menuItems.toString() + ", Total Price: Rp. " + totalPrice + ", Paid: " + isPaid;
    }
}
