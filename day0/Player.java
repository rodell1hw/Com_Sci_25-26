public class Player {
    private String choice;
    private String name;

    public void setChoice(String choice) {
        if (RPSGame.validateChoice(choice.toLowerCase()) == false) {
            this.choice = RPSGame.generateRandomChoice();
        } else {
            this.choice = choice.toLowerCase();
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChoice() {
        return choice;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "" + name + " chose " + choice + ".";
    }
}
