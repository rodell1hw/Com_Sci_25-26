public class PawesomeUtils {
    public static char generateDogChar(int dogId) {
        int digitThree = dogId % 10;
        int digitTwo = (dogId / 10) % 10;
        int digitOne = (dogId / 100) % 10;
        return (char) ('F' + ((digitOne + digitTwo + digitThree) % 10));
    }

    public static String generateDogTag(int dogId, char dogChar) {
        String dogTag =  "" + dogId + dogChar;
        return dogTag;
    }


    public static String pickup(Dog dog, String personName) {
        if (dog.getOwnerName().equals(personName)) {
            dog.setStillInFacility(false);
            return dog.getName() + " has been picked up by their owner " + dog.getOwnerName();
        } else {
            return "Dog can't leave";
        }
    }

    public static void checkIn(Dog dog, String personName) {
        if (PawesomeUtils.validateDogTag(dog) == true) {
            dog.setOwnerName(personName);
            dog.setStillInFacility(true);
            System.out.println("Dog was checked in");
        } else {
            System.out.println("Dog was denied entry");
        }
    }

    public static int validateDogId(int dogId) {
        if (dogId >= 100 && dogId <= 999) {
            return dogId;
        } else {
            return (int) (Math.random() * 899 + 100);
        }
    }

    public static boolean validateDogTag(Dog dog) {
        int dogId = dog.getDogId();
        String dogTag = dog.getDogTag();
        validateDogId(dogId);
        char dogChar = generateDogChar(dogId);
        String newDogTag = "" + dogId + dogChar;
        if (newDogTag.equals(dogTag)) {
            return true;
        } else {
            return false;
        }
    }

    public static int convertAgeToHumanAge(Dog dog) {
        if (dog.getAge() == 1) {
            return 15;
        } else if (dog.getAge() == 2) {
            return 24;
        } else {
            return 24 + (dog.getAge() - 2) * 5;
        }
    }

    public static int convertAgeToDogYears(int humanYears) {
        if (humanYears <= 15) {
            return 1;
        } else if (humanYears <= 24) {
            return 2;
        } else {
            return (humanYears - 24) / 5 + 2;
        }
    }
}
