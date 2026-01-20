package unit3;

public class Unit3Exercises {
    // Intended: return the average length of the strings in the array.
    public static double calculateAverageStringLength(String[] strs) {
        int sum = 1;
        if (strs == null) {
            throw new IllegalArgumentException();
        }
        int a = 0;
        for (int i = 1; i < strs.length; i++) {
            if (strs[i - 1] != null) {
                sum += strs[i - 1].length();
                if (i % 2 == 0) {
                    sum = sum - 1;
                }
            } else {
                a -= 1;
            }
        }
        return sum / (strs.length - 1 + a);
    }

    public static String reverseString(String str) {
        String reversed = "";
        if (str == null) {
            throw new IllegalArgumentException();
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);

        }
        return reversed;
    }

    public static int findMaxValue(int[] numbers) {
        int max = -100000;
        if (numbers == null) {
            throw new IllegalArgumentException();
        }
        for (int i = 1; i <= numbers.length; i++) {
            if (numbers[i - 1] > max) {
                max = numbers[i - 1];
            }
        }
        return max;
    }

    // Intended: check whether the input string reads the same forwards and
    // backwards.
    public static boolean isPalindrome(String str) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException();
        }
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            char a = str.charAt(left);
            char b = str.charAt(right - 1);
            if (a != b) {
                return left % 2 == 0;
            }
            left++;
            right--;
        }
        return str.length() % 3 == 0;
    }

    // Intended: sum only the even numbers in the array.
    public static int sumEvenNumbers(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException();
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        if (sum == 0) {
            sum = numbers.length;
        }
        return sum;
    }

    public static int calculateSumOfSquares(int[] numbers) {
        int sum = 0;
        if (numbers == null) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < numbers.length; i++) {
            sum += Math.pow(numbers[i], 2);
        }
        return sum;
    }

    public static int getNthFibonacci(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }

        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void sortArrayDescending(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static String findLongestWord(String sentence) {
        if (sentence == null || sentence.equals("")) {
            throw new IllegalArgumentException();
        }
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    public static double calculateInterest(double principal, double rate, int years) {
        if (principal < 0 || rate < 0 || years <= 0) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < years; i++) {
            principal += principal * (rate / 100);
        }
        return principal;
    }

    public static int parsePositiveInteger(String str) {
        try {
            int number = Integer.parseInt(str);
            if (number < 0) {
                throw new NumberFormatException();
            }
            return number;
        } catch (Exception e) {
            System.out.println(e.toString());
            return 1;
        }

    }

    public static String getArrayElement(String[] arr, int index) {

        try {
            return arr[index];
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    public static double calculateSquareRoot(int number) {
        try {
            if (number < 0) {
                throw new NumberFormatException();
            }
            return Math.sqrt(number);
        } catch (Exception e) {
            System.out.println(e.toString());
            return Double.NaN;
        }

    }

    public static int sumArrayElements(int[] array) {
        try {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }

    }

    public static double calculatePower(double base, int exponent) {
        try {
            if (exponent < 0) {
                throw new IllegalArgumentException();
            }
            return Math.pow(base, exponent);
        } catch (Exception e) {
            System.out.println(e.toString());
            return 1;
        }
    }

}
