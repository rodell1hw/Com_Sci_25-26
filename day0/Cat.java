public class Cat { //1. changed Public to public, 2. changed Cats to Cat
	private String name;
	private String breed;
	private boolean isHungry;
	private int livesRemaining;
	
	// 2-Parameter Constructor
	Cat(String name, String breed) { //3. Deleted public from start of constructor, 4. Added String breed
		this.name = name; //5. Added this.
		this.breed = breed;
		this.isHungry = true; //6. replaced yes with true
		livesRemaining = 9;
	}

	public String getName() { //7. changed void to string
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getIsHungry() { //8. changed void to boolean and added space, changed to cammal case
		return isHungry;
	}

	public boolean feed() {
		this.isHungry = false;
        return(isHungry); //9. added this line
	}

	public boolean equals(Cat other) {
		return this.name.equals(other.name) && this.breed.equals(other.breed)
			&& this.livesRemaining == other.livesRemaining; //10. replaced = with ==, changed this.name == other.name to this.name.equals(other.name)
	}

	public String toString() {
		return(name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining."); //11. replaced sysout with return
	}

    public void setBreed(String breed) { //19. added setter
        this.breed = breed;
    }

    public String getBreed() { //18. added getted
        return breed;
    }
}