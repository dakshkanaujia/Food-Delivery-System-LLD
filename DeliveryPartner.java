import java.util.List;
import java.util.ArrayList;

public class DeliveryPartner {
    private Location location;
    private String name;
    private int contact;
    private List<Order> listOrders;

    public DeliveryPartner(String name, int contact, Location location) {
        this.name = name;
        this.contact = contact;
        this.location = location;
        this.listOrders = new ArrayList<>();
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getContact() {
        return contact;
    }

    public List<Order> getListOrders() {
        return listOrders;
    }

    public void viewAssignedOrders() {
        System.out.println("Viewing assigned orders...");
        for (Order order : listOrders) {
            System.out.println("Order ID: " + order.hashCode());
        }
    }

    public void updateDeliveryStatus() {
        System.out.println("Delivery status updated");
    }

    public void acceptOrder() {
        System.out.println("Order accepted by delivery partner");
    }

    public void declineOrder() {
        System.out.println("Order declined by delivery partner");
    }
}
