public class Main {
    public static void main(String[] args) {
        // Membuat sistem pemesanan
        FoodOrderSystem foodOrderSystem = new FoodOrderSystem();

        // Membuat beberapa item menu
        MenuItem burger = new MenuItem("Burger", 20000);
        MenuItem pizza = new MenuItem("Pizza", 100000);
        MenuItem fries = new MenuItem("Kebab", 15000);

        // Membuat pesanan baru
        Order order1 = new Order();
        order1.addItem(burger);
        order1.addItem(fries);
        
        // Menambahkan pesanan ke sistem
        foodOrderSystem.addOrder(order1);

        // Melakukan pembayaran
        order1.payOrder();

        // Menampilkan semua pesanan yang ada
        for (Order order : foodOrderSystem.getOrders()) {
            System.out.println(order);
        }
    }
}
