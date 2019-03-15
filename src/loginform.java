import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
//import javafx.scene.paint.Color;
//import static javafx.scene.paint.Color.color;

public class loginform {
    Stage stage;
    Scene scene;
    first firststep;
    second secondstep;
    //User A =new user();
    public loginform(Stage stage){
        this.stage = stage;
    }
    
 public void preparesence(){
     firststep =new first();
    
     Label usernameLabel= new Label("username:");
     Label passwordLabel= new Label("password: ");
     TextField usernameField =new TextField();
     PasswordField passwordField =new PasswordField();
     Button enter = new Button("ENTER");
     Label validationlabel = new Label();
      
     GridPane grid= new GridPane();
     grid.add(usernameLabel,0,0);
     grid.add(passwordLabel,0,1);
     grid.add(usernameField,1,0); 
     grid.add(passwordField,1,1);
     grid.add(enter,1,2);
     grid.add(validationlabel,1,3);
     enter.setOnAction(new EventHandler<ActionEvent>(){
     @Override
      public void handle(ActionEvent event){
          String username = usernameField.getText();
           String password = passwordField.getText();
           
           boolean valid=firststep.validate(username,password);
           if(valid) {validationlabel.setText("WELCOME MRS."+username);
              validationlabel.setFont(Font.font("verdana",20));
              stage.setScene(secondstep.getScene());
           } else
           { 
           validationlabel.setText("**WRONG PLEASE TRY AGAIN**");
           validationlabel.setFont(Font.font("verdana",20));
      
           }
     }
    });
    scene =new Scene(grid,600,500);
 }
 public Scene getScene()
 { 
     
     return this.scene;
 }

    public void setSecondstep(second secondstep) {
        this.secondstep = secondstep;
    }

}
