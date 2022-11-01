public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name.startsWith(" ") ||
                name.endsWith(" ") ||
                name.length() < 3 ||
                name.length() > 19 ||
                name.isEmpty())
        {
            return false;
        } else{
            return true;
        }
    }
}


