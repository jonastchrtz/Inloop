package Inloop.Exam.Enterprise_Node;


import java.util.List;

public class EnterpriseExample {
    public static void main(String[] args) {
        Holding h1;
        Company c1, c2;
        Division d1, d2, d3;
        Team t1, t2;
        StaffMember m1, m2, m3, m4, m5, m6;

        h1 = new Holding("Holding");
        c1 = new Company("Company 1");
        c2 = new Company("Company 2");
        d1 = new Division("Division 1");
        d2 = new Division("Division 2");
        d3 = new Division("Division 3");
        m1 = new StaffMember("Member 1", "CEO");
        m2 = new StaffMember("Member 2", "CEO-S1");
        t1 = new Team("Team 1", m1);
        t2 = new Team("Team 2", m2);
        h1.add(c1);
        h1.add(c2);
        c1.add(d1);
        c2.add(d2);
        d3.add(t1);
        d3.add(t2);
        m3 = new StaffMember("Member 3", "CEO-S2");
        m4 = new StaffMember("Member 4", "CEO-S3");
        m5 = new StaffMember("Member 5", "CEO-S11");
        m6 = new StaffMember("Member 6", "CEO-S31");
        m1.addDirectSubordinate(m3);
        m1.addDirectSubordinate(m4);
        m3.addDirectSubordinate(m5);
        m3.addDirectSubordinate(m6);

        List<StaffMember> teamMembers = t1.getTeamMembers();
        System.out.println("All StaffMembers of t1: " + teamMembers);
    }
}
