import java.util.List;
import java.util.ArrayList;

public class Order {
    private Cart cart;
    private Payment_Status paymentStatus;
    private Payment_Type paymentType;
    private Order_Status order_status;
    private double total_amount;
    private List<IOffer> promotionsApplied;
    private Customer customer;

    public Order(Cart cart, Customer customer) {
        this.cart = cart;
        this.customer = customer;
        this.promotionsApplied = new ArrayList<>();
        this.order_status = Order_Status.CONFIRMED;
        this.paymentStatus = Payment_Status.PENDING;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Payment_Status getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Payment_Status paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Payment_Type getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Payment_Type paymentType) {
        this.paymentType = paymentType;
    }

    public Order_Status getOrder_status() {
        return order_status;
    }

    public void setOrder_status(Order_Status order_status) {
        this.order_status = order_status;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }

    public List<IOffer> getPromotionsApplied() {
        return promotionsApplied;
    }

    public void addPromotion(IOffer offer) {
        promotionsApplied.add(offer);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
