package hospproject;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class sectionsBase extends VBox {

    protected final MenuBar menuBar;
    protected final Menu menu;
    protected final MenuItem menuItem;
    protected final Menu menu0;
    protected final MenuItem menuItem0;
    protected final AnchorPane anchorPane;
    protected final Label label;
    protected final Pane pane;
    protected final ImageView imageView;
    protected final Pane pane0;
    protected final ImageView imageView0;
    protected final Pane pane1;
    protected final ImageView imageView1;
    protected final Button button;
    protected final Button button0;
    protected final Button button1;

    public sectionsBase() {

        menuBar = new MenuBar();
        menu = new Menu();
        menuItem = new MenuItem();
        menu0 = new Menu();
        menuItem0 = new MenuItem();
        anchorPane = new AnchorPane();
        label = new Label();
        pane = new Pane();
        imageView = new ImageView();
        pane0 = new Pane();
        imageView0 = new ImageView();
        pane1 = new Pane();
        imageView1 = new ImageView();
        button = new Button();
        button0 = new Button();
        button1 = new Button();

        setPrefHeight(576.0);
        setPrefWidth(922.0);

        VBox.setVgrow(menuBar, javafx.scene.layout.Priority.NEVER);
        menuBar.setStyle("-fx-background-color: #6c63ff;");

        menu.setMnemonicParsing(false);
        menu.setText("File");

        menuItem.setMnemonicParsing(false);
        menuItem.setText("Quit");

        menu0.setMnemonicParsing(false);
        menu0.setText("Help");

        menuItem0.setMnemonicParsing(false);
        menuItem0.setText("About MyHelloApp");

        VBox.setVgrow(anchorPane, javafx.scene.layout.Priority.ALWAYS);
        anchorPane.setMaxHeight(-1.0);
        anchorPane.setMaxWidth(-1.0);
        anchorPane.setPrefHeight(-1.0);
        anchorPane.setPrefWidth(-1.0);
        anchorPane.setStyle("-fx-background-color: #FFFFFF;");

        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setLayoutX(320.0);
        label.setLayoutY(60.0);
        
        label.setText("Welcome! Which section you want?");
        label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label.setWrapText(false);
        label.setFont(new Font(18.0));

        pane.setLayoutX(391.0);
        pane.setLayoutY(210.0);
        pane.setPrefHeight(200.0);
        pane.setPrefWidth(95.0);
        pane.setStyle("-fx-border-color: #000000;");

        imageView.setFitHeight(197.0);
        imageView.setFitWidth(90.0);
        imageView.setLayoutX(3.0);
        imageView.setLayoutY(2.0);
        imageView.setImage(new Image("file:resources/pics/nurses_tableView.png"));

        pane0.setLayoutX(670.0);
        pane0.setLayoutY(242.0);
        pane0.setPrefHeight(137.0);
        pane0.setPrefWidth(200.0);
        pane0.setStyle("-fx-border-color: #000000;");

        imageView0.setFitHeight(134.0);
        imageView0.setFitWidth(195.0);
        imageView0.setLayoutX(3.0);
        imageView0.setLayoutY(2.0);
        imageView0.setImage(new Image("file:resources/pics/patients_tableView.png"));

        pane1.setLayoutX(107.0);
        pane1.setLayoutY(210.0);
        pane1.setPrefHeight(200.0);
        pane1.setPrefWidth(93.0);
        pane1.setStyle("-fx-border-color: #000000;");

        imageView1.setFitHeight(198.0);
        imageView1.setFitWidth(90.0);
        imageView1.setLayoutX(2.0);
        imageView1.setLayoutY(1.0);
        imageView1.setImage(new Image("file:resources/pics/doctors_tableView.png"));

        button.setLayoutX(121.0);
        button.setLayoutY(434.0);
        button.setMnemonicParsing(false);
        button.setStyle("-fx-border-radius: 0; -fx-background-color: #CED9FA; -fx-border-color: #000000;");
        button.setText("Doctors");
        button.setOnAction(e ->{
                doctorTableViewBase doctorBase = new doctorTableViewBase();
                Scene doctorScene = new Scene(doctorBase);
                
                //with an action event, getSource() doesn't actually know what's returned with 
                // it knows that it's a type of object, so make it a node type object
                //and because its a node object, we can getScene() and getWindow()
                // then convert them into Stage type, basically this line 
                // makes you switch to other scene in main stage
                Stage doctorWindow = (Stage)((Node)e.getSource()).getScene().getWindow();
                
                doctorWindow.setScene(doctorScene);
                doctorWindow.show();
            
        });
        

        button0.setLayoutX(411.0);
        button0.setLayoutY(434.0);
        button0.setMnemonicParsing(false);
        button0.setStyle("-fx-border-radius: 0; -fx-background-color: #CED9FA; -fx-border-color: #000000;");
        button0.setText("Nurses");

        button1.setLayoutX(740.0);
        button1.setLayoutY(434.0);
        button1.setMnemonicParsing(false);
        button1.setStyle("-fx-border-radius: 0; -fx-background-color: #CED9FA; -fx-border-color: #000000;");
        button1.setText("Patients");
        button1.setOnAction(e->{
            patientTableViewBase patientBase = new patientTableViewBase();
                Scene doctorScene = new Scene(patientBase);
                
                //with an action event, getSource() doesn't actually know what's returned with 
                // it knows that it's a type of object, so make it a node type object
                //and because its a node object, we can getScene() and getWindow()
                // then convert them into Stage type, basically this line 
                // makes you switch to other scene in main stage
                Stage doctorWindow = (Stage)((Node)e.getSource()).getScene().getWindow();
                
                doctorWindow.setScene(doctorScene);
                doctorWindow.show();
        });

        menu.getItems().add(menuItem);
        menuBar.getMenus().add(menu);
        menu0.getItems().add(menuItem0);
        menuBar.getMenus().add(menu0);
        getChildren().add(menuBar);
        anchorPane.getChildren().add(label);
        pane.getChildren().add(imageView);
        anchorPane.getChildren().add(pane);
        pane0.getChildren().add(imageView0);
        anchorPane.getChildren().add(pane0);
        pane1.getChildren().add(imageView1);
        anchorPane.getChildren().add(pane1);
        anchorPane.getChildren().add(button);
        anchorPane.getChildren().add(button0);
        anchorPane.getChildren().add(button1);
        getChildren().add(anchorPane);

    }
}
