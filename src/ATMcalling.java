
import java.util.ArrayList;


public class ATMcalling {
    private double balance;
    ArrayList<String> arraylist = new ArrayList<String>();
    int i =0;
 public void deposit(String amount)
    {
       double x= Double.parseDouble(amount);
       balance=balance+x;
       arraylist.add(amount);
       i++;
    }
 public void withdraw(double amount)
   {
        balance =balance -amount;
        String s=Double.toString(amount);
        arraylist.add(s);
         i++;
    }
 public String next()
 {
    return arraylist.get(++i);
 }
 public String previous(){
     
        return arraylist.get(--i);
     
   }
 public void setBalance(double balance) 
     {
        this.balance = balance;
      }
    public double getBalance() {
        
        String s=Double.toString(balance);
        arraylist.add(s);
        i++;
        return balance;
    }
    

    
    }
    
    

