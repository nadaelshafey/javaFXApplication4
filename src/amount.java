import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
//import javafx.scene.text.Font;
import javafx.stage.Stage;

public class amount {
    Stage stage;
    Scene scene;
    second second;
    amount amount;
    double total;
    ATMcalling ATMcalling;
    
public amount(Stage stage,ATMcalling ATMcalling) {
        this.stage=stage;
        this.ATMcalling=ATMcalling;
}

    public void preparescene(){
          
        
        
          Label value= new Label("ENTER VALUE:");
          TextField valueField =new TextField();
          
          Button enter = new Button("ENTER");
          Button logout = new Button("back");
         
          Label screen= new Label(); 
          GridPane grid= new GridPane();
          grid.add(enter,1,2);
          grid.add(value,0,0);
          grid.add(valueField,1,0);
          grid.add(logout,2,2);
          grid.add(screen,0,5);
    
          
          
          enter.setOnAction(new EventHandler<ActionEvent>(){
     @Override
      public void handle(ActionEvent event){
          String value = valueField.getText();
   
           ATMcalling.deposit(value);
           double n = ATMcalling.getBalance();
           screen.setText("final balance = "+n);
           //ATMcalling.setBalance(n);

          }});
         logout.setOnAction(new EventHandler<ActionEvent>(){
     @Override
      public void handle(ActionEvent event){
          stage.setScene(second.getScene());
         
      }});
     
   
          scene =new Scene(grid,400,200);
        
    }

    public Scene getScene() {
        return scene;
    }
   
    public void setamount(amount amount) {
        this.amount = amount;
    }
    
     public void setsecond(second second) 
     {
        this.second = second;
    }

    public void setATMcalling(ATMcalling ATMcalling) {
        this.ATMcalling = ATMcalling;
    }

    public ATMcalling getATMcalling() {
        return ATMcalling;
    }
    
    
     

}
