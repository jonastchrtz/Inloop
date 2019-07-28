package Inloop.Exam.Event_App;

public class Time {

    private int hour;
    private int minute;

    public Time(int hour, int minute) {

        if(hour < 0 || hour > 24 || minute < 0 || minute > 59) {throw new IllegalArgumentException();}
        if(hour == 24 && minute > 0) {throw new IllegalArgumentException();}

        this.hour = hour;
        this.minute = minute;

    }

    public int getHour() {return hour;}

    public int getMinute() {return minute;}

}
