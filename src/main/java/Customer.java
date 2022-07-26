public class Customer {

    private String id;
    private String firstName;
    private String lastName;
    private String telNr;
    private String email;
    private String street;
    private String postalCode;
    private String houseNumber;

    public Customer(String id, String firstName, String lastName, String telNr, String email, String street, String postalCode, String houseNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telNr = telNr;
        this.email = email;
        this.street = street;
        this.postalCode = postalCode;
        this.houseNumber = houseNumber;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTelNr() {
        return telNr;
    }

    public String getEmail() {
        return email;
    }

    public String getStreet() {
        return street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getHouseNumber() {
        return houseNumber;
    }
}
