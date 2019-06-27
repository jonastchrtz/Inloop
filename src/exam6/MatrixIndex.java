package exam6;

public class MatrixIndex {

    private int row;
    private int column;

    public MatrixIndex(int row, int column) {

        this.row = row;
        this.column = column;

    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;

        if (o == null)
            return false;

        if (getClass() != o.getClass())
            return false;

        MatrixIndex index = (MatrixIndex) o;

        if (row != index.row)
            return false;

        if (column != index.column)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return row * 31 + column;
    }

}
