public class BobbleHat extends ProtectiveHeadgear {
    private double bobbleDiameter;

    public BobbleHat(double protectionFactor, double bobbleDiameter) {
        super(protectionFactor);
        if (bobbleDiameter < 0) {
            throw new IllegalArgumentException("Bobble diameter cannot be negative");
        }
        this.bobbleDiameter = bobbleDiameter;
    }

    public double getBobbleDiameter() {
        return bobbleDiameter;
    }

    public void setBobbleDiameter(double bobbleDiameter) {
        if (bobbleDiameter < 0) {
            throw new IllegalArgumentException("Bobble diameter cannot be negative");
        }
        this.bobbleDiameter = bobbleDiameter;
    }

    @Override
    public double value() {
        return bobbleDiameter * 4 * getProtectionFactor();
    }

    @Override
    public String toString() {
        return "BobbleHat[protectionFactor=" + getProtectionFactor() + ", bobbleDiameter=" + bobbleDiameter + ", value=" + value() + "]";
    }
}
