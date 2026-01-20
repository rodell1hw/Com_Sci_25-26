package Unit4Exercises;

public class Unit4ExercisesTester {
    public static void main(String[] args) {
        int[] ary = new int[] { 5, 6, 45, 99, 13, 5, 6 };
        System.out.println(Unit4Exercises.matchingEndSequences(ary, 1));

        ary = new int[] { 2, 1, 2, 5 };
        System.out.println(Unit4Exercises.hasThreeConsecutive(ary));

        // ary = new int[] { 5, 6, 7, 8, 9 };
        // System.out.println(ary);
        System.out.println(ArrayOps.printIntegerArray(Unit4Exercises.generateNumberSequence(5, 10)));

        System.out.println(ArrayOps.printStringArray(Unit4Exercises.fizzBuzz(1, 6)));

        ary = new int[] { 1, 0, 1, 0, 0, 3, 1 };
        System.out.println(ArrayOps.printIntegerArray(Unit4Exercises.moveEvenBeforeOdd(ary)));
    }
}
