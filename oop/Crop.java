public abstract class Crop {
    protected String cropId;
    protected String name;
    protected double weightKg;
    protected double marketPricePerKg;
    protected double governmentSRP;

    public Crop(String cropId, String name, double weightKg, double marketPricePerKg, double governmentSRP) {
        this.cropId = cropId;
        this.name = name;
        this.weightKg = weightKg;
        this.marketPricePerKg = marketPricePerKg;
        this.governmentSRP = governmentSRP;
    }

    // Abstract method placeholder for team implementation
    public abstract double computeMarketValue();

    public String getCropId() { return cropId; }
    public String getName() { return name; }
    public double getWeightKg() { return weightKg; }
}