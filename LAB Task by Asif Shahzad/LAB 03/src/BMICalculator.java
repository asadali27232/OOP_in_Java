public class BMICalculator {
    private String name;
    private String dateOfBirth;

    public BMICalculator(String name, String dateOfBirth) {
        setName(name);
        setDateOfBirth(dateOfBirth);
    }

    public BMICalculator(String name, int age) {
        setName(name);
        setDateOfBirth(agetoDateOfBirth(age));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String agetoDateOfBirth(int age) {
        String dateOfBirth = "";

        return dateOfBirth;
    }
}
