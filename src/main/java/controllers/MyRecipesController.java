package controllers;

import Interfaces.ContentPanel;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;

public class MyRecipesController implements Initializable, ContentPanel {

    @FXML
    private GridPane myRecipesPane;

    @FXML
    private StackPane myRecipesStack;


    @Override
    public void showPanel() {
        myRecipesStack.toFront();
    }

    @Override
    public void hidePanel() {
        myRecipesStack.toBack();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
