package Inloop.Exam.Vehicle_Queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class VehicleQueue implements java.util.Observer {

    private List<Vehicle> queue;
    private VehicleGenerator generator;

    private double entryDelay;
    private double exitDelay;
    private int trafficLightRate;
    private boolean greenLight = false;

    public VehicleQueue(double entryDelay, double exitDelay, int trafficLightRate, VehicleGenerator generator) {

        this.queue = new ArrayList<>();
        this.generator = generator;
        this.entryDelay = entryDelay;
        this.exitDelay = exitDelay;
        this.trafficLightRate = trafficLightRate;

    }

    public void enter() {}

    public void leave() {}

    public double getLength() {return 0;}

    public int getSize() {return 0;}

    @Override
    public void update(Observable o, Object arg) {

    }
}
