import java.util.ArrayList;

public class FoodOrderSystem {
    private ArrayList<Order> orders;

    public FoodOrderSystem() {
        orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
}
