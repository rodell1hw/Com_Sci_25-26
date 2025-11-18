public class Course {
    // instance variables
    private String courseName;
    private StudentRecord[] enrolledStudents;

    // constructors
    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    // getters
    // to-do: implement getters

    public String getCourseName() {
        return courseName;
    }

    public StudentRecord[] getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setEnrolledStudents(StudentRecord[] enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
    

    // inherited methods

    // to-do: implement toString
    public String toString() {
        String x = "== " + courseName + " ==\n";
        for (int i = 0; i < enrolledStudents.length; i++) {
            x += (i + 1 + ".) " + enrolledStudents[i].toString() + "\n");
        }
        return x;
    }

    // methods

    /*
     * Iterates through the enrolledStudents array and returns the name of the
     * student with the best final average.
     * 
     * @return the name of the student with the best final average
     */
    // to-do: implement findBestStudent
    public String findBestStudent() {
        double best = 0;
        String student = "";
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i].getFinalAverage() > best) {
                best = enrolledStudents[i].getFinalAverage();
                student = enrolledStudents[i].getName();
            }
        }
        return student;
    }

    /*
     * Iterates through the enrolledStudents array and returns the average of the
     * specified test number.
     * 
     * @return a double representing the average of the specified test number
     */
    // to-do: implement calculateTestAverage
    public double calculateTestAverage(int testNum) {
        double sum = 0.0;
        int counter = 0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            sum += enrolledStudents[i].getScores()[testNum];
            counter += 1;
        }
        return sum / counter;
    }

}
