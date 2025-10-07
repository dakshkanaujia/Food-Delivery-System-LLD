import java.util.Map;
import java.util.HashMap;

public class Cart implements IOffer {
    private Map<MenuItem, Integer> menu;

    public Cart() {
        this.menu = new HashMap<>();
    }

    public Map<MenuItem, Integer> getMenu() {
        return menu;
    }

    public void addItem(MenuItem item, int quantity) {
        menu.put(item, menu.getOrDefault(item, 0) + quantity);
    }

    public void removeItem(MenuItem item) {
        menu.remove(item);
    }

    public void updateQuantity(MenuItem item, int quantity) {
        if (quantity <= 0) {
            menu.remove(item);
        } else {
            menu.put(item, quantity);
        }
    }

    public double getTotalAmount() {
        double total = 0;
        for (Map.Entry<MenuItem, Integer> entry : menu.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
    }

    public void apply_offer() {
        System.out.println("Offer applied to cart");
    }
}
