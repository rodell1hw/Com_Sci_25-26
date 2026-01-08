public class CourseTester {
    public static void main(String[] args) {

        StudentRecord ana = new StudentRecord("ana", new int[] { 90, 89, 91, 95 });
        StudentRecord bill = new StudentRecord("bill", new int[] { 91, 89, 91, 95 });

        // System.out.println(ana.getName());
        // System.out.println(ana.getAverage(0, 3));
        Course bio = new Course("Biology", 30);
        bio.enrollStudent(ana);
        bio.enrollStudent(bill);
        System.out.println(bio.countEnrolledStudents());
    }
}
