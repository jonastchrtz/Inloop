package Inloop.Exam.COOLIDEAS;

public class JTopic extends JContent {

    private int id;

    public JTopic(String title, String description, int id) {

        super(title, description);
        this.id = id;

    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Topic: " + getTitle() + "\n" + getDescription();
    }

}
