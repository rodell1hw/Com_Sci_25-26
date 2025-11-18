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

    public static char generateCatChar(String catId) {
        int runningChar = 0;
        for (int i = 0; i < catId.length(); i++) {
            int char1 = Integer.parseInt("" + catId.charAt(i));
            runningChar += char1;
        }
        return (char) ('A' + ((runningChar) % 26));
    }

    public static int generateRandomNumber(int low, int high) {
        if (low > high) {
            low = high;
        }
        return (int)((Math.random() * (high - low + 1) + low));
    }

    public static String validateCatId(String catId) {
        if (catId == null) {
            // return "" + PurrfectUtils.generateRandomNumber(1000, 9999);
            return "1234";
        }
        if (
        catId.charAt(0) != '1' && 
        catId.charAt(0) != '2' && 
        catId.charAt(0) != '3' && 
        catId.charAt(0) != '4' && 
        catId.charAt(0) != '5' && 
        catId.charAt(0) != '6' && 
        catId.charAt(0) != '7' && 
        catId.charAt(0) != '8' && 
        catId.charAt(0) != '9') {
            return "" + generateRandomNumber(1000, 9999);
        }
        if (Integer.parseInt(catId) >= 1000 && Integer.parseInt(catId) <= 9999 && catId.length() == 4) {
            return catId;
        } else {
            return "" + generateRandomNumber(1000, 9999);
        }
    }

    public static int validateMoodLevel(int moodLevel) {
        if (moodLevel > 10) {
            moodLevel = 10;
        } else if (moodLevel < 0) {
            moodLevel = 0;
        }
        return moodLevel;
    } 

    public static void bootUp(Cat cat) {
        System.out.println(cat.toString());
    }

    public static void pet (Cat cat) {
        System.out.println("Attempting to pet...");
        if (cat.getMoodLevel() >= 2 || cat.isHungry() == false) {
            cat.setMoodLevel(cat.getMoodLevel() + 1);
            System.out.println("Petting successful!");
        } else {
            cat.setMoodLevel(cat.getMoodLevel() - 1);
            System.out.println("Petting failed...");
        }
    }

    public static void trimClaws(Cat cat) {
        System.out.println("Attempting to trim claws...");
        if (generateRandomNumber(1, 2) == 1) {
            cat.setMoodLevel(cat.getMoodLevel() - 1);
            System.out.println(cat.getName() + " dId not like that...");
        } else {
            cat.setMoodLevel(cat.getMoodLevel() - 2);
            System.out.println(cat.getName() + " really hated that!");
        }
    }

    public static void cleanLitterBox(Cat cat) {
        System.out.println("Cleaning the litter box...\n" + "Done! \n" + "Cookie appreciated that.");
        cat.setMoodLevel(cat.getMoodLevel() + 1);
        cat.setHungry(true);
    }

    public static void feed(Cat cat) {
        System.out.println("Filling up Cookie's bowl...\n" + "Done!\n" + "Cookie is eating...\n" + "Cookie is full!");
        cat.setMoodLevel(cat.getMoodLevel() + 2);
        cat.setHungry(true);
    }
}

