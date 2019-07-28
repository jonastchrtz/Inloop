package Inloop.Exam.Enterprise_Node;

import java.util.TreeSet;
import java.util.Set;

public class StaffMember implements EnterpriseNode, java.lang.Comparable<StaffMember> {

    private String name;
    private String job;
    private Set<StaffMember> directSubordinates;

    public StaffMember(String name, String job) {

        if(name == null || job == null) throw new NullPointerException();
        if(name.isEmpty() || job.isEmpty()) throw new IllegalArgumentException();


        this.name = name;
        this.job = job;
        this.directSubordinates = new TreeSet<>();

    }

    public String getJob() {return job;}

    public boolean addDirectSubordinate(StaffMember subordinate) {return directSubordinates.add(subordinate);}

    public boolean removeDirectSubordinate(StaffMember subordinate) {return directSubordinates.remove(subordinate);}

    public Set<StaffMember> getDirectSubordinates() {return directSubordinates;}

    @Override
    public String getName() {return name;}

    @Override
    public int compareTo(StaffMember o) {return getName().compareTo(o.getName());}

    @Override
    public String toString() {return name;}

}
