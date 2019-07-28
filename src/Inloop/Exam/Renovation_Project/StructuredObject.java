package Inloop.Exam.Renovation_Project;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StructuredObject extends RenovationObject {

    private Set<RenovationObject> parts = new HashSet<>();

    public StructuredObject() {

        parts.add(this);

    }

    public void add(RenovationObject r) {

        if(r == null) throw new NullPointerException();

        parts.add(r);

    }

    public double getPrice() {
        return 0;
    }

    public Map<String, Integer> addMaterialReq(Map<String, Integer> materials) {

        if(materials.containsKey(null) || materials.containsValue(null)) throw new NullPointerException();

        System.out.println(parts);

        return new HashMap<>(materials);


    }

}
