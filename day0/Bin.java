public class Bin {

    private double heightft = 2.4;
    private String shape = "rectangular";
    private boolean isClosed = true;
    private String contents = "plastic";
    private int holes = 1;
    private char initial = 'B';


    //this runs when you make a new bin
    public Bin() {
        heightft = 2.4;
        shape = "rectangular";
        isClosed = true;
        contents = "plastic";
        holes = 2;
        initial = 'B';
    }

    public Bin(int numOfHoles){
        heightft = 2.4;
        shape = "rectangular";
        isClosed = true;
        contents = "plastic";
        holes = numOfHoles;
        initial = 'B';
    }

    public String toString(){
        return "This bin is " + heightft + "ft tall, has "
         + contents + ", and has " + holes + " holes.";
    }
    
    public boolean equals(Bin otherBin){ 
        if (
            this.contents.equals(otherBin.contents) &&
            this.heightft == otherBin.heightft &&
            this.holes == otherBin.holes &&
            this.initial == otherBin.initial &&
            this.shape == otherBin.shape &&
            this.isClosed == otherBin.isClosed
            ){
            return true;
        } else {
            return false;
        }

    }

    public void rename(){
        initial = 'T';
        System.out.print("You renamed the bin");
        System.out.print(initial);


    }

    public void empty(){
        contents = "nothing";
        System.out.print("You emptied the bin ");
        System.out.print(contents);
        System.out.print("You emptied the bin so now theres " + contents);

    }

    public void shake(){
        System.out.print("You shook the bin ");
    }

    public void open(boolean isClosed){
        if (isClosed == true) {
            System.out.println("You opened the bin ");
            isClosed = false;
        } else {
            System.out.println("Bin is already open ");
        }

    }
    
    //store
    //empty
    //shake
    //open
}