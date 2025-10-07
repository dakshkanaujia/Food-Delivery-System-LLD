public class Admin {
    private InventoryService inventoryService;

    public Admin(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    public void assignDeliveryPartner(Order order) {
        System.out.println("Assigning delivery partner to order...");
    }

    public void viewOrder(String orderId) {
        System.out.println("Viewing order: " + orderId);
    }

    public void addPromoCode() {
        System.out.println("Promo code added");
    }

    public void approveRestaurant() {
        System.out.println("Restaurant approved");
    }

    public void handleEscalation() {
        System.out.println("Handling escalation...");
    }
}
