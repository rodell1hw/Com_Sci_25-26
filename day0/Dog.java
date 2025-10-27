public class Dog {
    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private char dogChar;
    private String dogTag;
    private boolean stillInFacility;

    public Dog(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = PawesomeUtils.validateDogId(dogId);
        this.dogChar = PawesomeUtils.generateDogChar(this.dogId);
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);

    }

    public Dog() {
        this.name = "Trevor";
        this.ownerName = "Me";
        this.age = 5;
        this.dogId = 123;
        this.dogChar = PawesomeUtils.generateDogChar(this.dogId);
        this.dogTag = PawesomeUtils.generateDogTag(dogId, dogChar);
    }

    public int getAge() {
        return age;
    }

    public char getDogChar() {
        return dogChar;
    }

    public int getDogId() {
        return dogId;
    }

    public String getDogTag() {
        return dogTag;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
    }

    public void setDogId(int dogId) {
        if (dogId <= 100 || dogId >= 999) {
            this.dogId = PawesomeUtils.validateDogId(dogId); 
        }
        this.dogId = dogId;
        this.dogChar = PawesomeUtils.generateDogChar(this.dogId);
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, dogChar);
    }

    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    public String toString() {
        String thisWord;
        if (stillInFacility == true) {
            thisWord = "are";
        } else {
            thisWord = "aren't";
        }
        return name + "is a good dog. They are " + age + "years old and belong to " + ownerName + ". They " + thisWord 
            + " currently in our facility. For employee use only: DogTag is " + dogTag + ".";
    }

    public boolean equals(Dog other) {
        if (this.toString().equals(other.toString())) {
            return true;
        } else {
            return false;
        }
    }

    public static String pickup(Dog dog, String personName) {
        if (dog.ownerName.equals(personName)) {
            dog.stillInFacility = false;
            return dog.name + " has been picked up by their owner " + dog.ownerName;
        } else {
            return "Dog can't leave";
        }
    }

    public static void checkIn(Dog dog, String personName) {
        dog.ownerName = personName;
        dog.stillInFacility = true;
    }

}
