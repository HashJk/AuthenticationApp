/*#########################################################
This program created by Hashim Khubrani twitter: @HJKCS2002
##########################################################*/

// Muaters Method == Settres & Getters 

package authenticationcliapp;

public class CompareInfoWithPass extends PasswordAuthentication{
    
    //### Varibles Area ###.
    
    private String firstName;
    private String lastName;
    private String email;
    private String birthDate;
    
    //### Constractor Area ###.
    
    public CompareInfoWithPass(String initPassword){
        super(initPassword);
    }
    
    //### Muaters Method Area ###.
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
    }
    
    public String getBirthDate(){
        return birthDate;
    }
    
    
}
