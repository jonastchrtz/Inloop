package Inloop.Exam.Project_Management;

import java.util.List;

public interface IProject {

    public void setTask(Task newTask);

    public double getDuration();

    public long getTotalCost();

    public List<Deliverable> getDeliverables();

}
