public class BinTester {
    public static void main(String[] args){
        System.out.print("hello ");

        Bin period1Bin = new Bin();
        Bin period1Bin2 = new Bin(3);

        // period1Bin.shake();
        // period1Bin.empty();
        // period1Bin.open(true);
        System.out.println(period1Bin.toString());
        System.out.println(period1Bin2.toString());
    }
}