public class CatTester {
    public static void main(String[] args) {
        Cat myCat = new Cat("Betsy", "Tabby"); //12. added new
        Cat otherCat = new Cat("Tiger Beast", "Tabby"); //13. added new
        System.out.println(myCat.toString() + 
        "My Cat's Name: " + myCat.getName()); //14. replaced ; with + and changed parenthesies position

        System.out.println( "Are the cat's equal?" + myCat.equals(otherCat)); //15. changed return to sysout

        System.out.println(("Is my cat hungry? " + myCat.getIsHungry())); //16. changed print to sysout

        String firstName = "Tiger";
        String lastName = "Beast"; //17. changed == to =
        String name = firstName + " " + lastName;

        System.out.println("Changing the cat's name...");
        myCat.setName(name);
        System.out.println("The two cat's are the same now: " + myCat.equals(otherCat));

    }

}