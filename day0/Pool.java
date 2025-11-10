public class Pool {
    private String name;
    private String ownerName;
    private String username;
    private int cleanlinessLevel;
    private boolean isNeedsChemicalCheck;

    Pool(String name, String ownerName, int cleanlinessLevel) {
        this.name = name;
        this.ownerName = PoolUtils.fixName(ownerName);
        this.username = PoolUtils.generateUsername(name);
        this.cleanlinessLevel =  PoolUtils.validateCleanlinessLevel(cleanlinessLevel);
        this.isNeedsChemicalCheck = false;
    }

    Pool() {
        this.name = "Oasis Springs";
        this.ownerName = "Terry Butcher";
        username = PoolUtils.generateUsername(name);
        this.cleanlinessLevel =  5;
        this.isNeedsChemicalCheck = false; 
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getUsername() {
        return username;
    }

    public boolean getIsNeedsChemicalCheck() {
        return isNeedsChemicalCheck;
    }


    public void setCleanlinessLevel(int cleanlinessLevel) {
        this.cleanlinessLevel = PoolUtils.validateCleanlinessLevel(cleanlinessLevel);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsNeedsChemicalCheck(boolean needsChemicalCheck) {
        this.isNeedsChemicalCheck = needsChemicalCheck;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = PoolUtils.fixName(ownerName);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNeedsChemicalCheck(boolean isNeedsChemicalCheck) {
        this.isNeedsChemicalCheck = isNeedsChemicalCheck;
    }

    public String toString() {
        return "== ABOUT POOL ==\n"
            + "Name: " + name + "\n"
            + "Owner: " + ownerName + "\n"
            + "Username: " + username + "\n"
            + "Cleanliness Level: " + cleanlinessLevel + "\n"
            + "Does pool need chemical check? " + isNeedsChemicalCheck;
    }

    public boolean equals(Pool other) {
        if (this.toString().equals(other.toString())) {
            return true;
        } else {
            return false;
        }
    }
}
