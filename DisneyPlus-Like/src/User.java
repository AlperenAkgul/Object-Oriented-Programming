public class User extends Consumer{
    boolean loginStatus = false;
    String userName;
    String password;

    public User(int id, String firstName, String LastName, String userName, String password){
        super(id, firstName, LastName);
        this.userName = userName;
        this.password = password;
    }
}
