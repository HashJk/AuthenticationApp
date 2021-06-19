package authenticationcliapp;
import java.util.Scanner;
public class PasswordAuthentication {
        
        private String password;
        private boolean conditionLength = false;
        private boolean conditionisUppercase = false;
        private boolean conditionisLowercase = false;
        private boolean conditioniSymbols = false;
        private char Symbols[] = {'@', '-', '#', '_'};
        Scanner reader = new Scanner(System.in);
        
        public PasswordAuthentication(String initPassword){
            password = initPassword;
        }
        
        public void passwordSymbolCheck(String password){
            for(int indexArray = 0; indexArray < Symbols.length; indexArray++){
                for(char temp: password.toCharArray()){
                    if(Symbols[indexArray] == temp){
                        conditioniSymbols = true;
                    }
                    
                }
            }
                               
        }
        
        public void passwordLengthCheck(String password){
            if(password.length() >= 12){
                conditionLength = true;   
            }
        }
        
        public void passwordisUppercaseCheck(String password){
                for(char temp: password.toCharArray()){
                   if(Character.isUpperCase(temp)){
                        conditionisUppercase = true;
                   }            
           
        }
         
    }
        public void passwordisLowercaseCheck(String password){
                for(char temp: password.toCharArray()){
                   if(Character.isUpperCase(temp)){
                       conditionisLowercase = true;
                   }            
            
        }
      }
        public void setPassword(String password){
           
            passwordLengthCheck(password);
            passwordisUppercaseCheck(password);
            passwordisLowercaseCheck(password);
            passwordSymbolCheck(password);
            
            if(conditionLength && conditionisLowercase && conditionisUppercase && conditioniSymbols )
                    this.password = password;
            else{
                if(conditionLength == false){
                    System.out.println("The input  it isn't correct...\nThe "
                            + "password less thsn 12 characters..Try agian");
                    System.out.print("Enter Password: ");
                    password = reader.next();
                    passwordLengthCheck(password);
                    setPassword(password);
                }
                
                if(conditionisUppercase == false){
                    System.out.println("The input  it isn't correct...\nThe "
                            + "password there isn't upercase character..Try agian");
                    System.out.print("Enter Password: ");
                    password = reader.next();
                    passwordisUppercaseCheck(password);
                    setPassword(password);
                }
                
                if(conditionisLowercase == false){
                    System.out.println("The input  it isn't correct...\nThe "
                            + "password there isn't lowercase character..Try agian");
                    System.out.print("Enter Password: ");
                    password = reader.next();
                    passwordisLowercaseCheck(password);
                    setPassword(password);
                }                
                
                if(conditioniSymbols == false){
                    System.out.println("The input  it isn't correct...\nThe "
                            + "password there isn't a Symbole..Try agian");
                    System.out.print("Enter Password: ");
                    password = reader.next();
                    passwordSymbolCheck(password);
                    setPassword(password);
                }            
            
            }
        }
        
        
        public String getPassword(){
            return password;
        }                
    
}
