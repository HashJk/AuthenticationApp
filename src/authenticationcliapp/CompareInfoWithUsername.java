/*#########################################################
This program created by Hashim Khubrani twitter: @HJKCS2002
##########################################################*/

package authenticationcliapp;

public class CompareInfoWithUsername extends UserNameAuthentication {
    
    //### Varibles Area ###.
    
    private String firstName;
    private String lastName;
    private String email;
    private String birthDate;
    
    //### Constractor Area ###.
    
    public CompareInfoWithUsername(String initUsername){
        super(initUsername);
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
