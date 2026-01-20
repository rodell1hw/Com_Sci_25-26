public class StudentTester {
    public static void main(String[] args) {
        StudentOG freshman = new StudentOG("Noni", 10);
        StudentOG sophmore = new StudentOG("Eze");
        StudentOG junior = new StudentOG("Declan", 11);
        StudentOG senior = new StudentOG("Martin");

        System.out.println(freshman.toString());
        System.out.println(sophmore.getId());
        System.out.println(freshman.toString());
        System.out.println(junior.getName());

        System.out.println(freshman.equals(freshman));
        System.out.println(junior.equals(senior));
    }
}