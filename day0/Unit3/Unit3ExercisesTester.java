package Unit3;

public class Unit3ExercisesTester {
    public static void testCalculateStringLengthAverage() {
        // Test Case - Main Case
        String[] letters = { "abc", "cde", "efg", "hij" };
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));
        // Test Case - Edge Case: Null element rray
        letters = new String[] { "abc", "cde", "efg", null, "hij" };
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));
        // Test Case - Edge CAse: Null array
        try {
            letters = null;
            // expected output: 0
            System.out.println("Expected exception: " + Unit3Exercises.calculateAverageStringLength(letters));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception as intended");
        }
    }

    // Intended: produce a new string with the characters of the input reversed.
    public static void testReverseString() {
        // Test Case - Main Case
        String testString = "abc";
        System.out.println("Expected cba: " + Unit3Exercises.reverseString(testString));
        // Test Case - Edge Case: String with spaces at the end and in the middle
        testString = " ab c ";
        System.out.println("Expected ' c ba ': " + Unit3Exercises.reverseString(testString));
        // Test Case - Edge Case: String with special characters
        testString = "a1b!c&";
        System.out.println("Expected '&c!b1a': " + Unit3Exercises.reverseString(testString));
        // Test Case - Edge Case: Null string
        try {
            testString = null;
            System.out.println("Expected exception: " + Unit3Exercises.reverseString(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception as intended");
        }
    }

    public static void testFindMaxValue() {
        // Test Case - Main Case
        int[] testArray = { 1, 2, 3, 4 };
        System.out.println("Expected 4: " + Unit3Exercises.findMaxValue(testArray));
        testArray = new int[] { -1, 0, -3, -4 };
        System.out.println("Expected 0: " + Unit3Exercises.findMaxValue(testArray));
        testArray = new int[] { -1, -2, -3, -4 };
        System.out.println("Expected -1: " + Unit3Exercises.findMaxValue(testArray));
        // Test Case - Edge Case: Null string
        try {
            testArray = null;
            System.out.println("Expected exception: " + Unit3Exercises.findMaxValue(testArray));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception as intended");
        }
    }

    public static void testIsPalindrome() {
        // Test Case - Main Case
        String testString = "racecar";
        System.out.println("Expected true: " + Unit3Exercises.isPalindrome(testString));
        testString = "no";
        // Test Case - Main Case
        System.out.println("Expected false: " + Unit3Exercises.isPalindrome(testString));
        try {
            testString = "";
            System.out.println("Expected exception: " + Unit3Exercises.isPalindrome(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception as intended");
        }
    }

    public static void testSumEvenNumbers() {
        // Test Case - Main Case
        int[] testArray = { 1, 2, 3, 4 };
        System.out.println("Expected 6: " + Unit3Exercises.sumEvenNumbers(testArray));
        testArray = new int[] { -1, -2, -3, -4 };
        System.out.println("Expected -6: " + Unit3Exercises.sumEvenNumbers(testArray));
        testArray = new int[] { -1, 2, 3, -4 };
        System.out.println("Expected -2: " + Unit3Exercises.sumEvenNumbers(testArray));
        // Test Case - Edge Case: Null string
        try {
            testArray = null;
            System.out.println("Expected exception 0: " + Unit3Exercises.sumEvenNumbers(testArray));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception as intended");
        }
    }

    public static void testCalculateSumOfSquares() {
        // Test Case - Main Case
        int[] testArray = { 1, 2, 3, 4 };
        System.out.println("Expected 30: " + Unit3Exercises.calculateSumOfSquares(testArray));
        // Test Case - Edge Case: Null string
        try {
            testArray = null;
            System.out.println("Expected exception 0: " + Unit3Exercises.calculateSumOfSquares(testArray));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception as intended");
        }
    }

    public static void testGetNthFibonacci() {
        int number = 6;
        System.out.println("Expected 8: " + Unit3Exercises.getNthFibonacci(number));
        // Test Case - Edge Case: Null string
        try {
            number = -1;
            System.out.println("Expected exception -1: " + Unit3Exercises.getNthFibonacci(number));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception as intended");
        }

    }

    public static void testSortArrayDescending() {
        // Test Case - Main Case
        int[] testArray = { 2, 3, 4, 1 };
        Unit3Exercises.sortArrayDescending(testArray);
        testArray = new int[] { -2, -3, -1, -4 };
        Unit3Exercises.sortArrayDescending(testArray);
        // Test Case - Edge Case: Null string
        try {
            testArray = null;
            Unit3Exercises.sortArrayDescending(testArray);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception as intended");
        }
    }

    public static void testFindLongestWord() {
        // Test Case - Main Case
        String testString = "I went to the park today";
        System.out.println("Expected today: " + Unit3Exercises.findLongestWord(testString));
        testString = "I went to the park";
        // Test Case - Main Case
        System.out.println("Expected went: " + Unit3Exercises.findLongestWord(testString));
        testString = "";
        try {
            testString = null;
            System.out.println("Expected exception no longest word: " + Unit3Exercises.findLongestWord(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the string was null, as intended");
        }
        try {
            testString = "";
            System.out.println("Expected exception no longest word: " + Unit3Exercises.findLongestWord(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the string was \"\", as intended");
        }
    }

    public static void testCalculateInterest() {
        double principal = 6.0;
        double rate = 5.5;
        int years = 4;
        System.out.println("Expected 7.43: " + Unit3Exercises.calculateInterest(principal, rate, years));
        // Test Case - Edge Case principal amnt negative
        try {
            principal = -6.0;
            rate = 5.5;
            years = 4;
            System.out.println("Expected 0.0: " + Unit3Exercises.calculateInterest(principal, rate, years));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception as intended");
        }
        try {
            principal = 6.0;
            rate = -5.5;
            years = 4;
            System.out.println("Expected 0.0: " + Unit3Exercises.calculateInterest(principal, rate, years));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception as intended");
        }
        try {
            principal = 6.0;
            rate = 5.5;
            years = -4;
            System.out.println("Expected 0.0: " + Unit3Exercises.calculateInterest(principal, rate, years));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception as intended");
        }
    }

    public static void testParsePositiveInteger() {
        // main case
        String str = "4";
        // try {
        System.out.println("Expected 4: " + Unit3Exercises.parsePositiveInteger(str));
        // } catch (Exception e) {
        // System.out.println(e.toString());
        // System.out.println("The method threw an exception as intended");
        // }
        // other case
        str = "-2";
        // try {
        System.out.println("Expected 1: " + Unit3Exercises.parsePositiveInteger(str));
        // } catch (Exception e) {
        // System.out.println(e.toString());
        // System.out.println("The method threw an exception as intended");
        // }
    }

    public static void testGetArrayElement() {
        String[] arr = { "hi", "hola", "aloha" };
        int index = 2;
        System.out.println("Expected aloha: " + Unit3Exercises.getArrayElement(arr, index));

        index = 4;
        System.out.println("Expected null: " + Unit3Exercises.getArrayElement(arr, index));
    }

    public static void testCalculateSquareRoot() {
        int number = 9;
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateSquareRoot(number));
        number = -4;
        System.out.println("Expected NaN: " + Unit3Exercises.calculateSquareRoot(number));

    }

    public static void testSumArrayElements() {
        int[] arr = { 1, 3, 4 };
        System.out.println("Expected 8: " + Unit3Exercises.sumArrayElements(arr));

        arr = null;
        System.out.println("Expected 0: " + Unit3Exercises.sumArrayElements(arr));
    }

    public static void testCalculatePower() {
        int exponent = 2;
        double base = 3.0;
        System.out.println("Expected 9.0: " + Unit3Exercises.calculatePower(base, exponent));

        exponent = -2;
        System.out.println("Expected 1.0: " + Unit3Exercises.calculatePower(base, exponent));
    }

    public static void main(String[] args) {
        testCalculateStringLengthAverage();
        testReverseString();
        testFindMaxValue();
        testIsPalindrome();
        testSumEvenNumbers();
        testCalculateSumOfSquares();
        testGetNthFibonacci();
        testSortArrayDescending();
        testFindLongestWord();
        testCalculateInterest();
        testParsePositiveInteger();
        testGetArrayElement();
        testCalculateSquareRoot();
        testSumArrayElements();
        testCalculatePower();
    }
}
