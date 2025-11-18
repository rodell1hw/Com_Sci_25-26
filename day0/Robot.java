public class Robot {
    // to-do: change file name, class, and constructor to Robot

    private int[] hallway;
    private int position; // the robot's current position
    private boolean isFacingRight; // true if the robot is facing right

    public int[] getHallway() {
        return hallway;
    }

    public int getPosition() {
        return position;
    }

    public boolean isFacingRight() {
        return isFacingRight;
    }

    public void setFacingRight(boolean isFacingRight) {
        this.isFacingRight = isFacingRight;
    }

    public void setHallway(int[] hallway) {
        for (int i = 0; i != hallway.length; i++) { 
            if (hallway[i] < 0) {
                hallway[i] = 0;
            }
        }
        this.hallway = hallway;
    }

    public void setPosition(int position) {
        if (position > hallway.length) {
            position = hallway.length - 1;
        }
        if (position < 0) {
            position = 0;
        }
        this.position = position;
    }

    public Robot(int[] hallwayToClean, int startingPosition) {
        this.isFacingRight = true;
        setHallway(hallwayToClean);
        setPosition(startingPosition);
    }


    /*
     * Determines if the robot is blocked by a wall (the end of an array)
     * 
     * @return true if the robot is blocked by a wall, false otherwise
     */
    public boolean isRobotBlockedByWall() {
        // to-do: implement this method
        if ((isFacingRight && position + 1 == hallway.length) || (isFacingRight == false && position == 0)) {
            return true;
        }
        return false;
    }

    /*
     * Commands the robot to pick up an item, move forward or turn around
     */
    public void move() {
        // to-do: implement this method
        if (hallway[position] == 1) {
            hallway[position] = 0;
            if (isRobotBlockedByWall()) {
                isFacingRight = !isFacingRight;
            } else if (isFacingRight) {
                position += 1;
            } else {
                position -= 1;
            }
        } else if (hallway[position] != 0) {
            hallway[position] -= 1;
        } else {
            if (isRobotBlockedByWall() == true) {
                isFacingRight = !isFacingRight;
            } else if (isFacingRight == true) {
                position += 1;
            } else {
                position -= 1;
            }
        }
        displayState();
    }

    /**
     * This method displays the current state of the robot and the hallway. It then
     * calls the move() method and counts the number of moves it takes to clear the
     * hallway. The method should display the current state of the robot after each
     * move.
     * 
     * @return the number of moves made
     */

    public int clearHall() {
        int count = 0;
        // to-do: implement this method
        displayState();
        while (hallIsClear() == false) {
            move();
            count += 1;
        }
        return count;
    }

    /**
     * This method determines if the hallway contains any items.
     * 
     * @return a boolean value indicating if the hallway contains any items
     */
    public boolean hallIsClear() {
        // to-do: implement this method
        for (int i = 0; i != hallway.length; i++) {
            if (hallway[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /*
     * Displays the current state of the robot and the hallway.
     */
    public void displayState() {
        // to-do: implement this method
        for (int i = 0; i < hallway.length; i++) {
            System.out.print(hallway[i] + " ");
        }
        String spaces = "\n";
        for (int j = 0; j < position; j++) {
            spaces += "  ";
        }
        if (isFacingRight) { 
            System.out.println(spaces + ">");
        } else {
            System.out.println(spaces + "<");
        }
    }
}
