package controllers;

import Interfaces.ContentPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;

public class BaseMixerController implements Initializable, ContentPanel {

    @FXML
    private TextField baseAmountPg;

    @FXML
    private TextField baseAmountVg;

    @FXML
    private GridPane baseMixerPane;

    @FXML
    private StackPane baseMixerStack;

    @FXML
    private TextField baseNicStrength;

    @FXML
    private Button calculate;

    @FXML
    private TextField desiredAmmount;

    @FXML
    private TextField desiredPg;

    @FXML
    private TextField desiredStrength;

    @FXML
    private TextField desiredVg;

    @FXML
    private Label resultBaseGr;

    @FXML
    private Label resultBaseMl;

    @FXML
    private Label resultPgGr;

    @FXML
    private Label resultPgMl;

    @FXML
    private Label resultVgGr;

    @FXML
    private Label resultVgMl;

    @FXML
    private TextField waterAmmount;


    @FXML
    private Button save;

    @FXML
    public void calculateELiquid(ActionEvent event) {
        resultBaseMl.setText(desiredAmmount.getText());
        resultPgMl.setText(desiredPg.getText());
        resultVgMl.setText(desiredVg.getText());

        //Изчисляване на процента никотин


        //Изчисляване на Глицерин и Пропилен Гликола

    }

    @FXML
    public void saveBaseLiquid(){

    }

    @FXML
    public void calculateVGto100(){
        int intPGValue = Integer.parseInt(desiredPg.getText());
        int intVGValue = Integer.parseInt(desiredVg.getText());
//        int totalValue = intPGValue + intVGValue;

        if(intPGValue > 100) desiredPg.setText("100");
        Integer result = 100 - intPGValue;
        desiredVg.setText(result.toString());
    }
    @FXML
    public void calculatePGto100(){

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @Override
    public void showPanel() {
        baseMixerPane.toFront();
    }

    @Override
    public void hidePanel() {
        baseMixerPane.toBack();
    }
}
