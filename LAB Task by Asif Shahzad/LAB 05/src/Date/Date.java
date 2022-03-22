package Date;

public class Date {
    private int date;
    private int month;
    private int year;

    public Date(int date, int month, int year) {
        setDate(date);
        setMonth(month);
        setYear(year);
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        if (date <= 31)
            this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month <= 12)
            this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 9999)
            this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "date=" + date +
                ", month=" + month +
                ", years=" + year +
                '}';
    }
}
