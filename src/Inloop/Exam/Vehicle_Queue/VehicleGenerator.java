package Inloop.Exam.Vehicle_Queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VehicleGenerator {

    private List<Vehicle> vehicles;
    private Random randomGenerator;

    public VehicleGenerator() {

        randomGenerator = new Random();
        vehicles = new ArrayList<>();
        vehicles.add(new Bicycle());
        vehicles.add(new Car());
        vehicles.add(new Bus());

    }

    public Vehicle createVehicle() {

        return vehicles.get(randomGenerator.nextInt(vehicles.size()));

    }
}
