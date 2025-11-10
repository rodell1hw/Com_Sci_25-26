public class NPC {
    private String choice;
    NPC() {
        choice = RPSGame.generateRandomChoice();
    }

    public void setChoice(String choice) {
        if (RPSGame.validateChoice(choice.toLowerCase()) == false) {
            this.choice = RPSGame.generateRandomChoice();
        } else {
            this.choice = choice.toLowerCase();
        }
    }

    public String toString() {
        return "Opponent chose " + choice + ".";
    }

    public String getChoice() {
        return choice;
    }

}
