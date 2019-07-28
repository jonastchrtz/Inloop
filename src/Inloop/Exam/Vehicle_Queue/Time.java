package Inloop.Exam.Vehicle_Queue;

import java.util.Observer;

public class Time extends java.util.Observable {

    private static Time instance;
    private int currentTime = 0;
    private int endOfTime = 100;

    public static Time getInstance() {return instance;}

    private Time() {}

    public void initEndOfTime(int seconds) {

        if(seconds < 0) throw new IllegalArgumentException();

        currentTime = 0;
        this.endOfTime = seconds;

    }

    public int getCurrentTime() {return currentTime;}

    public void run() {

        for (int i = currentTime; i <= endOfTime; i++) {

            currentTime = i;


        }
    }

    @Override
    public void addObserver(Observer o) {
        super.addObserver(o);
    }
}
