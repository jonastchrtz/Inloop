package Inloop.Exam.Enterprise_Node;

public class Holding extends AbstractUnit {

    public Holding(String name) {

        super(name);

    }

    @Override
    public String getName() {return name;}

    @Override
    public boolean add(AbstractEnterpriseUnit childNode) {

        if (childNode instanceof Holding || childNode instanceof Division || childNode instanceof Team) {
            throw new IllegalArgumentException();
        }
        return super.add(childNode);

    }
}
