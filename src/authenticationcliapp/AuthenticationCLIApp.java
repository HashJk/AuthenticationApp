/*#########################################################
This program created by Hashim Khubrani twitter: @HJKCS2002
##########################################################*/
package authenticationcliapp;
import java.util.Scanner;
public class AuthenticationCLIApp {

    public static void main(String[] args) {
        //### Objecet Area ###.
        PasswordAuthentication serverpass = new PasswordAuthentication("Enter Password");
        UserNameAuthentication serveruser = new UserNameAuthentication("Enter Username");
        Scanner reader = new Scanner(System.in);
        
       
        
        System.out.println("####This program created by Hashim Khubrani twitter: @HJKCS2002####");
        
        //### Print Statements ###.
        
        System.out.print("Enter your password: ");
        String password = reader.next();        
        System.out.print("Enter your username: ");
        String username = reader.next();
       
        //### Invoking Method ###.
        serverpass.setPassword(password);
        serveruser.setUserName(username);
        
        System.out.println("your Pass is: " + serverpass.getPassword() + " | your Username is: " + serveruser.getUserName());
      
    }
    
}
