public class Player {
    private String firstName;
    private String lastName;

    public Player(String firstNAme, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public Player(){
        firstName = "unknown";
        lastName = "unknown";

    }

    public String toString() {
        return lastName + ", " + firstName;
    }




}
