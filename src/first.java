
import java.util.HashMap;

public class first {
    HashMap usersDictionary;
    public first(){
    usersDictionary=new HashMap();
    usersDictionary.put("Ahmed","1234");
    usersDictionary.put("Ali","9876");
    usersDictionary.put("Nada","3199");
    
    }
    public boolean validate(String username,String password){
        boolean validationResult;
        String fetchedpassword = (String) usersDictionary.get(username);
        if(fetchedpassword!=null)
           {
        validationResult=fetchedpassword.equals(password);
            }
        else{validationResult=false;}
        return validationResult;
       }
}
