public class MatrixFunTester {
    public static void main(String[] args) {
        MatrixFun m = new MatrixFun();

        try {
            MatrixFun d = new MatrixFun();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        MatrixFun n = new MatrixFun();
        System.out.println(m.toString());
        System.out.println(m.equals(n));
        // m.replaceAll(1, 9);
        try {
            m.swapRow(1, 2);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println(m.toString());

    }
}
