public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final Date dateOfBirth;

    public Employee(String firstName, String lastName, String socialSecurityNumber, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.dateOfBirth = dateOfBirth;
    }

    // return first name
    public String getFirstName() {
        return firstName;
    }

    // return last name
    public String getLastName() {
        return lastName;
    }

    // return social security number
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    // return String representation of Employee object
    @Override
    public String toString() {
        return String.format("%s %s Date of Birth: %s%nSocial security number: %s",
                getFirstName(), getLastName(), getDateOfBirth().toString(), getSocialSecurityNumber());
    }

    // abstract method must be overridden by concrete subclasses
    public abstract double earnings(); // no implementation here
}