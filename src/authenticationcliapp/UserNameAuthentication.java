/*#########################################################
This program created by Hashim Khubrani twitter: @HJKCS2002
##########################################################*/
package authenticationcliapp;
import java.util.Scanner;
public class UserNameAuthentication {
        
        //### Varibles and Arrays Area ###.
        
        private String username;
        private boolean conditionLength = false;
        private boolean conditionisUppercase = false;
        private boolean conditionisLowercase = false;
        private boolean conditioniSymbols = false;
        private char Symbols[] = {'@', '-', '#', '_'};        
        Scanner reader = new Scanner(System.in);
        
        //### Constractor ###.
        public UserNameAuthentication(String initUserName){
              username = initUserName;
        }
        
        public void userSymbolCheck(String username){
            for(int indexArray = 0; indexArray < Symbols.length; indexArray++){
                for(char temp: username.toCharArray()){
                    if(Symbols[indexArray] == temp){
                        conditioniSymbols = true;
                    }
                    
                }
            }
                               
        } 
        
        public void usernameLengthCheck(String username){
            if(username.length() >= 12){
                conditionLength = true;   
            }
        }
        
        public void usernameisUppercaseCheck(String username){
                for(char temp: username.toCharArray()){
                   if(Character.isUpperCase(temp)){
                        conditionisUppercase = true;
                   }            
           
        }
         
    }
        public void usernameisLowercaseCheck(String username){
                for(char temp: username.toCharArray()){
                   if(Character.isUpperCase(temp)){
                       conditionisLowercase = true;
                   }             
        }
      }     
        //### This is Main Methoed in Class ###.
        public void setUserName(String username){
            
            usernameLengthCheck(username);
            usernameisUppercaseCheck(username);
            usernameisLowercaseCheck(username);
            userSymbolCheck(username);
            
            if(conditionLength && conditionisLowercase && conditionisUppercase && conditioniSymbols )
                    this.username = username;
            else{
                if(conditionLength == false){
                    System.out.println("The input  it isn't correct...\nThe "
                            + "username less thsn 12 characters..Try agian");
                    System.out.print("Enter username: ");
                    username = reader.next();
                    usernameLengthCheck(username);
                    setUserName(username);
                }
                
                if(conditionisUppercase == false){
                    System.out.println("The input  it isn't correct...\nThe "
                            + "username there isn't upercase character..Try agian");
                    System.out.print("Enter username: ");
                    username = reader.next();
                    usernameisUppercaseCheck(username);
                    setUserName(username);
                }
                
                if(conditionisLowercase == false){
                    System.out.println("The input  it isn't correct...\nThe "
                            + "username there isn't lowercase character..Try agian");
                    System.out.print("Enter username: ");
                    username = reader.next();
                    usernameisLowercaseCheck(username);
                    setUserName(username);
                }
                
                if(conditioniSymbols == false){
                    System.out.println("The input  it isn't correct...\nThe "
                            + "Username there isn't a Symbole..Try agian");
                    System.out.print("Enter Username: ");
                    username = reader.next();
                    userSymbolCheck(username);
                    setUserName(username);
                }                 
            }        
        
        }
        
        public String getUserName(){
            return username;
        }
}
