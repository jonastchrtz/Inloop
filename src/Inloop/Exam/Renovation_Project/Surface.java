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

        //if(selectedMaterial == null || materials.containsKey(null) || materials.containsValue(null)) throw new NullPointerException();

        System.out.println(materials);

        Map<String, Integer> result = new HashMap<>();

        for (Map.Entry<String, Integer> e : materials.entrySet()) {


        }
        return result;

    }

}
