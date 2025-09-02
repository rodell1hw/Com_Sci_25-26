public class Bin {

    private double heightft = 2.4;
    private String shape = "rectangular";
    private boolean isCLosed = true;
    private String contents = "plastic";
    private int holes = 1;
    private char initial = 'B';


    //this runs when you make a new bin
    public Bin() {
        double heightft = 2.4;
        String shape = "rectangular";
        boolean canOpen = true;
        String contents = "plastic";
        int holes = 1;
        char initial = 'B';
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
        if (isCLosed == true) {
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