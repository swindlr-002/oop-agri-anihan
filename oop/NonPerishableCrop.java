public class NonPerishableCrop extends Crop {
    private double storageFeePerKg;

    public NonPerishableCrop(String cropId, String name, double weightKg, double marketPricePerKg, double governmentSRP, double storageFeePerKg) {
        super(cropId, name, weightKg, marketPricePerKg, governmentSRP);
        this.storageFeePerKg = storageFeePerKg;
    }

    @Override
    public double computeMarketValue() {
        // TODO: storage fee deduction
        return weightKg * marketPricePerKg;
    }
}