package Task9;

public class User {

    private String name;
    private String password;
    private String email;
    private int phoneNumber;

    public User(String name, String password){
        this.name = name;
        this.password = password;
    }

    public User(String name, String password, String email){
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public User(String name, String password, String email, int phoneNumber){
        this.name = name;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        if (email == null){
            return "Name: " + name + " | Password: " + password;
        }else if (phoneNumber == 0){
            return "Name: " + name + " | Password: " + password + " | E-mail: " + email;
        }else {
            return "Name: " + name + " | Password: " + password + " | E-mail: " + email + " | Phone-number: " + phoneNumber;
        }
    }
}
