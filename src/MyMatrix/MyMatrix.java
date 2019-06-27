package MyMatrix;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class MyMatrix<T> implements Matrix {

    private HashMap<MatrixIndex, Object> matrixEntries;
    private int numberRows;
    private int numberColumns;

    public MyMatrix() {

        matrixEntries = new HashMap<>();
        numberRows = 0;
        numberColumns = 0;

    }

    @Override
    public int getRowCount() {
        return numberRows;
    }

    @Override
    public int getColumnCount() {
        return numberColumns;
    }

    @Override
    public int getObjectCount() {

        int object_count = 0;

        for (HashMap.Entry<MatrixIndex, Object> e : matrixEntries.entrySet()) {

            if (e.getValue() != null) {
                object_count++;
            }

        }

        return object_count;

    }

    @Override
    public int getDistinctObjectCount() {

        HashSet<Object> distinct_count = new HashSet<>();

        for (HashMap.Entry<MatrixIndex, Object> e : matrixEntries.entrySet()) {

            if (e.getValue() != null) {

                distinct_count.add(e.getValue());
            }

        }

        return distinct_count.size();
    }

    @Override
    public Iterator iterator() {
        return new DepthFirstIterator();
    }

    @Override
    public Object get(int row, int column) {

        if (row > getRowCount() - 1 || column > getColumnCount() - 1 || row < 0 || column < 0) {
            throw new IllegalArgumentException();
        }

        return matrixEntries.get(new MatrixIndex(row, column));

    }

    @Override
    public Object put(int row, int column, Object value) {

        if (row < 0 || column < 0) {
            throw new IllegalArgumentException();
        }

        if (row + 1 > numberRows) {
            numberRows = row + 1;
        }
        if (column + 1 > numberColumns) {
            numberColumns = column + 1;
        }

        Object old_value = matrixEntries.get(new MatrixIndex(row, column));

        matrixEntries.put(new MatrixIndex(row, column), value);

        return old_value;

    }

    @Override
    public boolean contains(Object value) {
        return matrixEntries.containsValue(value);
    }

    class DepthFirstIterator<E> implements Iterator<E> {

        private int row, column;
        private E next, current;

        public DepthFirstIterator() {

            row = 0;
            column = 0;
            next = null;
            current = null;

            findFirst();

        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public E next() {

            if (!hasNext()) throw new NoSuchElementException();

            current = next;
            for (int y = column; y < getColumnCount(); y++) {
                for (int x = row; x < getRowCount(); x++) {

                    E object = (E) matrixEntries.get(new MatrixIndex(x, y));

                    if (object != null) {

                        row = x + 1;
                        column = y;
                        next = object;

                        return current;

                    }

                }

                row = 0;

            }

            next = null;
            return current;

        }

        public boolean hasNext() {
            return next != null;
        }

        private void findFirst() {
            for (int y = column; y < getColumnCount(); y++) {
                for (int x = row; x < getRowCount(); x++) {
                    E object = (E) matrixEntries.get(new MatrixIndex(x, y));
                    if (object != null) {
                        row = x + 1;
                        column = y;
                        next = object;
                        return;
                    }
                }
                row = 0;
            }
            next = null;
        }
    }

}





