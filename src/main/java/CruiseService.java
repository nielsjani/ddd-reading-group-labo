import java.util.List;

public class CruiseService {

    private JdbcWrapper jdbcWrapper;

    public CruiseService(JdbcWrapper jdbcWrapper) {
        this.jdbcWrapper = jdbcWrapper;
    }

    public void bookTicket(String cruiseId, String roomType, int roomCapacity, Customer customer) {
        jdbcWrapper.saveCustomer(customer);
        Cruise cruise = jdbcWrapper.findCruiseById(cruiseId);

        Cabin cabinToBook = cruise.getRooms().stream()
                .filter(room -> room.getType().equals(roomType) && room.getCapacity() == roomCapacity)
                .filter(room -> room.getCustomerId() == null)
                .findFirst()
                .orElseThrow();

        cabinToBook.setCustomerId(customer.getId());

        jdbcWrapper.updateCruise(cruise);
    }

    public String createCruiseTour(String tourName) {
        Cruise cruise = new Cruise(tourName);
        jdbcWrapper.saveCruise(cruise);
        return cruise.getId();
    }

    public void updateCruiseStops(String cruiseId, List<String> harborIds) {
        Cruise cruise = jdbcWrapper.findCruiseById(cruiseId);
        cruise.setStops(harborIds);
        jdbcWrapper.updateCruise(cruise);
    }

    public void updateCruiseShip(String cruiseId, int fuelConsumptionPctPerSeaMile, int fuelStorage, List<Cabin> cabins) {
        Cruise cruise = jdbcWrapper.findCruiseById(cruiseId);
        cruise.setFuelConsumptionPctPerSeaMile(fuelConsumptionPctPerSeaMile);
        cruise.setFuelStorage(fuelStorage);
        cruise.setCabins(cabins);
        jdbcWrapper.updateCruise(cruise);
    }

    public void publish(String cruiseId) {
        final Cruise cruise = jdbcWrapper.findCruiseById(cruiseId);
        cruise.setPublished(true);
        jdbcWrapper.updateCruise(cruise);
    }

    public void cancel(String cruiseId) {
        final Cruise cruise = jdbcWrapper.findCruiseById(cruiseId);
        cruise.setCancelled(true);
        jdbcWrapper.updateCruise(cruise);
    }
}
