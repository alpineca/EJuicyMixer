package controllers;

import Interfaces.ContentPanel;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class OptionsController implements Initializable, ContentPanel {

    @FXML
    private GridPane optionsPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @Override
    public void showPanel() {
        optionsPane.toFront();
    }

    @Override
    public void hidePanel() {
        optionsPane.toBack();
    }
}
