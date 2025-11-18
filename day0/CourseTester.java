public class CourseTester {
    public static void main(String[] args) {

        StudentRecord ana = new StudentRecord("ana", new int[] {90, 89, 91, 95});
        System.out.println(ana.getName());
        System.out.println(ana.getAverage(0, 3));
    }
}
