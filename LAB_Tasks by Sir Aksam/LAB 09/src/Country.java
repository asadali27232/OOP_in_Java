import java.util.ArrayList;

public class Country implements StatsComputable {
    private String countryName;
    private ArrayList<Integer> provincesArea;
    private ArrayList<Integer> statesArea;
    private int countryArea;

    public Country(String countryName, ArrayList<Integer> provincesArea, ArrayList<Integer> statesArea) {
        this.countryName = countryName;
        this.provincesArea = provincesArea;
        this.statesArea = statesArea;
        this.countryArea = 0;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public ArrayList<Integer> getProvincesArea() {
        return provincesArea;
    }

    public void setProvincesArea(ArrayList<Integer> provincesArea) {
        this.provincesArea = provincesArea;
    }

    public ArrayList<Integer> getStatesArea() {
        return statesArea;
    }

    public void setStatesArea(ArrayList<Integer> statesArea) {
        this.statesArea = statesArea;
    }

    public int getCountryArea() {
        return countryArea;
    }

    public void setCountryArea(int countryArea) {
        this.countryArea = countryArea;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", provincesArea=" + provincesArea + units +
                ", statesArea=" + statesArea + units +
                ", countryArea=" + countryArea + units +
                '}';
    }

    @Override
    public void computeStats() {
        for (Integer x: statesArea) {
            setCountryArea(getCountryArea() + x);
        }
        for (Integer y: provincesArea) {
            setCountryArea(getCountryArea() + y);
        }
    }

    @Override
    public void reset() {
        setCountryArea(0);
    }
}
