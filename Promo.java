public class Promo implements IOffer {
    private int discount;

    public Promo(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void apply_offer() {
        System.out.println("Promo code applied with " + discount + "% discount");
    }
}
