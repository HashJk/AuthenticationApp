package authenticationcliapp;
import java.util.Scanner;
public class AuthenticationCLIApp {

    public static void main(String[] args) {
       
        PasswordAuthentication serverpass = new PasswordAuthentication("Enter Password");
        UserNameAuthentication serveruser = new UserNameAuthentication("Enter Username");
        Scanner reader = new Scanner(System.in);
        
        //System.out.println(serverpass.getPassword() + serveruser.getUserName());
        
        System.out.print("Enter your password: ");
        String password = reader.next();        
        System.out.print("Enter your username: ");
        String username = reader.next();
       
        
        serverpass.setPassword(password);
        serveruser.setUserName(username);
        
        System.out.println("your Pass is: " + serverpass.getPassword() + " | your Username is: " + serveruser.getUserName());
        int[] a = new int[0];
        System.out.print(a);
    }
    
}
