public class PerishableCrop extends Crop {
    private int shelfLifeDays;

    public PerishableCrop(String cropId, String name, double weightKg, double marketPricePerKg, double governmentSRP, int shelfLifeDays) {
        super(cropId, name, weightKg, marketPricePerKg, governmentSRP);
        this.shelfLifeDays = shelfLifeDays;
    }

    @Override
    public double computeMarketValue() {
        // TODO: spoilage deduction
        return weightKg * marketPricePerKg;
    }
}