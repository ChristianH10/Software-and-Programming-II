public class Crown implements Headgear {
    private int numberOfJewels;
    private static final double VALUE_FACTOR = 200000;

    public Crown(int numberOfJewels) {
        if (numberOfJewels < 0) {
            throw new IllegalArgumentException("Number of jewels cannot be negative");
        }
        this.numberOfJewels = numberOfJewels;
    }

    public int getNumberOfJewels() {
        return numberOfJewels;
    }

    public void setNumberOfJewels(int numberOfJewels) {
        if (numberOfJewels < 0) {
            throw new IllegalArgumentException("Number of jewels cannot be negative");
        }
        this.numberOfJewels = numberOfJewels;
    }

    @Override
    public double value() {
        return numberOfJewels * VALUE_FACTOR;
    }

    @Override
    public String toString() {
        return "Crown[jewels=" + numberOfJewels + ", value=" + value() + "]";
    }
}
