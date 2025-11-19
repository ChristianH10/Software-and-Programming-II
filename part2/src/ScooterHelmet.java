public class ScooterHelmet extends ProtectiveHeadgear {
    private boolean hasVisor;
    private static final double C2 = 400;

    public ScooterHelmet(double protectionFactor, boolean hasVisor) {
        super(protectionFactor);
        this.hasVisor = hasVisor;
    }

    public boolean hasVisor() {
        return hasVisor;
    }

    public void setHasVisor(boolean hasVisor) {
        this.hasVisor = hasVisor;
    }

    @Override
    public double value() {
        double c1 = hasVisor ? 160 : 80;
        return c1 + getProtectionFactor() * C2;
    }

    @Override
    public String toString() {
        return "ScooterHelmet[protectionFactor=" + getProtectionFactor() + ", visor=" + hasVisor + ", value=" + value() + "]";
    }
}
