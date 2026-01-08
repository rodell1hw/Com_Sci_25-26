public class TheaterMember {
    private String name;
    private boolean[] loyaltyCredits;

    public TheaterMember(String name) {
        this.loyaltyCredits = new boolean[10];
        this.name = name;
    }

    public boolean[] getLoyaltyCredits() {
        return loyaltyCredits;
    }

    public String getName() {
        return name;
    }

    public void setLoyaltyCredits(boolean[] loyaltyCredits) {
        this.loyaltyCredits = loyaltyCredits;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void grantLoyaltyCredit() {
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == false) {
                loyaltyCredits[i] = true;
                return;
            }
        }
    }

    public int countLoyaltyCredits() {
        int counter = 0;
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == true) {
                counter++;
            }
        }
        return counter;
    }

    public String determineMembershipStatus() {
        if (countLoyaltyCredits() >= 6) {
            return "Gold Member";
        } else if (countLoyaltyCredits() >= 3) {
            return "Silver Member";
        } else {
            return "Plus Member";
        }
    }

    public String loyaltyHistory() {
        int total = countLoyaltyCredits();
        String newString = "Loyalty History: [";
        for (int i = 0; i < total; i++) {
            newString += "X, ";
        }
        for (int i = 0; i < loyaltyCredits.length - total; i++) {
            newString += "-, ";
        }
        newString = newString.substring(0, newString.length() - 5);
        newString += "]";
        return newString;
    }

    public String toString() {
        return "" + name + " (" + determineMembershipStatus() + "), " + loyaltyHistory();
    }

    public boolean equals(TheaterMember other) {
        if (this.toString().equals(other.toString())) {
            return true;
        } else {
            return false;
        }
    }

}
