public class MatrixFun {
    private int[][] matrix;

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    MatrixFun(int[][] starterMatrix) {
        this.matrix = starterMatrix;
    }

    MatrixFun(int numberOfRows, int numberOfCols) {
        if (numberOfRows < 1 || numberOfCols < 1) {
            throw new IllegalArgumentException();
        }
        this.matrix = new int[numberOfRows][numberOfCols];
        for (int r = 0; r < numberOfRows; r++) {
            for (int c = 0; c < numberOfCols; c++) {
                matrix[r][c] = (int) (Math.random() * 10);
            }
        }
    }

    MatrixFun() {
        this(3, 3);
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < matrix[0].length * 2 - 1; i++) {
            str += "=";
        }
        str += "\n";
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                str += "" + matrix[r][c];
                // if (c != matrix[0].length - 1) {
                // str += " ";
                // }
                str += " ";
            }
            str += "\n";
        }
        for (int i = 0; i < matrix[0].length * 2 - 1; i++) {
            str += "=";
        }
        return str;
    }

    public boolean equals(MatrixFun other) {
        if (this.toString().equals(other.toString())) {
            return true;
        } else {
            return false;
        }

    }

    public boolean equals(int[][] other) {
        if (other.length != matrix.length || other[0].length != matrix[0].length) {
            return false;
        }
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (matrix[r][c] != other[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void replaceAll(int oldValue, int newValue) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (matrix[r][c] == oldValue) {
                    matrix[r][c] = newValue;
                }
            }
        }
    }

    public void swapRow(int a, int b) {
        if (a < 0 || b < 0 || a > matrix.length - 1 || b > matrix.length - 1) {
            throw new IllegalArgumentException();
        }
        int[][] ary = new int[matrix.length][matrix[0].length];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                ary[r][c] = matrix[r][c];
            }
        }
        matrix[a] = ary[b];
        matrix[b] = ary[a];
    }

}