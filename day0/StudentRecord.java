public class StudentRecord {
    // instance variables
    private String name;
    private int[] scores;

    // constructors
    public StudentRecord(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    // getters
    public String getName() {
        return name;
    }

    public int[] getScores() {
        return scores;
    }

    public int getTestScore(int i) {
        if (i > scores.length || i < 0) {
            return -1;
        }
        return getScores()[i];
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    // to-do: implement getters
    // to-do: implement getTestScore

    // inherited methods
    // to-do: implement toString
    public String toString() {
        String addScores = "";
        for (int i = 0; i < scores.length; i++) {
            if (i + 1 != scores.length) {
                addScores += scores[i] + ", ";
            } else {
                addScores += scores[i];
            }
        }
        return "" + name + "'s scores: [" + addScores + "]";
    }

    public boolean equals(StudentRecord other) {
        for (int i = 0; i < other.scores.length; i++) {
            for (int j = 0; i < scores.length; i++) {
                if (i != j) {
                    return false;
                }
            }
        } 
        return true;
    }

    // methods

    /*
     * returns the average (arithmetic mean) of the values in scores
     * precondition: 0 <= first < last < scores.length
     * 
     * @param first - the first index of the scores array
     * 
     * @param last - the last index of the scores array
     * 
     * @return the double average of the values in scores
     */
    public double getAverage(int first, int last) {
        int runningSum = 0;
        for (int i = first; i != last + 1; i++) {
            runningSum += scores[i];
        }
        return (double) (runningSum) / (last - first + 1);
    }

    /*
     * Determines if each successive value in scores is greater
     * than or equal to the previous value
     * 
     * @return true if student has improved, false otherwise
     */
    public boolean hasImproved() {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] <= scores[i - 1]) {
                return false;
            }
        }
        return true;
    }

    /*
     * The method determines if the student has improved and returns the average
     * score appropriately:
     * If the student has improved, returns the average
     * of the top half of the scores array.
     * Otherwise, returns the average of all of the values in scores
     * 
     * @return the double average of test scores
     */

    public double getFinalAverage() {
        double average = 0.0;
        if (hasImproved() == true) {
            average = getAverage(scores.length / 2, scores.length - 1);
        } else {
            average = getAverage(0, scores.length - 1);
        }
        return average;
    }

}