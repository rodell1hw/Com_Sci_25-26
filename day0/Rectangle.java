public class Rectangle {
    private int width;
    private int length;
    private int area;
    private int perimeter;
    private double diagonal;

    //constructors
    public Rectangle() {
        length = 5;
        width = 10;
    }

    //define the instance variable
    public Rectangle(int desiredLength, int desiredWidth) {
        length = desiredLength;
        width = desiredWidth;
    }

    public Rectangle(int squareSideLength) {
        length = squareSideLength;
        width = squareSideLength;
    }

    // getter
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    
    //setters
    public void setLength(int newLength) {
        length = newLength;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }


    //methods
    public int getArea() {
        this.area = length * width;
        return this.area;
    }

    public boolean equals(Rectangle otherRectangle) {
        if (this.length == otherRectangle.length && this.width == otherRectangle.width) {
            return true;
        } else {
            return false;
        }
    }

    public int getPerimeter() {
        this.perimeter = 2 * length + 2 * width;
        return this.perimeter;
    }

    public double getDiagonal() {
        this.diagonal = Math.sqrt(length * length + width * width);
        return this.diagonal;
    }

    

    // public int getArea() {
    //     return area;
    // }

    // public int getPerimeter() {
    //     return perimeter;
    // }

    // public double getDiagonal() {
    //     return diagonal;
    // }

    //inherited methods 
}
