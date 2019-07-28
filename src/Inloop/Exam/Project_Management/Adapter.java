package Inloop.Exam.Project_Management;

import java.util.List;

public class Adapter implements IProject {

    String name;
    String description;
    Task mainTask;

    public Adapter(String name, String description, double rate) {

        if(name == null || description == null) throw new NullPointerException();
        if(name.isEmpty() || description.isEmpty() || rate < 0) throw new IllegalArgumentException();

        this.name = name;
        this.description = description;

    }

    @Override
    public void setTask(Task newTask) {

        if(newTask == null) throw new NullPointerException();

        this.mainTask = newTask;

    }

    @Override
    public double getDuration() {return mainTask.getTimeRequired();}

    @Override
    public long getTotalCost() {return mainTask.getCostEstimate();}

    @Override
    public List<Deliverable> getDeliverables() {return mainTask.allDeliverables();}

}
