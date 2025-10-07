public class Loyalty implements IOffer {
    private int points;

    public Loyalty(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void apply_offer() {
        System.out.println("Loyalty points applied: " + points + " points");
    }
}
