public class Student {
    private String name;
    private int grade;
    private String id;

    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.id = generateId();
    }

    Student(String name) {
        this.name = name;
        this.grade = 10;
        this.id = generateId();
    }

    public int getGrade() {
        return grade;
    }
    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String generateId() {
        int x = (int) (Math.random() * 8 + 1);
        String idString = "" + x;
        x = (int) (Math.random() * 8 + 1);
        idString += x;
        x = (int) (Math.random() * 8 + 1);
        idString += x;
        idString += "-";
        x = (int) (Math.random() * 9 + 1);
        idString += x;
        x = (int) (Math.random() * 9 + 1);
        idString += x;
        x = (int) (Math.random() * 9 + 1);
        idString += x;
        x = (int) (Math.random() * 9 + 1);
        idString += x;
        return idString;
    }
       
    public String toString() {
        return name + "is a " + grade + "th grade student. Their id is " + id;
    }

    public Boolean equals(Student other) {
        if (this.id.equals(other.id)
            && this.name.equals(other.name)
            && this.grade == other.grade) {
            return true;
        } else {
            return false;
        }
    }
}
