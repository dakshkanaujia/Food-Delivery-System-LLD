import java.util.List;
import java.util.ArrayList;

public class Analytics {
    private double avgDeliveryTime;
    private double restaurantRating;
    private List<MenuItem> topDishes;
    private int orderSuccessRate;

    public Analytics() {
        this.topDishes = new ArrayList<>();
    }

    public double getAvgDeliveryTime() {
        return avgDeliveryTime;
    }

    public void setAvgDeliveryTime(double avgDeliveryTime) {
        this.avgDeliveryTime = avgDeliveryTime;
    }

    public double getRestaurantRating() {
        return restaurantRating;
    }

    public void setRestaurantRating(double restaurantRating) {
        this.restaurantRating = restaurantRating;
    }

    public List<MenuItem> getTopDishes() {
        return topDishes;
    }

    public void setTopDishes(List<MenuItem> topDishes) {
        this.topDishes = topDishes;
    }

    public int getOrderSuccessRate() {
        return orderSuccessRate;
    }

    public void setOrderSuccessRate(int orderSuccessRate) {
        this.orderSuccessRate = orderSuccessRate;
    }
}
