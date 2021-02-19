package PremierLeague;

public class Date {

    private int Year;
    private int Month;
    private  int Day;


    public Date(int year,int month, int day){
        this.Year =year;
        this.Month =month;
        this.Day =day;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        Month = month;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }
}

