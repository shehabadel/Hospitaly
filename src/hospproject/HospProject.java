/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospproject;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import com.sun.prism.paint.Color;
import java.io.File;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

/**
 *
 * @author Siloo
 */
public class HospProject extends Application {
   
       @Override
    public void start(Stage stage ) throws Exception {
    

        //Parent root = FXMLLoader.load(getClass().getResource("main_final2.fxml"));
        main_final2Base login = new main_final2Base(); //dh ely gowah el login button 
        
        Scene scene = new Scene(login);
        
        login.menuItem.setOnAction( e ->{
            stage.close();
        });
                
        stage.setScene(scene);
        stage.setTitle("Hospitaly");
        stage.show();
        
        
        login.button.setOnAction(e ->{
            if(login.textField.getText().equals("admin") && login.passwordField.getText().equals("admin"))
            {
                
                sectionsBase sections = new sectionsBase();
                Scene sectionScene = new Scene(sections);
                
                Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
                window.setScene(sectionScene);
                window.show();
            }
            else{
             login.isConnected.setText("Cannot Connect! Please write right ID&Password");
             login.isConnected.setTextFill(javafx.scene.paint.Color.RED);
                     }
        });

        
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
