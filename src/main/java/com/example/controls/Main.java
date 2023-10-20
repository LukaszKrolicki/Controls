package com.example.controls;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.Observable;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.util.Callback;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //Label Control example
//        VBox root = new VBox();
//        root.setAlignment(Pos.CENTER);
//        root.setSpacing(10);
//
//        Label label = new Label("This is label");
//        Rectangle rectangle = new Rectangle(20,20, Color.RED);
//        label.setGraphic(rectangle);
//        label.setUnderline(true);
//        label.setFont(Font.font("Aerial", FontWeight.BOLD,18));
//        label.setTextFill(Color.BLUE);
//
//        root.getChildren().addAll(label);
//        Scene scene = new Scene(root,500,500);
//        stage.setScene(scene);
//        stage.show();



        //Button Control example
//        VBox root = new VBox();
//        root.setAlignment(Pos.CENTER);
//        root.setSpacing(10);
//        Button button1 = new Button("Click1");
//        Button button2 = new Button("Click2");
//        Rectangle rectangle = new Rectangle(20,20,Color.RED);
//        button1.setGraphic(rectangle);
//        button1.setCancelButton(true);//when esc key pressed
//
//        button1.setOnAction(e->{
//            System.out.println("Press"); //it will respond also to esc key press
//        });
//
//        root.getChildren().addAll(button2,button1);
//        Scene scene = new Scene(root,500,500);
//        stage.setScene(scene);
//        stage.show();




        //HyperLink control example
//        BorderPane root = new BorderPane();
//
//        HBox linksLayout = new HBox();
//        linksLayout.setAlignment(Pos.CENTER);
//        Hyperlink link1 = new Hyperlink("Google");
//        Hyperlink link2 = new Hyperlink("Youtube");
//
//        WebView webView = new WebView();
//
//        link1.setOnAction(actionEvent->{
//            webView.getEngine().load("https://www.google.com");
//        });
//
//        link2.setOnAction(actionEvent->{
//            webView.getEngine().load("https://www.youtube.com");
//        });
//
//        linksLayout.getChildren().addAll(link1,link2);
//        root.setTop(linksLayout);
//        root.setCenter(webView);
//        Scene scene = new Scene(root,500,500);
//        stage.setScene(scene);
//        stage.show();



        //Menu button controls
//        VBox root = new VBox();
//        root.setAlignment(Pos.CENTER);
//        root.setSpacing(10);
//        MenuButton sites = new MenuButton("Sites");
//        MenuItem google = new MenuItem("Google");
//        MenuItem youtube = new MenuItem("Youtube");
//        google.setOnAction(e->sites.setText(google.getText()));
//        youtube.setOnAction(e->System.out.println("Youtube visit"));
//        sites.getItems().addAll(google,youtube);
//        root.getChildren().addAll(sites);
//        Scene scene = new Scene(root,500,500);
//        stage.setScene(scene);
//        stage.show();

        //Toggle button controls

//        VBox root = new VBox();
//        root.setAlignment(Pos.CENTER);
//        Label label = new Label("Your favourite time of the year?");
//        ToggleButton spring = new ToggleButton("Spring");
//        ToggleButton summer = new ToggleButton("Summer");
//        ToggleButton fall = new ToggleButton("Fall");
//        ToggleButton winter = new ToggleButton("Winter");
//        ToggleGroup seasons = new ToggleGroup();
//        seasons.selectedToggleProperty().addListener((observableValue,toggle,t1)-> {
//            String selectedText = ((Labeled) t1).getText();
//            label.setText("Your selection is: "+selectedText);
//        });
//        seasons.getToggles().addAll(spring,summer,fall,winter);
//        HBox seasonLayout = new HBox();
//        seasonLayout.setAlignment(Pos.CENTER);
//        seasonLayout.setSpacing(5);
//        seasonLayout.getChildren().addAll(spring,summer,fall,winter);
//        root.getChildren().addAll(label,seasonLayout);
//        Scene scene = new Scene(root,500,500);
//        stage.setScene(scene);
//        stage.show();




        //Radio Button example
