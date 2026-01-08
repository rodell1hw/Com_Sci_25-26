public class Unit2Exercises {
    public static String alarmClock(int day, boolean vacation) {
        // to-do: implement this method
        if ((day == 0 || day == 6) && vacation == true) {
            return "off";
        } else if (((day == 0 || day == 6) && vacation != true) || vacation == true) {
            return "10:00";
        } else {
            return "7:00";
        }
    }

    public static boolean love6(int a, int b) {
        // to-do: implement this method
        if ((a == 6 || b == 6) || (Math.abs(a - b) == 6.0) || (Math.abs(a + b) == 6.0)) {
            return true;
        } else {
            return false;
        }
    }

    public static int redTicket(int a, int b, int c) {
        // to-do: implement this method
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c && a == c) {
            return 5;
        } else if (a != b && a != c) {
            return 1;
        } else {
            return 0;
        }
    }

    public static String fizzString(String str) {
        // to-do: implement this method
        if (str.length() == 0) {
            return "";
        }
        if (str.charAt(0) == 'f' && (str.charAt(str.length() - 1) == 'b')) {
            return "FizzBuzz";
        } else if (str.charAt(str.length() - 1) == 'b') {
            return "Buzz";
        } else if (str.charAt(0) == 'f') {
            return "Fizz";
        } else {
            return str;
        }

    }

    public static String doubleChar(String str) {
        // to-do: implement this method
        String nw = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            nw += c;
            nw += c;
        }
        return nw;

    }

    public static int countHi(String str) {
        // to-do: implement this method
        int count = 0;
        for (int i = 0; i <= str.length() - 2; i++) {
            if (str.toLowerCase().substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }

    public static boolean catDog(String str) {
        // to-do: implement this method
        int countCat = 0;
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.toLowerCase().substring(i, i + 3).equals("cat")) {
                countCat++;
            }
        }
        int countDog = 0;
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.toLowerCase().substring(i, i + 3).equals("dog")) {
                countDog++;
            }
        }
        if (countCat == countDog) {
            return true;
        } else {
            return false;
        }
    }

    public static String mixString(String a, String b) {
        // to-do: implement this method
        String result = "";
        int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len; i++) {
            result += a.charAt(i);
            result += b.charAt(i);
        }
        result += a.substring(len);
        result += b.substring(len);
        return result;

    }

    public static String repeatEnd(String str, int n) {
        // to-do: implement this method
        String q = "";
        for (int i = 0; i < n; i++) {
            q += str.substring(str.length() - n, str.length());
        }
        return q;
    }

    public static boolean endOther(String a, String b) {
        // to-do: implement this method
        if (a == "" || b == "") {
            return true;
        }
        if ((b.toLowerCase().indexOf(a.toLowerCase()) == (b.length() - a.length())) 
            || (a.toLowerCase().indexOf(b.toLowerCase()) == (a.length() - b.length()))) {
            return true;
        } else {
            return false;
        }
    }

    public static int countCode(String str) {
        // to-do: implement this method
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == ('e')) {
                count++;
            }
        }
        return count;
    }

    public static int countEvens(int[] nums) {
        // to-do: implement this method
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int bigDiff(int[] nums) {
        // to-do: implement this method
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max - min;
    }

    public static int sum13(int[] nums) {
        // to-do: implement this method
        int sum = 0;
        int thing = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 13 && thing == 0) {
                sum += nums[i];
                thing = 0;
            } else {
                thing = 1;
            }
        }
        return sum;
    }

    public static int[] fizzArray(int n) {
        // to-do: implement this method
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        return array;
    }

    public static boolean haveThree(int[] nums) {
        // to-do: implement this method
        int count = 0;
        int thing = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3 && thing == 0) {
                count++;
                thing = 1;
            } else {
                thing = 0;
            }
        }
        if (count == 3) {
            return true;
        } else {
            return false;
        }

    }

    public static String[] fizzArray2(int n) {
        // to-do: implement this method
        String[] array = new String[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(i);
        }
        return array;
    }

    public static int[] zeroFront(int[] nums) {
        // to-do: implement this method
        int[] array = new int[nums.length];
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                array[counter++] = 0;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                array[counter++] = nums[i];
            }
        }
        return array;
    }

    public static String[] wordsWithout(String[] words, String target) {
        // to-do: implement this method
        int counter = 0;
        String[] array = new String[100];
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                array[counter] = words[i];
                counter++;
            }
        }
        String[] array2 = new String[counter];
        for (int i = 0; i < counter; i++) {
            array2[i] = array[i];
        }
        return array2;
    }

    public static int scoresAverage(int[] scores) {
        // to-do: implement this method
        int mid = scores.length / 2;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < mid; i++) {
            count++;
            sum += scores[i];
        }
        int av1 = sum / count;
        count = 0;
        sum = 0;
        for (int i = mid; i < scores.length; i++) {
            count++;
            sum += scores[i];
        }
        int av2 = sum / count;
        return Math.max(av1, av2);
    }

    public static boolean scoresIncreasing(int[] scores) {
        // to-do: implement this method
        int before = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= before) {
                before = scores[i];
            } else {
                return false;
            }
        }
        return true;
    }

    public static int scoresSpecial(int[] a, int[] b) {
        // to-do: implement this method
        int alargests = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 10 == 0 && a[i] >= alargests) {
                alargests = a[i];
            } 
        }
        int blargests = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 10 == 0 && b[i] >= blargests) {
                blargests = b[i];
            } 
        }

        return alargests + blargests;
    }

    public static String firstTwo(String str) {
        // to-do: implement this method
        String s = "";
        if (str.length() >= 2) {
            for (int i = 0; i < 2; i++) {
                s += str.charAt(i);
            }
        } else if (str.length() == 1) {
            s += str;
            s += "*";
        } else {
            s = "**";
        }
        return s;
    }

    public static double divide(int a, int b) {
        // to-do: implement this method
        int n = Math.max(a, b);
        int m = Math.min(a, b);
        if (m == 0) {
            return 0;
        }
        return (double) n / (double) m;
    }
}
