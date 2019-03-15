import javafx.application.Application;
//import javafx.scene.Scene;
import javafx.stage.Stage;

public class bank extends Application {
      private double balance;
      ATMcalling ATMcalling;
    public static void main (String[] args){
     launch(args);
      
    }
    @Override
 public void start(Stage primaryStage) throws Exception{
     primaryStage.setTitle("ATM");
     loginform loginform=new loginform(primaryStage);
     second second = new second(primaryStage);
     ATMcalling ATMcalling = new ATMcalling();
     amount amount = new amount(primaryStage,ATMcalling);
     withdrawamount withdrawamount=new withdrawamount(primaryStage,ATMcalling);
     check check=new check(primaryStage,ATMcalling);
     history history = new history(primaryStage,ATMcalling);
     loginform.preparesence();
     second.preparescene();
     amount.preparescene();
     withdrawamount.preparescene();
     check.preparescene();
     history.preparescene();
     loginform.setSecondstep(second);
     second.setLoginform(loginform);
     second.setamount(amount);
     second.setwithdrawamount(withdrawamount);
     amount.setsecond(second);
     withdrawamount.setsecond(second);
     second.setcheck(check);
     check.setsecond(second);
     history.setsecond(second);
     second.sethistory(history);
     primaryStage.setScene(loginform.getScene());
     primaryStage.show();
}

}