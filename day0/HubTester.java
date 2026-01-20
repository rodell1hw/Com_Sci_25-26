public class HubTester {
    public static void main(String[] args) {
        Hub h = new Hub();

        try {
            Student autrin = new Student("", "Blowout3", "aa1@hwemail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            Student autrin = new Student(null, "Blowout3", "aa1@hwemail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            Student autrin = new Student("Autrin", "Blowout3", "");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            Student autrin = new Student("Autrin", "Blowout3", null);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            Student autrin = new Student("Autrin", "Blowout3", "aa1hwemail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            Student autrin = new Student("Autrin", "Blowout3", "aa1@hwemail,com");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            Student autrin = new Student("Autrin", "", "aa1@hwemail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            Student autrin = new Student("Autrin", null, "aa1@hwemail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            Student autrin = new Student("@utrin", "Blowout3", "aa1@hwemail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            Student autrin = new Student("Autrin", "Blowout3", "aa2@hwemail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            Student autrin = new Student("Autrin", "Blowout3", "aa1@hwemail.com");
            autrin.changeName("");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            Student autrin = new Student("Autrin", "Blowout3", "aa1@hwemail.com");
            autrin.changeName(null);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            Student autrin = new Student("Autrin", "Blowout3", "aa1@hwemail.com");
            autrin.changeName("@tree");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            Student autrin = new Student("Autrin", "Blowout3", "aa1@hwemail.com");
            autrin.changeName("Autrin");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            Student autrin = new Student("", "Blowout3", "aa1@hwemail.com");
            autrin.resetPassword();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            Student autrin = new Student(null, "Blowout3", "aa1@hwemail.com");
            autrin.resetPassword();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            // too little characters but will never happen
            Student autrin = new Student("Autrin", "Blowout3", "aa1@hwemail.com");
            autrin.resetPassword();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            Student autrin = new Student("Autrin", "Blowout3", "aa1@hwemail.com");
            Assignment unit3exercises = new Assignment("unit3exercises", "boredom");
            autrin.submitAssignment(null, "boredom");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            Student autrin = new Student("Autrin", "Blowout3", "aa1@hwemail.com");
            Assignment unit3exercises = new Assignment("unit3exercises", "boredom");
            autrin.submitAssignment("", "boredom");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            Student autrin = new Student("Autrin", "Blowout3", "aa1@hwemail.com");
            Assignment unit3exercises = new Assignment("unit3exercises", "boredom");
            autrin.submitAssignment("unit3exercises", "");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            Student autrin = new Student("Autrin", "Blowout3", "aa1@hwemail.com");
            Assignment unit3exercises = new Assignment("unit3exercises", "boredom");
            autrin.submitAssignment("unit3exercises", null);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            Student autrin = new Student("Autrin", "Blowout3", "aa1@hwemail.com");
            Assignment unit3exercises = new Assignment("unit3exercises", "boredom");
            autrin.submitAssignment("unit3exercises", "");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        Student autrin = new Student("Autrin", "Blowout3", "aa1@hwemail.com");
        try {
            h.registerStudent(null, "Blowout4", "ll1@hwemail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            h.registerStudent("", "Blowout4", "ll1@hwemail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            h.registerStudent("Larry", "", "ll1@hwemail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            h.registerStudent("Larry", null, "ll1@hwemail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            h.registerStudent("Larry", "Blowout4", "");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            h.registerStudent("Larry", "Blowout4", null);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            h.registerStudent("Larry", "Blowout4", "ll1@hwemail,com");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            h.registerStudent("Larry", "Blowout4", "ll1hwemail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            h.registerStudent("Larry@", "Blowout4", "ll1@hwemail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            h.registerStudent("Autrin", "Blowout3", "aa1@hwemail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            h.registerStudent("Larrya", "Blowout4", "ll11@hwemail.com");
            h.registerStudent("Larryb", "Blowout41", "ll12@hwemail.com");
            h.registerStudent("Larryc", "Blowout42", "ll13@hwemail.com");
            h.registerStudent("Larryd", "Blowout43", "ll14@hwemail.com");
            h.registerStudent("Larrye", "Blowout44", "ll15@hwemail.com");
            h.registerStudent("Larryf", "Blowout45", "ll16@hwemail.com");
            h.registerStudent("Larryg", "Blowout46", "ll17@hwemail.com");
            h.registerStudent("Larryh", "Blowout47", "ll18@hwemail.com");
            h.registerStudent("Larryi", "Blowout48", "ll19@hwemail.com");
            h.registerStudent("Larryj", "Blowout49", "ll10@hwemail.com");
            h.registerStudent("Larryk", "Blowout40", "ll111@hwemail.com");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            h.loginStudent("", "Blowout3");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            h.loginStudent(null, "Blowout3");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            h.loginStudent("Autrin", "");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            h.loginStudent("Autrin", null);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            h.loginStudent("Autriny", "Blowout3");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            h.loginStudent("Autrin", "Glowout3");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
