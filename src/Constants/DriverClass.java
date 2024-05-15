package Constants;

public class DriverClass {
    private String firstName;
    private String lastName;
    private String abbreviation;

    public DriverClass(String firstName, String lastName, String abbreviation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.abbreviation = abbreviation;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
