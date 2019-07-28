package Inloop.Exam.Enterprise_Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Team extends AbstractUnit {

    private StaffMember teamLeader;

    public Team(String name, StaffMember teamLeader) {

        super(name);

        if(teamLeader == null) throw new NullPointerException();

        this.teamLeader = teamLeader;

    }

    public StaffMember getTeamLeader() {return teamLeader;}

    public List<StaffMember> getTeamMembers() {

        Set<StaffMember> result = new TreeSet<>();

        result.add(teamLeader);
        StaffMemberIterator itr = new StaffMemberIterator(teamLeader.getDirectSubordinates());

        while (itr.hasNext()) {result.add((StaffMember) itr.next());}

        return new ArrayList<>(result);

    }

    @Override
    public String getName() {return name;}

}
