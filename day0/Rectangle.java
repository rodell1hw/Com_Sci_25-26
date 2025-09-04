public class Rectangle {
    private int width;
    private int length;



    //constructors
    public Rectangle(){
        length = 8;
        width = 12;
    }

    //define the instance variable
    public Rectangle(int desiredLength, int desiredWidth){
        length = desiredLength;
        width = desiredWidth;
    }

    public Rectangle(int squareSideLength){
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
    public void setLength(int newLength){
        length = newLength;
    }

    public void setWidth(int newWidth){
        width = newWidth;
    }


    //methods
    public int calculateArea() {
        int area = length * width;
        return area;
    }

    public int calculatePerimeter(){
        int perimeter = 2 * length + 2 * width;
        return perimeter;
    }

    public double calculateDiagnol(){
        double diagnol = Math.sqrt(length*length + width*width);
        return diagnol;
    }

    //inherited methods 
}
