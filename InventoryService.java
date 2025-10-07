import java.util.List;
import java.util.ArrayList;

public class InventoryService {
    private List<Order> orders;
    private List<Restaurant> restaurants;
    private List<DeliveryPartner> deliveryPartners;
    private List<Customer> customers;

    public InventoryService() {
        this.orders = new ArrayList<>();
        this.restaurants = new ArrayList<>();
        this.deliveryPartners = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void listOrders() {
        System.out.println("Listing all orders...");
        for (Order order : orders) {
            System.out.println("Order ID: " + order.hashCode());
        }
    }

    public void listRestaurants() {
        System.out.println("Listing all restaurants...");
        for (Restaurant restaurant : restaurants) {
            System.out.println("Restaurant: " + restaurant.getName());
        }
    }

    public void listDeliveryPartners() {
        System.out.println("Listing all delivery partners...");
        for (DeliveryPartner partner : deliveryPartners) {
            System.out.println("Partner: " + partner.getName());
        }
    }

    public void listCustomers() {
        System.out.println("Listing all customers...");
        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.getName());
        }
    }

    public List<Order> getOrders() {
        return orders;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public List<DeliveryPartner> getDeliveryPartners() {
        return deliveryPartners;
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}
