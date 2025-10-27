public class Cat {
    private String name;
    private String ownerName;
    private int moodLevel;
    private String catID;
    private char catChar;
    private boolean isHungry;

	Cat(String name, String ownerName, int moodLevel, String catId) {
		name = name;
		ownerName = ownerName;
		moodLevel = PawesomeUtils.validateMoodLevel(moodLevel);
		catID = PawesomeUtils.validatecatId(catID);
		catChar = PawesomeUtils.generateCatChar();
		isHungry = true;
	}

	Cat() {
		moodLevel = 5;
		catID = "1234";
		ownerName = "Phil";
		name = "Fyl";
		catChar = PawesomeUtils.generateCatChar();
		isHungry = true;
	}

	public char getCatChar() {
		return catChar;
	}

	public String getCatID() {
		return catID;
	}
	
	public int getMoodLevel() {
		return moodLevel;
	}

	public String getName() {
		return name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setCatChar(char catChar) {
		this.catChar = catChar;
	}

	public void setCatID(String catID) {
		this.catID = catID;
	}

	public void setHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}

	public void setMoodLevel(int moodLevel) {
		this.moodLevel = moodLevel;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String generateCatTag() {
		return catID + catChar;
	}

	public String toString() {
		return "About " + name + "\n" + name + "is a cat." + "\nTheir tag is: " + generateCatTag();
	}

	public boolean equals(Cat other) {
		if (this.toString().equals(other.toString()) {
			return true;
		} else {
			return false;
		}
	}
}
