public class Dog {
    private double weight = 10;

    public void eat(double amount) {
        this.weight = this.weight + amount;
    }

    public double get_weight() {
        return this.weight;
    }
}
