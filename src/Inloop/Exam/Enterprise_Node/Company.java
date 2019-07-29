package Inloop.Exam.Enterprise_Node;

public class Company extends AbstractUnit {

    public Company(String name) {

        super(name);

    }

    @Override
    public String getName() {return name;}

    @Override
    public boolean add(AbstractEnterpriseUnit childNode) {

        if (childNode instanceof Holding || childNode instanceof Company || childNode instanceof Team) {
            throw new IllegalArgumentException();
        }
        return super.add(childNode);

    }
}
