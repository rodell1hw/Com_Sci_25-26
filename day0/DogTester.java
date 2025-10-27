public class DogTester {
    public static void main(String[] args) {
        System.out.println(PawesomeUtils.validateDogId(1));
        System.out.println(PawesomeUtils.convertAgeToDogYears(11));
        System.out.println(PawesomeUtils.convertAgeToDogYears(20));
        System.out.println(PawesomeUtils.convertAgeToDogYears(48));
        Dog trevor = new Dog();
        System.out.println(PawesomeUtils.convertAgeToHumanAge(trevor));
        System.out.println(PawesomeUtils.generateDogTag(123, 'L'));
        System.out.println(PawesomeUtils.generateDogChar(123));

    }
}
