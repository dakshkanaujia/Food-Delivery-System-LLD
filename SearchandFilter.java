public class SearchandFilter {
    private InventoryService inventoryService;

    public SearchandFilter(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    public void searchByRestaurant() {
        System.out.println("Searching by restaurant...");
    }

    public void searchByLocation() {
        System.out.println("Searching by location...");
    }

    public void filterByItemType() {
        System.out.println("Filtering by item type...");
    }

    public void searchByItemName() {
        System.out.println("Searching by item name...");
    }

    public void filterByPrice() {
        System.out.println("Filtering by price...");
    }

    public void searchByWishlist() {
        System.out.println("Searching by wishlist...");
    }
}
