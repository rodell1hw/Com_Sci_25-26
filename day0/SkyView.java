public class SkyView {
    private double[][] view;

    SkyView(int numberOfRows, int numberOfCols, double[] scanned) {
        if (numberOfCols * numberOfRows < scanned.length) {
            throw new IllegalArgumentException();
        }
        int a = -1;
        int temp = 0;
        int temp2 = 0;
        view = new double[numberOfRows][numberOfCols];
        for (int r = 0; r < numberOfRows; r++) {
            for (int c = 0; c < numberOfCols; c++) {
                if (r % 2 == 0) {
                    if (temp2 == 1) {
                        a += numberOfCols - 1;
                        temp2 = 0;
                    }
                    a++;
                } else {
                    if (temp == 0) {
                        a += numberOfCols + 1;

                        temp = 1;
                    }
                    a--;
                    if (c == numberOfCols - 1) {
                        temp2 = 1;
                    }
                }
                view[r][c] = scanned[a];
            }
            temp = 0;

        }
    }

    public double[][] getView() {
        return view;
    }

    public void setView(double[][] view) {
        this.view = view;
    }

    public String toString() {
        String str = "";
        for (int r = 0; r < view.length; r++) {
            for (int c = 0; c < view[0].length; c++) {
                str += view[r][c] + " ";
            }
            str += "\n";
        }
        return str;
    }

    public boolean equals(SkyView other) {
        for (int r = 0; r < this.view.length; r++) {
            for (int c = 0; c < this.view[0].length; c++) {
                if (this.view[r][c] != other.view[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        double sum = 0;
        int counter = 0;
        for (int r = startRow; r <= endRow; r++) {
            for (int c = startCol; c <= endCol; c++) {
                sum += view[r][c];
                counter++;
            }
        }
        return sum / counter;
    }
}
