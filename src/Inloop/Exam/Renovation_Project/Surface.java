package Inloop.Exam.Renovation_Project;

import java.util.HashMap;
import java.util.Map;

public class Surface extends RenovationObject{

    private double length;
    private double width;
    private Material selectedMaterial;

    public Surface(double length, double width) {

        if(length <= 0 || width <= 0) throw new IllegalArgumentException();

        this.length = length;
        this.width = width;

    }

    public void setMaterial(Material m) {

        if(m == null) throw new NullPointerException();

        selectedMaterial = m;

    }

    public double getArea() {return length * width;}

    public double getLength() {return length;}

    public double getWidth() {return width;}

    public double getPrice() {return selectedMaterial.getPriceOfASurface(new Surface(getLength(), getWidth()));}

    public Map<String, Integer> addMaterialReq(Map<String, Integer> materials) {

        for(String e : materials.keySet()) {

            if(e == null) {throw new NullPointerException();}
        }

        for(Integer i : materials.values()) {

            if(i == null) {throw new NullPointerException();}

        }

        Map<String, Integer> result = new HashMap<>();

        if(materials.isEmpty()) {result.put(selectedMaterial.getName(), selectedMaterial.getMaterialReq(this));}

        else {

            result.putAll(materials);

            if(result.containsKey(selectedMaterial.getName())) {

                int i = result.get(selectedMaterial.getName());
                result.replace(selectedMaterial.getName(), i + selectedMaterial.getMaterialReq(this));

            }
        }

        return result;

    }
}
