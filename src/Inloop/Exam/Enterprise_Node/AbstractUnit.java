package Inloop.Exam.Enterprise_Node;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractUnit extends AbstractEnterpriseUnit{

    private List<AbstractEnterpriseUnit> childNodes = new ArrayList<>();

    public AbstractUnit(String name) {

        super(name);

    }

    public boolean add(AbstractEnterpriseUnit childNode) {

        if(childNode == null) throw new NullPointerException();



        return true;

    }

    public boolean remove(AbstractEnterpriseUnit childNode) {

        if(childNode == null) throw new NullPointerException();

        return childNodes.remove(childNode);}

    public List<AbstractEnterpriseUnit> getChildNodes() {return childNodes;}

    @Override
    public String getName() {return "Abstract Unit";}

}
