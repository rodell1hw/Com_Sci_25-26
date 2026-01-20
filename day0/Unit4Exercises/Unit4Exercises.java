package Unit4Exercises;

import java.util.ArrayList;

public class Unit4Exercises {

    // Method 1: matchingEndSequences
    public static boolean matchingEndSequences(int[] nums, int n) {
        // to-do: implement the method
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[nums.length - (n - i)])
                return false;
        }
        return true;
    }

    // Method 2: hasThreeConsecutive
    public static boolean hasThreeConsecutive(int[] nums) {
        // to-do: implement the method
        int odd = 0;
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even++;
            } else {
                even = 0;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] % 2 != 0) {
                odd++;
            } else {
                odd = 0;
            }
        }
        if (even == 3 || odd == 3) {
            return true;
        } else {
            return false;
        }
    }

    // Method 3: generateNumberSequence
    public static int[] generateNumberSequence(int start, int end) {
        // to-do: implement the method
        int[] ary = new int[end - start];
        for (int i = 0; i < end - start; i++) {
            ary[i] = i + start;
        }
        return ary;
    }

    // Method 4: fizzBuzz
    public static String[] fizzBuzz(int start, int end) {
        // to-do: implement the method
        int[] ary = new int[end - start];
        for (int i = 0; i < end - start; i++) {
            ary[i] = i + start;
        }
        String[] ary2 = new String[end - start];
        // for (int i = 0; i < end - start; i++) {
        // ary[i] = String.valueOf(i);
        // }

        for (int i = 0; i < end - start; i++) {
            if ((ary[i]) % 3 == 0 && (ary[i]) % 5 == 0) {
                ary2[i] = "FizzBuzz";
            } else if ((ary[i]) % 3 == 0) {
                ary2[i] = "Fizz";
            } else if ((ary[i]) % 5 == 0) {
                ary2[i] = "Buzz";
            } else {
                ary2[i] = String.valueOf(ary[i]);
            }
        }

        return ary2;
    }

    // Method 5: moveEvenBeforeOdd
    public static int[] moveEvenBeforeOdd(int[] nums) {
        // to-do: implement the method
        int j = 0;
        int[] ary = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                ary[j] = nums[i];
                j++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                ary[j] = nums[i];
                j++;
            }
        }
        return ary;
    }

    // ArrayList Methods

    // Method 1: noNegatives
    public static ArrayList<Integer> noNegatives(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();

    }

    // Method 2: excludeTeenNumbers
    public static ArrayList<Integer> excludeTeenNumbers(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 3: appendY
    public static ArrayList<String> appendY(ArrayList<String> strs) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 4: squarePlus10
    public static ArrayList<Integer> squarePlus10(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

}
