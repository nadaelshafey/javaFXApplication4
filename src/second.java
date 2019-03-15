import java.util.HashSet;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
//import javafx.scene.shape.Circle;

public class second {
    
    Stage stage;
    Scene scene;
    loginform loginform;
    amount amount;
    withdrawamount withdrawamount;
    ATMcalling ATMcalling;
    check check;
    history history;
    public second(Stage stage)
    {
        this.stage= stage;
    }
   
    public void preparescene(){
        
        
        Button logout=new Button ("back");
        Button withdraw=new Button ("withdraw");
        Button deposit=new Button ("deposit");
        Button checking=new Button ("checking account");
        Button History = new Button ("history");
        GridPane grid= new GridPane();
        grid.add(withdraw,0,0);
        grid.add(deposit,0,1);
        grid.add(checking,0,2);
        grid.add(logout,1,3);
        grid.add(History,0,3);
        //withdraw.setOnAction(e->ButtonClicked(e));
        //deposit.setOnAction(e->ButtonClicked(e));
        
          withdraw.setOnAction(new EventHandler<ActionEvent>(){
     @Override
      public void handle(ActionEvent event){
          
          stage.setScene(withdrawamount.getScene());       
      }});
           
            deposit.setOnAction(new EventHandler<ActionEvent>(){
     @Override
      public void handle(ActionEvent event){
          stage.setScene(amount.getScene());    
      }});
           checking.setOnAction(new EventHandler<ActionEvent>(){
     @Override
      public void handle(ActionEvent event){
           stage.setScene(check.getScene());
      }});
              logout.setOnAction(new EventHandler<ActionEvent>(){
     @Override
      public void handle(ActionEvent event){
          stage.setScene(loginform.getScene());
            }});
        History.setOnAction(new EventHandler<ActionEvent>(){
     @Override
      public void handle(ActionEvent event){
         stage.setScene(history.getScene());
      }});
        scene =new Scene(grid,600,500);
     
    }
    public Scene getScene(){
    return scene;
    }

    public void setLoginform(loginform loginform) {
        this.loginform = loginform;
    }
     public void setamount(amount amount) 
     {
        this.amount = amount;
    
     }

    public void setcheck(check check) {
        this.check = check;
    }
     
     public void setwithdrawamount(withdrawamount withdrawamount)
     {
      this.withdrawamount=withdrawamount;
     }

    public void sethistory(history history) {
        this.history = history;
    }

    
     

    /*private void ButtonClicked(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    public void setATMcalling(ATMcalling ATMcalling) {
        this.ATMcalling = ATMcalling;
    }

    public ATMcalling getATMcalling() {
        return ATMcalling;
    }
     
}
   
   

