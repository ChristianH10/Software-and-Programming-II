public abstract class ProtectiveHeadgear implements Headgear {
    private double protectionFactor;

    public ProtectiveHeadgear(double protectionFactor) {
        if (protectionFactor < 0) {
            throw new IllegalArgumentException("Protection factor cannot be negative");
        }
        this.protectionFactor = protectionFactor;
    }

    public double getProtectionFactor() {
        return protectionFactor;
    }

    public void setProtectionFactor(double protectionFactor) {
        if (protectionFactor < 0) {
            throw new IllegalArgumentException("Protection factor cannot be negative");
        }
        this.protectionFactor = protectionFactor;
    }

    @Override
    public String toString() {
        return "Protection Factor: " + protectionFactor;
    }
}
