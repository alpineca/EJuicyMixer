package com.alpineca.liquidmixer;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Application extends javafx.application.Application {

    public static Stage stage = null;
    private double gapX = 0, gapY = 0;
    @Override
    public void start(Stage primaryStage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/com/alpineca/liquidmixer/fxml/MainView.fxml"));
        root.setOnMouseDragged(e -> this.dragStage(e, primaryStage));
        root.setOnMouseMoved(e -> this.calculateGap(e, primaryStage));
        Scene scene = new Scene(root);
//        var buttonLiquidMixer = new Button();
        primaryStage.setTitle("Hello!");
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(scene);
        this.stage = primaryStage;
//        scene.getStylesheets().add(String.valueOf(getClass().getResource("MainStyle.css")));
        primaryStage.show();
    }

    public static void main(String[] args) {


        launch();
    }

    private void calculateGap(MouseEvent event, Stage stage) {
        gapX = event.getScreenX() - stage.getX();
        gapY = event.getScreenY() - stage.getY();
    }

    private void dragStage(MouseEvent event, Stage stage) {
        stage.setX(event.getScreenX() - gapX);
        stage.setY(event.getScreenY() - gapY);
    }
}