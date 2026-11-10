import java.util.ArrayList;

public class Farmer {
    private String farmerId;
    private String fullName;
    private String location;
    private ArrayList<Crop> harvestHistory;

    public Farmer(String farmerId, String fullName, String location) {
        this.farmerId = farmerId;
        this.fullName = fullName;
        this.location = location;
        this.harvestHistory = new ArrayList<>();
    }

    public void addCropLog(Crop crop) {
        harvestHistory.add(crop);
    }

    public String getFarmerId() { return farmerId; }
    public String getFullName() { return fullName; }
}