public class Main {
    public static void main(String[] args) {

        User user1 = getUser();
        user1.stampaDettagli();

        User user2 = getUser();
        user2.setNome("Mario");
        user2.setEta(45);
        user2.stampaDettagli();
    }

    private static User user;

    public static User getUser() {
        if (user == null) {
            user = new User("Erika", 23);
        }
        return user;
    }

}