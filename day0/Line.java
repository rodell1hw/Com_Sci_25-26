public class Line {
    int a;
    int b;
    int c;

    Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public double calculateSlope() {
        double slope = - (double) (a) / (double) (b);
        return slope;
    }

    public boolean isCoordinateOnLine(int x, int y) {
        if (this.a * x + this.b * y + c == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Equation: " + a + "x + " + b + "y + " + c + " = 0";
    }

    public boolean equals(Line other) {
        if (this.a == other.a && this.b == other.b && this.c == other.c) {
            return true;
        } else {
            return false;
        }
    }
}

