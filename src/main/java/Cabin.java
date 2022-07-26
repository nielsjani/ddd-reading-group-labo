public class Cabin {

    private String number;
    private int capacity;
    private String type;
    private String customerId;

    public Cabin(String number, int capacity, String type) {
        this.number = number;
        this.capacity = capacity;
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
