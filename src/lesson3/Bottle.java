package lesson3;

public class Bottle <T extends Drink> {

    private T content;

    public boolean isEmpty() {

        return content == null;

    }

    public void fill(T content) {

        if (!isEmpty()){

            throw new IllegalStateException();

        }

        this.content = content;

    }

    public T empty() {

        if (isEmpty()){

            throw new IllegalStateException();

        }

        T output = content;
        content = null;
        return output;

    }

}

