public class DateTime {
    private Date date1;
    private Time time;

    public DateTime(Date date) {
        setDate(date);
    }

    public DateTime(Time time) {
        setTime(time);
    }

    public DateTime(Date date, Time time) {
        setDate(date);
        setTime(time);
    }

    public DateTime(DateTime dateTime) {
        this(dateTime.getDate(), dateTime.getTime());
    }

    public DateTime(int date, int month, int year, int hours, int mint, int sec) {
        date1 = new Date(date, month, year);
        time = new Time(hours, mint, sec);
    }

    public Date getDate() {
        return date1;
    }

    public void setDate(Date date) {
        this.date1 = new Date(date);
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = new Time(time);
    }

    public void setDateTime(int date, int month, int year, int hours, int mint, int sec) {
        date1 = new Date();
        time = new Time();

        date1.setDate(date);
        date1.setMonth(month);
        date1.setYear(year);

        time.setHour(hours);
        time.setMinute(mint);
        time.setSecond(sec);
    }
}
