public class RectangleTester {
    public static void main(String[] args) {
        //
        Rectangle trevor = new Rectangle(4, 10);
        Rectangle stewart = new Rectangle(8);

        trevor.setWidth(6);

        System.out.println("Testing getWidth: " + trevor.getWidth());

        trevor.setWidth(5);

        System.out.println("Testing getWidth: " + trevor.getWidth());

        System.out.println("Testing area: " + stewart.calculateDiagnol());

    }

}
