public class StudentTester {
    public static void main(String[] args) {
        Student freshman = new Student("Noni", 10);
        Student sophmore = new Student("Eze");
        Student junior = new Student("Declan", 11);
        Student senior = new Student("Martin");

        System.out.println(freshman.toString());
        System.out.println(sophmore.getId());
        System.out.println(freshman.toString());
        System.out.println(junior.getName());

        System.out.println(freshman.equals(freshman));
        System.out.println(junior.equals(senior));
    }
}