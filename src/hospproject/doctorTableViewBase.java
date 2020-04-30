package hospproject;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class doctorTableViewBase extends VBox {

    protected final MenuBar menuBar;
    protected final Menu menu;
    protected final MenuItem menuItem;
    protected final Menu menu0;
    protected final MenuItem menuItem0;
    protected final HBox musicPlayer;
    protected final MusicPlayer mPlayer;
    protected final Label label;
    protected final Pane pane;
    protected final SplitPane splitPane;
    protected final AnchorPane anchorPane;
    protected final ImageView imageView;
    protected final Pane pane0;
    protected final Button button;
    protected final Button button0;
    protected final Button button1;
    protected final Button button2;
    protected final Label label0;
    protected final Button button3;
    protected final Pane pane1;
    protected final Button button4;
    protected final Button button5;
    protected final Button button6;
    protected final Label label1;
    protected final Button button7;
    protected final Button button8;
    protected final Button button9;
    protected final ScrollPane scrollPane;
    protected final TabPane tabPane;
    protected final Tab tab;
    protected final TableView tableView;
    protected final TableColumn idCol;
    protected final TableColumn fnCol;
    protected final TableColumn lnCol;
    protected final TableColumn genderCol;
    protected final TableColumn ageCol;
    protected final TableColumn specCol;
    protected final TableColumn shiftCol;
    protected final TableColumn DOHCol;
    protected final TableColumn salaryCol;
    protected final TableColumn appCol;
    protected final TableColumn avaCol;
    protected final TableColumn NOPCol;
    protected final TableColumn emailCol;
    protected final TableColumn pnCol;
    protected final TableColumn addressCol;
    protected final Tab tab0;
    protected final TableView tableView0;
    protected final TableColumn idCol1;
    protected final TableColumn fnCol1;
    protected final TableColumn lnCol1;
    protected final TableColumn genderCol1;
    protected final TableColumn ageCol1;
    protected final TableColumn specCol1;
    protected final TableColumn shiftCol1;
    protected final TableColumn DOHCol1;
    protected final TableColumn salaryCol1;
    protected final TableColumn appCol1;
    protected final TableColumn avaCol1;
    protected final TableColumn NOPCol1;
    protected final TableColumn emailCol1;
    protected final TableColumn pnCol1;
    protected final TableColumn addressCol1;

    public doctorTableViewBase() {

        menuBar = new MenuBar();
        menu = new Menu();
        menuItem = new MenuItem();
        menu0 = new Menu();
        menuItem0 = new MenuItem();
        musicPlayer = new HBox();
        label = new Label();
        pane = new Pane();
        splitPane = new SplitPane();
        anchorPane = new AnchorPane();
        imageView = new ImageView();
        pane0 = new Pane();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        button2 = new Button();
        label0 = new Label();
        button3 = new Button();
        pane1 = new Pane();
        button4 = new Button();
        button5 = new Button();
        button6 = new Button();
        label1 = new Label();
        button7 = new Button();
        button8 = new Button();
        button9 = new Button();
        scrollPane = new ScrollPane();
        tabPane = new TabPane();
        tab = new Tab();
        tableView = new TableView();
        idCol = new TableColumn();
        fnCol = new TableColumn();
        lnCol = new TableColumn();
        genderCol = new TableColumn();
        ageCol = new TableColumn();
        specCol = new TableColumn();
        shiftCol = new TableColumn();
        DOHCol = new TableColumn();
        salaryCol = new TableColumn();
        appCol = new TableColumn();
        avaCol = new TableColumn();
        NOPCol = new TableColumn();
        emailCol = new TableColumn();
        pnCol = new TableColumn();
        addressCol = new TableColumn();
        tab0 = new Tab();
        tableView0 = new TableView();
        idCol1 = new TableColumn();
        fnCol1 = new TableColumn();
        lnCol1 = new TableColumn();
        genderCol1 = new TableColumn();
        ageCol1 = new TableColumn();
        specCol1 = new TableColumn();
        shiftCol1 = new TableColumn();
        DOHCol1 = new TableColumn();
        salaryCol1 = new TableColumn();
        appCol1 = new TableColumn();
        avaCol1 = new TableColumn();
        NOPCol1 = new TableColumn();
        emailCol1 = new TableColumn();
        pnCol1 = new TableColumn();
        addressCol1 = new TableColumn();
        mPlayer= new MusicPlayer();
        
        /* Old Code
        mPlayer.playButton.setLayoutX(77.0);
        mPlayer.playButton.setLayoutY(9.0);
        
        mPlayer.pauseButton.setLayoutX(89.0);
        mPlayer.pauseButton.setLayoutY(9.0);        
                */
        
        setPrefHeight(714.0);
        setPrefWidth(1071.0);

        VBox.setVgrow(menuBar, javafx.scene.layout.Priority.NEVER);
        menuBar.setStyle("-fx-background-color: #6c63ff; -fx-border-color: #707070;");

        menu.setMnemonicParsing(false);
        menu.setText("File");

        menuItem.setMnemonicParsing(false);
        menuItem.setText("Quit");

        menu0.setMnemonicParsing(false);
        menu0.setText("Help");

        menuItem0.setMnemonicParsing(false);
        menuItem0.setText("About MyHelloApp");

        VBox.setVgrow(musicPlayer, javafx.scene.layout.Priority.NEVER);
        musicPlayer.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        musicPlayer.setId("HBox");
        musicPlayer.setPrefHeight(48.0);
        musicPlayer.setPrefWidth(900.0);
        musicPlayer.setSpacing(5.0);

        HBox.setHgrow(label, javafx.scene.layout.Priority.ALWAYS);
        label.setMaxHeight(Double.MAX_VALUE);
        label.setMaxWidth(-1.0);
        label.setText("MusicPlayer");
        label.setFont(new Font(11.0));

        HBox.setHgrow(pane, javafx.scene.layout.Priority.ALWAYS);
        pane.setStyle("-fx-border-color: #707070;");
        pane.setPadding(new Insets(3.0));
        musicPlayer.getChildren().contains(mPlayer);
        musicPlayer.getChildren().add(mPlayer.mediaView);
        musicPlayer.getChildren().add(mPlayer.backwardButton);
        musicPlayer.getChildren().add(mPlayer.playButton);
        musicPlayer.getChildren().add(mPlayer.pauseButton);
        musicPlayer.getChildren().add(mPlayer.forwardButton);
        
        VBox.setVgrow(splitPane, javafx.scene.layout.Priority.ALWAYS);
        splitPane.setDividerPositions(0.2505567928730512);
        splitPane.setFocusTraversable(true);
        splitPane.setPrefHeight(-1.0);
        splitPane.setPrefWidth(-1.0);

        anchorPane.setStyle("-fx-background-color: #CED9FA;");

        imageView.setFitHeight(637.0);
        imageView.setFitWidth(242.0);
        imageView.setLayoutX(120.0);
        imageView.setOpacity(0.39);
        imageView.setImage(new Image("file:resources/pics/doctors_tableView.png"));

        AnchorPane.setLeftAnchor(pane0, 3.0);
        pane0.setLayoutX(3.0);
        pane0.setLayoutY(14.0);
        pane0.setPrefHeight(182.0);
        pane0.setPrefWidth(360.0);
        pane0.setStyle("-fx-border-color: #000000; -fx-border-radius: 22;");

        button.setLayoutX(28.0);
        button.setLayoutY(49.0);
        button.setMnemonicParsing(false);
        button.setStyle("-fx-border-color: #707070; -fx-background-color: #FFFFFF; -fx-border-radius: 0;");
        button.setText("Add Doctor");

        button0.setLayoutX(194.0);
        button0.setLayoutY(49.0);
        button0.setMnemonicParsing(false);
        button0.setStyle("-fx-border-color: #707070; -fx-background-color: #FFFFFF; -fx-border-radius: 0;");
        button0.setText("Search Doctor");

        button1.setLayoutX(29.0);
        button1.setLayoutY(90.0);
        button1.setMnemonicParsing(false);
        button1.setStyle("-fx-border-color: #707070; -fx-background-color: #FFFFFF; -fx-border-radius: 0;");
        button1.setText("Edit Doctor");

        button2.setLayoutX(195.0);
        button2.setLayoutY(90.0);
        button2.setMnemonicParsing(false);
        button2.setStyle("-fx-border-color: #707070; -fx-background-color: #FFFFFF; -fx-border-radius: 0;");
        button2.setText("Delete Doctor");

        label0.setLayoutX(29.0);
        label0.setLayoutY(6.0);
        label0.setPrefHeight(32.0);
        label0.setPrefWidth(225.0);
        label0.setText("Doctor's Section");
        label0.setFont(new Font(18.0));

        button3.setLayoutX(29.0);
        button3.setLayoutY(130.0);
        button3.setMnemonicParsing(false);
        button3.setStyle("-fx-border-color: #707070; -fx-background-color: #FFFFFF; -fx-border-radius: 0;");
        button3.setText("Add Appointment");
        pane0.setPadding(new Insets(0.0, 4.0, 0.0, 4.0));

        pane1.setLayoutX(2.0);
        pane1.setLayoutY(237.0);
        pane1.setPrefHeight(182.0);
        pane1.setPrefWidth(360.0);
        pane1.setStyle("-fx-border-color: #000000; -fx-border-radius: 22;");

        button4.setLayoutX(28.0);
        button4.setLayoutY(49.0);
        button4.setMnemonicParsing(false);
        button4.setStyle("-fx-border-color: #707070; -fx-background-color: #FFFFFF; -fx-border-radius: 0;");
        button4.setText("Patients");
        button4.setOnAction(e ->{
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

        button5.setLayoutX(227.0);
        button5.setLayoutY(49.0);
        button5.setMnemonicParsing(false);
        button5.setStyle("-fx-border-color: #707070; -fx-background-color: #FFFFFF; -fx-border-radius: 0;");
        button5.setText("Nurses");

        button6.setLayoutX(27.0);
        button6.setLayoutY(116.0);
        button6.setMnemonicParsing(false);
        button6.setStyle("-fx-border-color: #707070; -fx-background-color: #FFFFFF; -fx-border-radius: 0;");
        button6.setText("Emergency Patients");

        label1.setLayoutX(29.0);
        label1.setLayoutY(6.0);
        label1.setPrefHeight(32.0);
        label1.setPrefWidth(225.0);
        label1.setText("Other Sections");
        label1.setFont(new Font(18.0));
        pane1.setPadding(new Insets(0.0, 4.0, 0.0, 4.0));

        button7.setLayoutX(14.0);
        button7.setLayoutY(596.0);
        button7.setMnemonicParsing(false);
        button7.setPrefHeight(27.0);
        button7.setPrefWidth(79.0);
        button7.setStyle("-fx-border-color: #707070; -fx-background-color: #FFFFFF; -fx-border-radius: 0;");
        button7.setText("Exit");

        button8.setLayoutX(127.0);
        button8.setLayoutY(596.0);
        button8.setMnemonicParsing(false);
        button8.setPrefHeight(27.0);
        button8.setPrefWidth(93.0);
        button8.setStyle("-fx-border-color: #707070; -fx-background-color: #FFFFFF; -fx-border-radius: 0;");
        button8.setText("Import Data");

        button9.setLayoutX(248.0);
        button9.setLayoutY(596.0);
        button9.setMnemonicParsing(false);
        button9.setPrefHeight(27.0);
        button9.setPrefWidth(93.0);
        button9.setStyle("-fx-border-color: #707070; -fx-background-color: #FFFFFF; -fx-border-radius: 0;");
        button9.setText("Export Data");

        scrollPane.setPrefHeight(-1.0);
        scrollPane.setPrefWidth(-1.0);
        scrollPane.setStyle("-fx-background-color: #E8E7E7;");

        tabPane.setStyle("-fx-border-color: #707070; -fx-background-color: #E8E7E7;");

        tab.setText("View Doctors");

        tableView.setEditable(true);
        tableView.setMaxHeight(Double.MAX_VALUE);
        tableView.setMaxWidth(Double.MAX_VALUE);
        tableView.setPrefHeight(535.0);
        tableView.setPrefWidth(1127.0);
        tableView.setStyle("-fx-border-color: #707070;");
        tableView.setTableMenuButtonVisible(true);

        idCol.setPrefWidth(75.0);
        idCol.setStyle("fx-background-color: #FFFFFF;");
        idCol.setText("ID");

        fnCol.setPrefWidth(75.0);
        fnCol.setText("First Name");

        lnCol.setPrefWidth(75.0);
        lnCol.setText("Last Name");

        genderCol.setPrefWidth(75.0);
        genderCol.setText("Gender");

        ageCol.setPrefWidth(75.0);
        ageCol.setText("Age");

        specCol.setPrefWidth(75.0);
        specCol.setText("Speciality");

        shiftCol.setPrefWidth(75.0);
        shiftCol.setText("Shift");

        DOHCol.setPrefWidth(75.0);
        DOHCol.setText("Date Of Hire");

        salaryCol.setPrefWidth(75.0);
        salaryCol.setText("Salary");

        appCol.setPrefWidth(75.0);
        appCol.setText("Appointment");

        avaCol.setPrefWidth(75.0);
        avaCol.setText("Avaliability");

        NOPCol.setPrefWidth(75.0);
        NOPCol.setText("Number Of Patients");

        emailCol.setPrefWidth(75.0);
        emailCol.setText("Email");

        pnCol.setPrefWidth(75.0);
        pnCol.setText("Phone Number");

        addressCol.setPrefWidth(75.0);
        addressCol.setText("Address");
        tab.setContent(tableView);

        tab0.setText("Appointments");

        tableView0.setEditable(true);
        tableView0.setMaxHeight(Double.MAX_VALUE);
        tableView0.setMaxWidth(Double.MAX_VALUE);
        tableView0.setTableMenuButtonVisible(true);

        idCol1.setPrefWidth(75.0);
        idCol1.setText("ID");

        fnCol1.setPrefWidth(75.0);
        fnCol1.setText("Doctor");

        lnCol1.setPrefWidth(75.0);
        lnCol1.setText("Patient");

        genderCol1.setPrefWidth(75.0);
        genderCol1.setText("Date");

        ageCol1.setPrefWidth(75.0);
        ageCol1.setText("Room");

        tab0.setContent(tableView0);
        scrollPane.setContent(tabPane);

        menu.getItems().add(menuItem);
        menuBar.getMenus().add(menu);
        menu0.getItems().add(menuItem0);
        menuBar.getMenus().add(menu0);
        getChildren().add(menuBar);
        musicPlayer.getChildren().add(label);
        musicPlayer.getChildren().add(pane);
        getChildren().add(musicPlayer);
        anchorPane.getChildren().add(imageView);
        pane0.getChildren().add(button);
        pane0.getChildren().add(button0);
        pane0.getChildren().add(button1);
        pane0.getChildren().add(button2);
        pane0.getChildren().add(label0);
        pane0.getChildren().add(button3);
        anchorPane.getChildren().add(pane0);
        pane1.getChildren().add(button4);
        pane1.getChildren().add(button5);
        pane1.getChildren().add(button6);
        pane1.getChildren().add(label1);
        anchorPane.getChildren().add(pane1);
        anchorPane.getChildren().add(button7);
        anchorPane.getChildren().add(button8);
        anchorPane.getChildren().add(button9);
        splitPane.getItems().add(anchorPane);
        tableView.getColumns().add(idCol);
        tableView.getColumns().add(fnCol);
        tableView.getColumns().add(lnCol);
        tableView.getColumns().add(genderCol);
        tableView.getColumns().add(ageCol);
        tableView.getColumns().add(specCol);
        tableView.getColumns().add(shiftCol);
        tableView.getColumns().add(DOHCol);
        tableView.getColumns().add(salaryCol);
        tableView.getColumns().add(appCol);
        tableView.getColumns().add(avaCol);
        tableView.getColumns().add(NOPCol);
        tableView.getColumns().add(emailCol);
        tableView.getColumns().add(pnCol);
        tableView.getColumns().add(addressCol);
        tabPane.getTabs().add(tab);
        tableView0.getColumns().add(idCol1);
        tableView0.getColumns().add(fnCol1);
        tableView0.getColumns().add(lnCol1);
        tableView0.getColumns().add(genderCol1);
        tableView0.getColumns().add(ageCol1);
        
        tabPane.getTabs().add(tab0);
        splitPane.getItems().add(scrollPane);
        getChildren().add(splitPane);

    }
}
