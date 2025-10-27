public class NameOps {
    static String printMethodCall(String method, String name) {
        return method + "(\"" + name + "\"): ";
    }

    static String whoIsAwesome(String name) {
        return name + " is awesome!";
    }

    static int indexOfFirstSpace(String name) {
        return name.indexOf(" ");
    }

    static int indexOfSecondSpace(String name) {
        if (indexOfFirstSpace(name) == -1) {
            return -1;
        }
        if (name.substring(indexOfFirstSpace(name) + 1).indexOf(" ") 
            + indexOfFirstSpace(name) + 1 == indexOfFirstSpace(name)) {
            return -1;
        } else {
            return name.substring(indexOfFirstSpace(name) + 1).indexOf(" ") 
                + indexOfFirstSpace(name) + 1;
        }
    }

    static String findFirstName(String name) {
        if (indexOfFirstSpace(name) == -1) {
            return name;
        } else {
            return name.substring(0, indexOfFirstSpace(name));
        }
    }

    static String findLastName(String name) {
        if (indexOfSecondSpace(name) == -1) {
            if (indexOfFirstSpace(name) == -1) {
                return "";
            } else {
                return name.substring(indexOfFirstSpace(name) + 1);
            }
        } else {
            return name.substring(indexOfSecondSpace(name) + 1);
        }
    }

    static String findMiddleName(String name) {
        if (indexOfSecondSpace(name) == -1) {
            return "";
        } else {
            return name.substring(indexOfFirstSpace(name) + 1, indexOfSecondSpace(name));
        }
    }

    static String generateLastFirstMidInitial(String name) {
        if (indexOfFirstSpace(name) == -1) {
            return findFirstName(name);
        } else if (findMiddleName(name) == "") {
            return findLastName(name) + ", " + findFirstName(name);
        } else {
            return findLastName(name) + ", " + findFirstName(name) + " " 
                + findMiddleName(name).charAt(0) + ".";
        }
    }
}
