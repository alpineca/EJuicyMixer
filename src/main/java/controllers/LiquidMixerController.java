package controllers;

import Interfaces.ContentPanel;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;

public class LiquidMixerController implements Initializable, ContentPanel {
    @FXML
    private GridPane liquidMixerPane;

    @FXML
//    private StackPane liquidMixerStack;


    @Override
    public void showPanel() {
        liquidMixerPane.toFront();
    }

    @Override
    public void hidePanel() {
        liquidMixerPane.toBack();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
