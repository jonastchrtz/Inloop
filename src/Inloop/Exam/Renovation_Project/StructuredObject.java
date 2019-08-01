package Inloop.Exam.Renovation_Project;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StructuredObject extends RenovationObject {

    private Set<RenovationObject> parts;

    public StructuredObject() {

        parts = new HashSet<>();

    }

    public void add(RenovationObject r) {

        if(r == null) throw new NullPointerException();

        parts.add(r);

    }

    public double getPrice() {

        double price = 0;

        for(RenovationObject e : parts) {

            price += e.getPrice();

        }

        return price;

    }

    public Map<String, Integer> addMaterialReq(Map<String, Integer> materials) {

        for(String e : materials.keySet()) {

            if(e == null) {throw new NullPointerException();}
        }

        for(Integer i : materials.values()) {

            if(i == null) {throw new NullPointerException();}

        }


        HashMap<String, Integer> result = new HashMap<>(materials);

        for (RenovationObject e : parts) {

           result.putAll(e.addMaterialReq(materials));

        }

        return result;

    }
}
