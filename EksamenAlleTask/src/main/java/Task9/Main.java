package Task9;

public class Main {
    public static void main(String[] args) {

        User mat = new User("", "");
        User rod = new User("", "","");
        User reb = new User("","","",0);

        mat.setName("mateen");
        mat.setPassword("pass");
        System.out.println(mat);

        rod.setName("Rodney");
        rod.setPassword("WeakPassword");
        rod.setEmail("weakemail.com");
        System.out.println(rod);

        reb.setName("Rebecca");
        reb.setPassword("StrongPassword!");
        reb.setEmail("StrongEmail@valid.com");
        reb.setPhoneNumber("12345678");
        System.out.println(reb);







    }
}
