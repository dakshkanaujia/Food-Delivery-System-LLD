import java.util.List;
import java.util.ArrayList;

public class Restaurant {
    private String name;
    private Analytics analytics;
    private Location location;
    private List<MenuItem> listMenuItem;

    public Restaurant(String name, Location location) {
        this.name = name;
        this.location = location;
        this.analytics = new Analytics();
        this.listMenuItem = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Analytics getAnalytics() {
        return analytics;
    }

    public Location getLocation() {
        return location;
    }

    public List<MenuItem> getListMenuItem() {
        return listMenuItem;
    }

    public void checkAvailability() {
        System.out.println("Checking restaurant availability...");
    }

    public void acceptOrders() {
        System.out.println("Order accepted");
    }

    public void rejectOrders() {
        System.out.println("Order rejected");
    }

    public void addItemToMenu() {
        System.out.println("Item added to menu");
    }

    public void removeItemFromMenu() {
        System.out.println("Item removed from menu");
    }

    public void registerRestaurant() {
        System.out.println("Restaurant registered successfully");
    }
}