//        VBox root = new VBox();
//        root.setAlignment(Pos.CENTER);
//        root.setSpacing(10);
//        RadioButton spring = new RadioButton("Spring");
//        RadioButton summer = new RadioButton("Summer");
//        RadioButton fall = new RadioButton("Fall");
//        RadioButton winter = new RadioButton("Winter");
//        ToggleGroup group = new ToggleGroup();
//        group.getToggles().addAll(spring,summer,fall,winter);
//        group.selectedToggleProperty().addListener(this::changed);
//        root.getChildren().addAll(userSelection,spring,summer,fall,winter);
//        Scene scene = new Scene(root,500,500);
//        stage.setScene(scene);
//        stage.show();



        //Checkbox Control
//        VBox root = new VBox();
//        root.setAlignment(Pos.CENTER);
//        root.setSpacing(10);
//        Label question = new Label("Are you in favor: ");
//        checkBox.setAllowIndeterminate(true);
//        checkBox.selectedProperty().addListener(this::answered);
//        checkBox.indeterminateProperty().addListener(this::answered);
//
//        root.getChildren().addAll(answer, question,checkBox);
//        Scene scene = new Scene(root,500,500);
//        stage.setScene(scene);
//        stage.show();



        //Choice Box Control
//        VBox root = new VBox();
//        root.setAlignment(Pos.CENTER);
//        root.setSpacing(10);
//        Label label = new Label("Your direction: ");
//
//        ChoiceBox<String> box = new ChoiceBox();
//        ObservableList<String> directionList = FXCollections.observableArrayList("North","South","East","West");
//        box.getItems().addAll(directionList);
//        box.getSelectionModel().select(0); //at start choose first option
//        box.getSelectionModel().select("Something");
//        box.getSelectionModel().selectedItemProperty().addListener(observable -> {
//            label.setText("Your direction: "+ box.getSelectionModel().getSelectedItem());
//        });
//
//        root.getChildren().addAll(label,box);
//        Scene scene = new Scene(root,500,500);
//        stage.setScene(scene);
//        stage.show();



        //Combo box Control
//        VBox root = new VBox();
//        root.setAlignment(Pos.CENTER);
//        root.setSpacing(10);
//        Label label = new Label("Selected Name: ");
//        ComboBox<String> names = new ComboBox<>();
//        names.getItems().addAll("patric", "patryk", "papryczek");
//        names.setCellFactory(listView->new ShapeNameCell());
//        names.setButtonCell(new ShapeNameCell());
//        root.getChildren().addAll(label,names);
//        Scene scene = new Scene(root,500,500);
//        stage.setScene(scene);
//        stage.show();



        //Color Picker control
//        VBox root = new VBox();
//        root.setAlignment(Pos.CENTER);
//        root.setSpacing(10);
//        ColorPicker colorPicker = new ColorPicker();
//        colorPicker.setOnAction(actionEvent -> root.setBackground(
//                new Background( new BackgroundFill(colorPicker.getValue(), CornerRadii.EMPTY, Insets.EMPTY))));
//        root.getChildren().addAll(colorPicker);
//        Scene scene = new Scene(root,500,500);
//        stage.setScene(scene);
//        stage.show();



        //DatePicker control
//        VBox root = new VBox();
//        root.setAlignment(Pos.CENTER);
//        root.setSpacing(10);
//        Label label = new Label("Date");
//        DatePicker datePicker = new DatePicker();
//        datePicker.setEditable(false);//cant write with keyboard
//        datePicker.setOnAction(a->label.setText(datePicker.getValue().toString()));
//        root.getChildren().addAll(label,datePicker);
//        Scene scene = new Scene(root,500,500);
//        stage.setScene(scene);
//        stage.show();



        //Slider control
