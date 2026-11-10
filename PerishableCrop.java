public class PerishableCrop extends Crop {
    private int shelfLifeDays;

    public PerishableCrop(String cropId, String name, double weightKg, double marketPricePerKg, double governmentSRP, int shelfLifeDays) {
        super(cropId, name, weightKg, marketPricePerKg, governmentSRP);
        this.shelfLifeDays = shelfLifeDays;
    }

    @Override
    public double computeMarketValue() {
        // TODO: Implement spoilage deduction logic
        return weightKg * marketPricePerKg;
    }
}