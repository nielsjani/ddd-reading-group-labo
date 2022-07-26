import java.util.List;

public class Cruise {

    private String id;
    private List<Cabin> cabins;
    private int fuelConsumptionPctPerSeaMile;
    private int fuelStorage;
    private String tourName;
    private List<String> harborIds;
    private boolean isPublished = false;
    private boolean isCancelled = false;

    public Cruise(String tourName) {
        this.tourName = tourName;
        this.id = "SOME_RANDOM_ID";
    }

    public List<Cabin> getRooms() {
        return cabins;
    }

    public String getId() {
        return id;
    }

    public void setStops(List<String> harborIds) {
        this.harborIds = harborIds;
    }

    public void setFuelConsumptionPctPerSeaMile(int fuelConsumptionPctPerSeaMile) {
        this.fuelConsumptionPctPerSeaMile = fuelConsumptionPctPerSeaMile;
    }

    public void setFuelStorage(int fuelStorage) {
        this.fuelStorage = fuelStorage;
    }

    public void setCabins(List<Cabin> cabins) {
        this.cabins = cabins;
    }

    public void setPublished(boolean published) {
        isPublished = published;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }
}
