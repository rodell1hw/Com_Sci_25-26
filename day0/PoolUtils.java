public class PoolUtils {
    public static int validateCleanlinessLevel(int cleanlinessLevel) {
        if (cleanlinessLevel > 10) {
            cleanlinessLevel = 10;
        } else if (cleanlinessLevel < 0) {
            cleanlinessLevel = 0;
        } else {
            cleanlinessLevel = cleanlinessLevel;
        }
        return cleanlinessLevel;
    }

    public static int generateRandomNumber(int low, int high) {
        if (low > high) {
            low = high;
            high = low;
        }
        return (int) ((Math.random() * (high - low + 1) + low));
    }

    public static String generateUsername(String name) {
        name = fixName(name);
        return "@" + findFirstName(name).toLowerCase() + "_" + findLastName(name).toLowerCase() + "_" + generateRandomNumber(1950, 2050);
    }

    static int indexOfFirstSpace(String name) {
        return name.indexOf(" ");
    }

    static int indexOfSecondSpace(String name) {
        if (indexOfFirstSpace(name) == -1) {
            return -1;
        }
        if (name.substring(indexOfFirstSpace(name) + 1).indexOf(" ") 
            + indexOfFirstSpace(name) + 1 == indexOfFirstSpace(name)) {
            return -1;
        } else {
            return name.substring(indexOfFirstSpace(name) + 1).indexOf(" ") 
                + indexOfFirstSpace(name) + 1;
        }
    }

    static String findFirstName(String name) {
        if (indexOfFirstSpace(name) == -1) {
            return name;
        } else {
            return name.substring(0, indexOfFirstSpace(name));
        }
    }

    static String findLastName(String name) {
        if (indexOfSecondSpace(name) == -1) {
            if (indexOfFirstSpace(name) == -1) {
                return "";
            } else {
                return name.substring(indexOfFirstSpace(name) + 1);
            }
        } else {
            return name.substring(indexOfSecondSpace(name) + 1);
        }
    }

    public static void cleanPool(Pool pool) {
        pool.setCleanlinessLevel(pool.getCleanlinessLevel() + 2);
    }

    public static String fixName(String name) {
        String trimmed = name.trim();
        String finalName = "";
        int numSpaces = 0;
        for (int i = 0; i < trimmed.length(); i++) {
            if (trimmed.charAt(i) != ' ' || numSpaces == 0) {
                finalName += ("" + trimmed.charAt(i));
                if (trimmed.charAt(i) == ' ') {
                    numSpaces = 1;
                }
            }
        }
        return finalName;
    }
}
