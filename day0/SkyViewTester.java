public class SkyViewTester {
    public static void main(String[] args) {
        double[] scanned = new double[] { 0.3, 0.7, 0.8, 1.1, 1.4, 0.4, 0.1, 0.4, 0.1 };
        try {
            SkyView sky1 = new SkyView(2, 3, scanned);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        SkyView sky1 = new SkyView(4, 3, scanned);
        SkyView sky2 = new SkyView(2, 3, scanned);
        System.out.println(sky1.toString());
        System.out.println(sky1.equals(sky2));
        System.out.println(sky1.getAverage(1, 2, 0, 1));

    }
}
