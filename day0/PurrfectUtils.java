public class PurrfectUtils {
    public static String determineCatMood (Cat cat) {
        if (cat.getMoodLevel() > 7) {
            return "Currently, " + cat.getName() + " is in a great mood.\nPetting is appreciated.";
        } else if (cat.getMoodLevel() > 3) {
            return "Currently, " + cat.getName() + " is reminiscing of a past life.\nPetting is accepted.";
        } else {
            return "Currently, " + cat.getName() + " is plotting revengeance.\nPetting is extremely risky.";
        }
    }

    public static char generateCatChar(Cat cat) {
        int digitThree = cat.getCatID() % 10;
        int digitTwo = (cat.getCatID() / 10) % 10;
        int digitOne = (cat.getCatID() / 100) % 10;
        return (char) ('A' + ((digitOne + digitTwo + digitThree) % 26));
    }
}
