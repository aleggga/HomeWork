package o21;

public enum Risk {
    LOW(16), MEDIUM(17), RISKY(18);

    private int riskValue;

    private Risk(final int riskValue) {
        this.riskValue = riskValue;
    }

    public int getRiskValue() {
        return riskValue;
    }
}
