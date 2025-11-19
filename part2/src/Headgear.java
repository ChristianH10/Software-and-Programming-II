public interface Headgear {
    /**
     * Computes and returns the value of the headgear in GBP
     * @return value of the headgear
     */
    double value();

    /**
     * Computes the total value of an array of headgear objects
     * Throws IllegalArgumentException if the array or any element is null
     * @param headgearArray an array of Headgear objects
     * @return total value of all headgear objects
     */
    static double totalValue(Headgear[] headgearArray) {
        if (headgearArray == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        double total = 0;
        for (Headgear h : headgearArray) {
            if (h == null) {
                throw new IllegalArgumentException("Array contains null element");
            }
            total += h.value();
        }
        return total;
    }
}
