import java.util.List;
import java.util.ArrayList;

public class Customer {
    private String name;
    private String contact;
    private Location location;
    private int loyalty_point;
    private List<Cart> list_cart;

    public Customer(String name, String contact, Location location) {
        this.name = name;
        this.contact = contact;
        this.location = location;
        this.loyalty_point = 0;
        this.list_cart = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public Location getLocation() {
        return location;
    }

    public int getLoyalty_point() {
        return loyalty_point;
    }

    public void setLoyalty_point(int loyalty_point) {
        this.loyalty_point = loyalty_point;
    }

    public List<Cart> getList_cart() {
        return list_cart;
    }

    public void addToCart(Cart cart, MenuItem item) {
        cart.addItem(item, 1);
        System.out.println("Item added to cart: " + item.getName());
    }

    public void removeFromCart(Cart cart, MenuItem item) {
        cart.removeItem(item);
        System.out.println("Item removed from cart: " + item.getName());
    }

    public void search() {
        System.out.println("Searching for restaurants/items...");
    }

    public void checkout() {
        System.out.println("Proceeding to checkout...");
    }

    public void trackOrder(String order_id) {
        System.out.println("Tracking order: " + order_id);
    }

    public void rateFoodExperience() {
        System.out.println("Rating food experience...");
    }

    public void rateDeliveryPartner() {
        System.out.println("Rating delivery partner...");
    }

    public void viewOrderHistory() {
        System.out.println("Viewing order history...");
    }

    public void notify() {
        System.out.println("Customer notification sent");
    }
}
