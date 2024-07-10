package Class.June18;

public class LoginMain {
    public static void main(String[] args) {
        LoginApp loginapp = new LoginApp("Pranshi", "1234");

        loginapp.login("Pranshi", "1234");

        // hacker - making field private restricts the change to the password
//        loginApp.password = "mypassword";

        // to change the private field password, we have to use setPassword method
        loginapp.setPassword("mypassword");

        System.out.println(loginapp.getUserName());
        System.out.println(loginapp.getPassword());

        loginapp.login("Pranshi", "mypassword");


    }
}
