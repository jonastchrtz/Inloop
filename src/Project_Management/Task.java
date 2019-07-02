package Project_Management;

import java.util.ArrayList;
import java.util.List;

public class Task extends ProjectItem{

    private List<ProjectItem> projectItems;

    public Task(String name, String details, double rate) {

        super(name, details, rate);
        this.projectItems = new ArrayList<>();

    }

    public void addProjectItem(ProjectItem pi) {

        if(pi == null) throw new NullPointerException();

        projectItems.add(pi);

    }

    public void removeProjectItem(ProjectItem pi) {

        if(pi == null) throw new NullPointerException();

        projectItems.remove(pi);

    }

    public List<Deliverable> allDeliverables() {

        List<Deliverable> result = new ArrayList<>();
        Task root;

        for (ProjectItem e : projectItems) {

            if (e instanceof Deliverable) {

                result.add((Deliverable) e);

            }

            if(e instanceof Task) {

                root = (Task) e;
                result.addAll(root.allDeliverables());

                }
            }

        return result;

    }

    @Override
    public double getTimeRequired() {

        double result = 0;

        for(Deliverable e : allDeliverables()) {

            result = result + e.getTimeRequired();

        }

        return result;

    }

    @Override
    public long getMaterialCost() {

        long result = 0;

        for(Deliverable e : allDeliverables()) {

            result = result + e.getMaterialCost();

        }

        return result;

    }
}
