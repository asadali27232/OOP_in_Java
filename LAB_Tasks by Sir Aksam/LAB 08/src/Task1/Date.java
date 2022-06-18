package Task1;

public class Date {
    private int date;
    private int month;
    private int year;

    public Date() {
        this(0, 0, 0);
    }

    public Date(int date) {
        this(date, 0, 0);
    }

    public Date(int date, int month) {
        this(date, month, 0);
    }


    public Date(Date date1) {
        this(date1.getDate(), date1.getMonth(), date1.getYear());
    }

    public Date(int date, int month, int year) {
        setDate(date);
        setMonth(month);
        setYear(year);
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        if (date <= 31 && date > 0)
            this.date = date;
        else
            throw new IllegalArgumentException("Task1.Date must be 1-31");
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month <= 12 && month > 0)
            this.month = month;
        else
            throw new IllegalArgumentException("Month must be 1-12");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1970 && year <= 2022)
            this.year = year;
        else
            throw new IllegalArgumentException("Year must be 1970-2022");
    }

    @Override
    public String toString() {
        return "" + date +
                "/" + month +
                "/" + year + "";
    }
}
