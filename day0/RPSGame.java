import java.util.Scanner;
public class RPSGame {
    private Player player;
    private NPC opponent;


    RPSGame(Player player, NPC opponent) {
        this.player = player;
        this.opponent = opponent;
    }

    public static int generateRandomNumber(int low, int high) {
        if (low > high) {
            low = high;
            high = low;
        }
        return (int) ((Math.random() * (high - low + 1) + low));
    }

    public void setPlayerValues(String name, String choice) {
        player.setChoice(choice);
        player.setName(name);
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        System.out.println("name: ");
        String name = scan.nextLine();
        System.out.println("choice: ");
        String choice = scan.nextLine();
        int i = 0;
        while (validateChoice(choice) == false){
            System.out.println("invalid, choice again: ");
            choice = scan.nextLine();
            i++;
            if (i > 3) {
                setPlayerValues(name, generateRandomChoice());
            }
        }
        setPlayerValues(name, choice);
    }

    public boolean didPlayerWin() {
        if (player.getChoice().equals(opponent.getChoice())) {
            return false;
        } else if (player.getChoice().equals("rock") && opponent.getChoice().equals("scissors")){
            return true;
        } else if (player.getChoice().equals("scissors") && opponent.getChoice().equals("paper")){
            return true;
        } else if (player.getChoice().equals("paper") && opponent.getChoice().equals("rock")){
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        if (didPlayerWin() == true) {
            return "" + player.getName() + "won, Yay!";
        } else {
            return "Opponent won, bad luck!";
        }
    }

    public String displayResults() {
        return "== GAME RESULTS ==\n" + player.getName() + "chose "  
            + player.getChoice() + ".\n" + "Opponent chose " + opponent.getChoice() 
            + ".\n" + toString();
        }


    public static boolean validateChoice(String choice) {
        if (choice.toLowerCase() == "rock" || choice.toLowerCase() == "scissors" || choice.toLowerCase() == "paper") {
            return true;
        } else {
            return false;
        }
    }

    public static String generateRandomChoice() {
        int i = generateRandomNumber(1, 3);
        if (i == 1) {
            return "rock";
        } else if (i == 2) {
            return "scissors";
        } else {
            return "paper";
        } 
    }
}
