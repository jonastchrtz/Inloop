package Inloop.Exam.Project_Management;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Project {

    private String name;
    private String description;
    private Task mainTask;

    public Project(String name, String description, double rate) {

        if(name == null || description == null) throw new NullPointerException();
        if(name.isEmpty() || description.isEmpty() || rate < 0) throw new IllegalArgumentException();

        this.name = name;
        this.description = description;

    }

    public String getName() {return name;}

    public String getDescription() {return description;}

    public void setTask(Task newTask) {

        if(newTask == null) throw new NullPointerException();

        this.mainTask = newTask;

    }

    public double getDuration() {return mainTask.getTimeRequired();}

    public long getTotalCost() {return mainTask.getCostEstimate();}

    public Map<LocalDate, List<Deliverable>> allDeliverables() {

        Map<LocalDate, List<Deliverable>> result = new HashMap<>();

        for(Deliverable e : mainTask.allDeliverables()) {

            if(!result.containsKey(e.getDate())) {

                List<Deliverable> deliverables = new ArrayList<>();

                deliverables.add(e);

                result.put(e.getDate(), deliverables);

            } else {

                result.get(e.getDate()).add(e);

            }
        }

        return result;

    }
}
