/*#########################################################
This program created by Hashim Khubrani twitter: @HJKCS2002
##########################################################*/

package authenticationcliapp;
import java.util.Scanner;
public class AuthenticationCLIApp {

    public static void main(String[] args) {
        
        //### Objecet Area ###.
        PasswordAuthentication serverPass = new PasswordAuthentication("Enter Password");
        UserNameAuthentication serverUser = new UserNameAuthentication("Enter Username");
        CompareInfoWithPass serverComparePass = new CompareInfoWithPass("Enter Passowrd");
        CompareInfoWithUsername serverCompareUsername = new CompareInfoWithUsername("Enter Username");
        Scanner reader = new Scanner(System.in);
        
       
        //### Print Logo ###.
        System.out.println("####This program created by Hashim Khubrani twitter: @HJKCS2002#### \n");
        
        //### Print Statements ###.
        System.out.println("Please, to write correct Password and Username you have to apply this instructions: \n"
                + " * The Password and Uesrname have to greater than or equal to 12. \n"
                + " * The Password and Uesrname have to inclode one Uppercase at less. \n"
                + " * The Password and Uesrname have to inclode one Lowercase at less. \n"
                + " * The Password and Uesrname have to inclode one Symbol at less. \n" 
                + " * The Password and Uesrname have to inclode one Number at less. \n" );
       
        System.out.print("Enter your First Name:");
        String firstName = reader.next();
        System.out.print("Enter your Last Name:");
        String lastName = reader.next();
        System.out.print("Enter your email address: ");
        String email = reader.next();
        System.out.println("Please, write Birth Date as DD/MM/YY");
        System.out.print("Enter your birthdate:");
        String birthDate = reader.next();
        System.out.print("Enter your password: ");
        String password = reader.next();        
        System.out.print("Enter your username: ");
        String username = reader.next();
       
        //### Invoking Method ###.
        serverPass.setPassword(password);
        serverUser.setUserName(username);
        serverComparePass.setFirstName(firstName);
        serverComparePass.setLastName(lastName);
        serverComparePass.setEmail(email);
        serverComparePass.setBirthDate(birthDate);
        
        System.out.println("your Pass is: " + serverPass.getPassword() + " | your Username is: " + serverUser.getUserName()
        // + "firstName is: " + serverComparePass.getFirstName()
        );
      
    }
    
}
