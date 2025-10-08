public class PawsomeUtils {
     public static char generateDogChar(int dogId) {
        int digitThree = dogId % 10;
        int digitTwo = (digitThree / 10) % 10;
        int digitOne = (digitTwo / 10) % 10;
        return (char)('F' + ((digitOne + digitTwo + digitThree) % 10));
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
        dog.setOwnerName(personName);
        dog.setStillInFacility(true);
    }

    public static int validateDogId(int dogId) {
        if (dogId > 100 && dogId < 999) {
            return dogId;
        } else {
            return (int) (Math.random() * 899 + 100);
        }
    }

    public static boolean validateDogTag(Dog dog) {
        int dogId = dog.getDogId();
        dogId = validateDogId(dogId);
        char dogChar = generateDogChar(dogId);
        String newDogTag = "" + dogId + dogChar;
        if (newDogTag.equals(dog.getDogTag())) {
            return true;
        } else {
            return false;
        }
    }
}
