
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class check {
     Stage stage;
     Scene scene;
     ATMcalling ATMcalling;
     check check;
     second second;
   
    public check(Stage stage,ATMcalling ATMcalling) {
        this.ATMcalling=ATMcalling;
        this.stage=stage;
}

    public void preparescene()
    {
        Label screen = new Label();
        Button back= new Button("back");
        Button show= new Button("show balance");
        GridPane grid= new GridPane();
        grid.add(screen,0,0);
        grid.add(back,0,4);
        grid.add(show,0,2);
        
         double n=ATMcalling.getBalance();
          screen.setText("Final balance = "+n);
          screen.setFont(Font.font("verdana",15));
         
         back.setOnAction(new EventHandler<ActionEvent>(){
     @Override
      public void handle(ActionEvent event){
          stage.setScene(second.getScene());
         
      }});
         show.setOnAction(new EventHandler<ActionEvent>(){
     @Override
      public void handle(ActionEvent event){
         double n=ATMcalling.getBalance();
          screen.setText("Final balance = "+n);
          screen.setFont(Font.font("verdana",15));
      }});
         scene = new Scene(grid,400,200);
    }

    public Scene getScene() {
        return scene;
    }
  
    public void setsecond(second second) {
        this.second = second;
    }
    
    public ATMcalling getATMcalling() {
        return ATMcalling;
    }
    
}
