
package contacts;

import java.util.regex.Pattern;

public class Contact {
    
    private String fullName;
    private String phoneNumber;
    private String email;
    private String adress;
    private String message;
    private boolean f;
    
    //IIB ----------------------------------
    {
        fullName = "";
        phoneNumber = "";
        email = "";
        adress = "";
        message = "";
        f = true;
    }
    
    public String getMessage(){
        return message;
    }
    
    public Contact(String fullName,String phoneNumber,String email,String adress){
        this(fullName,phoneNumber,email);
        setAdress(adress);
    
    
    }
    
    public Contact(String fullName,String phoneNumber,String email){
        setFullName(fullName);
        setPhoneNumber(phoneNumber);
        setEmail(email);
    }
    
    //Name Getter ----------------------------------
    public String getFullName(){
        return fullName.trim() ;
    }
    //Name Setter ----------------------------------
    public void setFullName(String fullName){
        
        if(!fullName.isEmpty() && fullName.trim().replaceAll("[ ]+", " ").length() > 5){
            this.fullName = fullName.trim().replaceAll("[ ]+", " "); //removes unneeded spaces
        }
        else{
            message += "Invalid Name!\n";
            f= false;
        } 
    }
    
    //phoneNumber Getter ----------------------------------
    public String getPhoneNumber(){
        return phoneNumber.trim();
    }
    //phoneNumber Setter ----------------------------------
    public void setPhoneNumber(String phoneNumber){
        
        if(Pattern.matches("((?:\\+20|20|0)1[0125])?\\d{8}$", phoneNumber.trim())){
            this.phoneNumber = phoneNumber;
        }
        else{
            message +="Invalid Phone Number!\n";
            f= false;
        }
    }
    
    //email Getter ----------------------------------
    public String getEmail(){
        return email.trim();
    }      
    //email Setter ----------------------------------
    public void setEmail(String email){
        if(Pattern.matches("[a-z0-9]{5,20}@[a-z]{3,8}\\.[a-z]{3,4}$", email.trim().toLowerCase())){
            this.email = email.trim().toLowerCase();
        }
        else{
            message += "Invalid Email!\n";
            f=false;
        }
    }
       
    //adress Getter ----------------------------------
    public String getAdress(){
        return adress.trim();
    }
    //adress Setter ----------------------------------
    public void setAdress(String adress){
        if(!(adress.trim().length()>30 || adress.trim().length()<3)){
            this.adress = adress.trim(); 
        }
        else{
            message +="Invalid Adress!\n";
            f=false;
        }
    }
    
    public boolean flag(){
        return f;
    }   
}