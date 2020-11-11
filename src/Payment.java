public class Payment {
    private String item;
    private int cost;

    public Payment(String item, int cost) {
        this.item = item;
        this.cost = cost;
    }

    public String getItem() {
        return item;
    }

    public int getCost() {
        return cost;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "item='" + item + '\'' +
                ", cost=" + cost +
                '}';
    }
}
