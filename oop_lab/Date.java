public class Date {
    private int day;
    private int month;
    private int year;

    Date(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public void setDay(int day){
        this.day=day;
    }
    public int getDay(){
       return day;
    }
    public void setMonth(int month){
        this.month=month;
    }
    public int getMonth(){
        return month;
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return year;
    }
    public String toString(){
        String dateDetails=String.format("%d/%d/%d",day,month,year);
        return dateDetails;
    }
    public Date isRecentDate(Date d1, Date d2){
        return d1.getMonth()<d2.getMonth()?d2:d1;
    }
}
