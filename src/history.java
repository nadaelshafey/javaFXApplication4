
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class history {
    
     Stage stage;
     Scene scene;
     ATMcalling ATMcalling;
     check check;
     second second;
     withdrawamount withdrawamount;
     amount amount;
     loginform loginform;
     ArrayList<String> arraylist = new ArrayList<String>();
    public history(Stage stage,ATMcalling ATMcalling)
    {
       this.stage=stage;
       this.ATMcalling=ATMcalling;
        
    }
    public void preparescene()
    { 
        Label screen = new Label();
        Button back= new Button("back");
        Button next= new Button("NEXT");
        Button previous= new Button("PREVIOUS");
        GridPane grid= new GridPane();
        grid.add(screen,0,0);
        grid.add(next,0,1);
        grid.add(previous,1,1);
        grid.add(back,2,0);
        back.setOnAction(new EventHandler<ActionEvent>(){
     @Override
      public void handle(ActionEvent event){
          stage.setScene(second.getScene());
         
      }});
         next.setOnAction(new EventHandler<ActionEvent>(){
     @Override
      public void handle(ActionEvent event){
          
         ATMcalling.next();

          screen.setText(ATMcalling.next());
          screen.setFont(Font.font("verdana",15));
      }});
          previous.setOnAction(new EventHandler<ActionEvent>(){
     @Override
      public void handle(ActionEvent event){
           
           if(ATMcalling.previous()!=null)
           {
          screen.setText(ATMcalling.previous());
          screen.setFont(Font.font("verdana",15));}
           else  screen.setText("EMPTY");
      }});
         scene = new Scene(grid,400,200);
    } 
    

    public void setscene(Scene scene) {
        this.scene = scene;
    }

    public Scene getScene() {
        return scene;
    }

    public void setsecond(second second) {
        this.second = second;
    } 

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    

    
    
}
