public class Theater {
    String theaterName;
    TheaterMember[] registeredMembers;

    Theater(String theaterName, TheaterMember[] registeredMembers) {
        this.registeredMembers = registeredMembers;
        this.theaterName = theaterName;
    }

    Theater(String theaterName, int initialCapacity) {
        this.theaterName = theaterName;
        this.registeredMembers = new TheaterMember[initialCapacity];
    }

    public TheaterMember[] getRegisteredMembers() {
        return registeredMembers;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setRegisteredMembers(TheaterMember[] registeredMembers) {
        this.registeredMembers = registeredMembers;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public boolean isFull() {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void increaseCapacity() {
        TheaterMember[] newArray = new TheaterMember[registeredMembers.length * 2];
        for (int i = 0; i < registeredMembers.length; i++) {
            newArray[i] = registeredMembers[i];
        }
        registeredMembers = newArray;
    }

    public void registerMember(TheaterMember member) {
        if (isFull() == true) {
            increaseCapacity();
        }
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == null) {
                registeredMembers[i] = member;
                return;
            }
        }
    }

    public String toString() {
        String toReturn = "== " + theaterName + " Members ==";
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] != null) {
                toReturn += (i + 1) + ".) " + registeredMembers[i].toString();
            }
        }
        return toReturn;
    }

    public boolean deleteMember(TheaterMember member) {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i].toString().equals(member.toString())) {
                registeredMembers[i] = null;
                return true;
            }
        }
        return false;
    }

}