//        VBox root = new VBox();
//        root.setAlignment(Pos.CENTER);
//        root.setSpacing(10);
//        Slider red = new Slider(0,255,0);
//        Slider blue = new Slider(0,255,0);
//        Slider green = new Slider(0,255,0);
//        Slider[] sliders = {red,green,blue};
//
//        for(Slider slider: sliders){
//            slider.setShowTickMarks(true);
//            slider.setBlockIncrement(5);
//            slider.valueProperty().addListener(o->{
//                int redColor=(int)red.getValue();
//                int greenColor=(int)green.getValue();
//                int blueColor=(int)blue.getValue();
//                root.setStyle("-fx-background-color: rgb("+redColor+","+greenColor+","+blueColor+");");
//            });
//        }
//        root.getChildren().addAll(red,green,blue);
//        Scene scene = new Scene(root,500,500);
//        stage.setScene(scene);
//        stage.show();



        //Menu Control
//        BorderPane root = new BorderPane();
//
//        MenuBar menuBar = new MenuBar();
//        Menu file = new Menu("File");
//        MenuItem save = new MenuItem("Save");
//        MenuItem exit = new MenuItem("Exit");
//        exit.setOnAction(actionEvent -> {
//            Platform.exit();
//        });
//        file.getItems().addAll(save,exit);
//
//        Menu edit = new Menu("Edit");
//        RadioMenuItem option = new RadioMenuItem("Options");//Radio button
//
//        Menu prefs = new Menu("Preferences");//menu in menu
//        MenuItem prefOne= new MenuItem("1");
//        MenuItem prefTwo=new MenuItem("2");
//        prefs.getItems().addAll(prefOne,prefTwo);
//
//        edit.getItems().addAll(option, new SeparatorMenuItem(),prefs);
//        menuBar.getMenus().addAll(file,edit);
//        root.setTop(menuBar);
//
//        Scene scene = new Scene(root,500,500);
//        stage.setScene(scene);
//        stage.show();




        //TabPane Control
        BorderPane root = new BorderPane();
        TabPane pane = new TabPane();
        Tab one = new Tab("One");
        Tab two = new Tab("Two");

        //setting properties
        two.setClosable(false);
        VBox contentOne = new VBox();
        contentOne.setAlignment(Pos.CENTER);
        contentOne.getChildren().addAll(new Label("Content for tab one"));
        VBox contentTwo = new VBox();
        contentTwo.setAlignment(Pos.CENTER);
        contentTwo.getChildren().addAll(new Button("Content for tab two"));
        //setting content of tabs
        one.setContent(contentOne);
        two.setContent(contentTwo);

        pane.getTabs().addAll(one,two);
        root.setCenter(pane);
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.show();
    }

    //for toggle button control
    Boolean isLightOn;

    //For radio button
    Label userSelection;

    //For checkbox
    Label answer;
    CheckBox checkBox;
    @Override
    public void init(){
        answer = new Label("Your answer is: none");
        checkBox = new CheckBox("Choice");
        userSelection=new Label("Your selection None");
        isLightOn = false;
    }

    //for radio button
    public void changed(ObservableValue<?extends Toggle> observableValue, Toggle oldBtn, Toggle newBtn){
        String selectedLabel="None";
        if(newBtn!=null){
            selectedLabel=((Labeled)newBtn).getText();

        }
        userSelection.setText("Your Selection: "+selectedLabel);
    }

    //for checkbox
    public void answered(ObservableValue<?extends Boolean> observableValue, Boolean oldVal, Boolean newVal){
        String choice=null;
        if(checkBox.isIndeterminate()){
            choice = "Neutral";
        } else if (checkBox.isSelected()) {
            choice = "Agree";
        }
        else{
            choice ="Disagree";
        }
        answer.setText("Your answer is: "+choice);
    }

    public static void main(String[] args) {
        launch();
    }
}
