public class Cat {
    private String name;
    private String ownerName;
    private int moodLevel;
    private String catId;
    private char catChar;
    private boolean isHungry;

	Cat(String name, String ownerName, int moodLevel, String catId) {
		this.name = name;
		this.ownerName = ownerName;
		this.moodLevel = moodLevel;
		if (catId == null) {
            catId = "" + PurrfectUtils.generateRandomNumber(1000, 9999);
        } else {
			catId = PurrfectUtils.validateCatId(catId);
		}
		catChar = PurrfectUtils.generateCatChar(catId);
		isHungry = true;
	}

	Cat() {
		moodLevel = 5;
		catId = "1234";
		ownerName = "Phil";
		name = "Fyl";
		catChar = PurrfectUtils.generateCatChar(catId);
		isHungry = true;
	}

	public char getCatChar() {
		return catChar;
	}

	public String getCatId() {
		return PurrfectUtils.validateCatId(catId);
	}
	
	public int getMoodLevel() {
		return PurrfectUtils.validateMoodLevel(moodLevel);
	}

	public String getName() {
		return name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public boolean isHungry() {
		return isHungry;
	}

	public void setCatChar(char catChar) {
		this.catChar = catChar;
	}

	public void setCatId(String catId) {
		this.catId = PurrfectUtils.validateCatId(catId);
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
		return catId + catChar;
	}

	public String toString() {
		return "About " + name + "\n" + name + "is a cat." + "\nTheir tag is: " + generateCatTag();
	}

	public boolean equals(Cat other) {
		if (this.toString().equals(other.toString())) {
			return true;
		} else {
			return false;
		}
	}


}
