package Inloop.Exam.Enterprise_Node;

public abstract class AbstractEnterpriseUnit implements EnterpriseNode{

    String name;

    public AbstractEnterpriseUnit(String name) {

        if(name.isEmpty()) throw new IllegalArgumentException();

        this.name = name;

    }

    @Override
    public String getName() {

        return "Abstract Enterprise Unit";}

}
