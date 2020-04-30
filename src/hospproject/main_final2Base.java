package hospproject;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class main_final2Base extends VBox {
    
    protected final MenuBar menuBar;
    protected final Menu menu;
    protected final MenuItem menuItem;
    protected final Menu menu0;
    protected final MenuItem menuItem0;
    protected final AnchorPane anchorPane;
    protected final Group group;
    protected final ImageView imageView;
    protected final PasswordField passwordField;
    protected final DropShadow dropShadow;
    protected final TextField textField;
    protected final DropShadow dropShadow0;
    protected final Button button;
    protected final ColorAdjust colorAdjust;
    protected final Label label;
    protected final Label isConnected;
    protected final Pane musicPane;
    
    //protected LoginModel loginModel =new LoginModel();
    public main_final2Base() {
        
        menuBar = new MenuBar();
        menu = new Menu();
        menuItem = new MenuItem();
        menu0 = new Menu();
        menuItem0 = new MenuItem();
        anchorPane = new AnchorPane();
        group = new Group();
        imageView = new ImageView();
        passwordField = new PasswordField();
        dropShadow = new DropShadow();
        textField = new TextField();
        dropShadow0 = new DropShadow();
        button = new Button();
        colorAdjust = new ColorAdjust();
        label = new Label();
        isConnected = new Label();
        musicPane = new Pane();
        
        setPrefHeight(636.0);
        setPrefWidth(932.0);

        VBox.setVgrow(menuBar, javafx.scene.layout.Priority.NEVER);

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
        anchorPane.setPrefHeight(414.0);
        anchorPane.setPrefWidth(675.0);
        anchorPane.setStyle("-fx-background-color: #FFFFFF;");

        group.setLayoutX(384.0);
        group.setLayoutY(211.0);

        imageView.setFitHeight(433.0);
        imageView.setFitWidth(574.0);
        imageView.setLayoutX(-247.0);
        imageView.setLayoutY(-113.0);
        imageView.setImage(new Image("file:resources/pics/1.png"));

        passwordField.setLayoutX(-8.0);
        passwordField.setLayoutY(141.0);
        passwordField.setPromptText("Enter your password");
        passwordField.setFont(Font.loadFont("file:resources/fonts/SourceSansPro-Light.otf", 12.0));

        
        
        
        dropShadow.setColor(javafx.scene.paint.Color.valueOf("#0000005e"));
        dropShadow.setHeight(2.0);
        dropShadow.setOffsetY(1.0);
        dropShadow.setRadius(0.0);
        dropShadow.setWidth(0.0);
        passwordField.setEffect(dropShadow);

        textField.setLayoutX(-8.0);
        textField.setLayoutY(104.0);
        textField.setPromptText("Enter your ID");
        textField.setFont(Font.loadFont("file:resources/fonts/SourceSansPro-Light.otf", 12.0));

        dropShadow0.setColor(javafx.scene.paint.Color.valueOf("#0000005e"));
        dropShadow0.setHeight(4.0);
        dropShadow0.setOffsetY(1.0);
        dropShadow0.setRadius(0.5);
        dropShadow0.setWidth(0.0);
        textField.setEffect(dropShadow0);
        
        
        isConnected.setLayoutX(417.0);
        isConnected.setLayoutY(538.0);
        isConnected.setText("Status");
        isConnected.setFont(Font.loadFont("file:resources/fonts/SourceSansPro-Light.otf", 20.0));
        isConnected.setTextFill(javafx.scene.paint.Color.GRAY);

        button.setLayoutX(35.0);
        button.setLayoutY(186.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(34.0);
        button.setPrefWidth(62.0);
        button.setText("Login");
        button.setFont(Font.loadFont("file:resources/fonts/SourceSansPro-Light.otf", 12.0));
        button.setOnAction( e ->{
             if(textField.getText().equals("admin") && passwordField.getText().equals("admin"))
            {
                isConnected.setText("Connected Succesfully");
                isConnected.setTextFill(javafx.scene.paint.Color.GREEN);
                sectionsBase sections = new sectionsBase();
                Scene sectionScene = new Scene(sections);
                
                Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
                window.setScene(sectionScene);
                window.show();
            }
            else{
             isConnected.setText("Cannot Connect! Please write right ID&Password");
             isConnected.setTextFill(javafx.scene.paint.Color.RED);
                     }
        });

        
  
       
        
        colorAdjust.setBrightness(-0.07);
        colorAdjust.setContrast(0.12);
        colorAdjust.setSaturation(-0.38);
        button.setEffect(colorAdjust);

        label.setLayoutX(400.0);
        label.setLayoutY(56.0);
        label.setText("Hospitaly");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#3f51b5"));
        label.setFont(Font.loadFont("file:resources/fonts/Pacifico.ttf", 34.0));

        menu.getItems().add(menuItem);
        menuBar.getMenus().add(menu);
        menu0.getItems().add(menuItem0);
        menuBar.getMenus().add(menu0);
        getChildren().add(menuBar);
        group.getChildren().add(imageView);
        group.getChildren().add(passwordField);
        group.getChildren().add(textField);
        group.getChildren().add(button);
        anchorPane.getChildren().add(group);
        anchorPane.getChildren().add(label);
        getChildren().add(anchorPane);
    }
    
}
