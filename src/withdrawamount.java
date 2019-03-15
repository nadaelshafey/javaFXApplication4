
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class withdrawamount {
    
    Stage stage;
    Scene scene;
    second second;
    withdrawamount withdrawamount;
    double total;
    ATMcalling ATMcalling;
    
    
   public withdrawamount(Stage stage,ATMcalling ATMcalling) {
        this.ATMcalling=ATMcalling;
        this.stage=stage;
}

    
    public void preparescene(){
          
        
         GridPane grid= new GridPane();
          Label value= new Label("ENTER VALUE:");
          TextField valueField =new TextField();
          grid.add(value,0,0);
          grid.add(valueField,1,0);
          Label screen = new Label();
          Label screenone = new Label();
          Label screentwo = new Label();
          grid.add(screen,1,3);
          grid.add(screenone,1,4);
          grid.add(screentwo,1,5);
          Button enter = new Button("ENTER");
          Button logout = new Button("back");
          grid.add(enter,1,2);
          grid.add(logout,2,2);

    
          enter.setOnAction(new EventHandler<ActionEvent>(){
     @Override
      public void handle(ActionEvent event){
          String value = valueField.getText();
          double y= Double.parseDouble(value);
          double balance = ATMcalling.getBalance();
          if(balance >= y)
          {   double total = ATMcalling.getBalance();
              ATMcalling.withdraw(y);
              double n = ATMcalling.getBalance();
              screen.setText("TOTAL AMOUNT ="+total);
              screenone.setText("CASH WITHDRAW ="+y);
              screentwo.setText("FINAL AMOUNT ="+n);
              ATMcalling.setBalance(n);
          }
          else {
              screen.setText("THERE'S NOT ENOUGH MONEY ! ");
          }
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
   
    public void setwithdrawamount(withdrawamount withdrawamount) {
        this.withdrawamount = withdrawamount;
    }
    
     public void setsecond(second second) 
     {
        this.second = second;
    }
    
     

    
}
