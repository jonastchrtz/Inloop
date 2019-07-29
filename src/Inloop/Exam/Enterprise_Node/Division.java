package Inloop.Exam.Enterprise_Node;

public class Division extends AbstractUnit {

    public Division(String name) {

        super(name);

    }

    @Override
    public String getName() {return name;}

    @Override
    public boolean add(AbstractEnterpriseUnit childNode) {

        if (childNode instanceof Holding || childNode instanceof Company || childNode instanceof Division) {
            throw new IllegalArgumentException();
        }
        return super.add(childNode);

    }
}
