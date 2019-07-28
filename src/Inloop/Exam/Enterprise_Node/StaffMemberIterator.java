package Inloop.Exam.Enterprise_Node;

import java.util.*;

public class StaffMemberIterator implements EnterpriseNodeIterator {

    private List<StaffMember> allMembers = new ArrayList<>();
    private int currentIndex = 0;

    public StaffMemberIterator(Set<StaffMember> directSubordinates) {

        allMembers.addAll(directSubordinates);

        for(StaffMember e : directSubordinates) {
            findSubordinatesRecursively(e);
        }

        allMembers = new ArrayList<>(new TreeSet<>(allMembers));

    }

    @Override
    public boolean hasNext() {

        return currentIndex < allMembers.size();
    }

    @Override
    public Object next() {

        if(!hasNext()) throw new NoSuchElementException();

        Object next = allMembers.get(currentIndex);
        currentIndex++;

        return next;

    }

    public void findSubordinatesRecursively(StaffMember m) {

        StaffMember root = m;

        if(root.getDirectSubordinates() != null) {

            for(StaffMember e : m.getDirectSubordinates()) {

                allMembers.add(e);
                if(e != root) {root = e;}
                findSubordinatesRecursively(root);

            }
        }
    }
}
