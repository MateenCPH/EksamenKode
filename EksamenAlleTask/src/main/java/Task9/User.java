package Task9;

public class User {

    private String name;
    private String password;
    private String email;
    private int phoneNumber;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public User(String name, String password, String email, int phoneNumber) {
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
        if (name.matches("[A-Z][a-z]*")) {
            this.name = name;
        } else {
            System.out.println("\nInvalid name. Must start with an upper case letter");
        }
    }

    public void setPassword(String password) {
        if (password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[-!@#$%^&*()\"'_=+].*")) {
            this.password = password;
        } else {
            System.out.println("Invalid password. Must be at least 8 characters long , contain at least one upper case letter and a symbol");
        }
    }

    public void setEmail(String email) {
        if (email.contains("@")){
            this.email = email;
        } else {
            System.out.println("Invalid e-mail. Must contain the symbol: @");
        }
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.matches("^[0-9]{8}$")){
            this.phoneNumber = Integer.parseInt(phoneNumber);
        } else {
            System.out.println("Invalid phonenumber. Must contain 8 digits");
        }
    }

    @Override
    public String toString() {
        if (email == null) {
            return "Name: " + name + " | Password: " + password +"\n";
        } else if (phoneNumber == 0) {
            return "Name: " + name + " | Password: " + password + " | E-mail: " + email+"\n";
        } else {
            return "Name: " + name + " | Password: " + password + " | E-mail: " + email + " | Phone-number: " + phoneNumber+"\n";
        }
    }
}
