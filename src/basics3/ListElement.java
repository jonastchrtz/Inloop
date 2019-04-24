package basics3;

public class ListElement {

    public String content;
    public ListElement next;

    public ListElement(String content) {

        if (content.isEmpty()){

            throw new IllegalArgumentException("The argument 'content' cannot be empty!");

        }

        this.content = content;

    }

    public String getContent() {

        return content;
    }

    public void setContent(String content) {

        if (content == null){

            throw new NullPointerException("The argument 'content' cannot be null");

        }

        if (content.isEmpty()) {

            throw new IllegalArgumentException("The argument 'content' connot be empty");

        }

        this.content = content;
    }

    public ListElement getNext() {

        return next;

    }

    public void setNext(ListElement next) {

        this.next = next;

    }

}
