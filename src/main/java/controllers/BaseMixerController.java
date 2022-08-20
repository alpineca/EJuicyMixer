package controllers;

import Interfaces.ContentPanel;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import models.BaseLiquid;
import processors.BaseLiquidProcessor;
import utils.AutoCalculateFields;
import utils.FieldIntChecker;

import java.net.URL;
import java.util.ResourceBundle;

import static utils.AutoCalculateFields.autoFillTo100;

public class    BaseMixerController implements Initializable, ContentPanel {

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
    private TextField newRecipeName;

    @FXML
    private Button saveNewRecipe;

    @FXML
    private ComboBox<BaseLiquid> recipesComBox;

    private BaseLiquidProcessor baseLiquidProcessor = BaseLiquidProcessor.getInstance();
//    private BaseLiquid loadedRecipe;

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
        BaseLiquid newBaseLiquid = new BaseLiquid(newRecipeName.getText(), (double) Double.parseDouble(desiredAmmount.getText()));

        if(recipesComBox.getValue() != null && newRecipeName.getText().equals(recipesComBox.getValue().getBaseName())){

            baseLiquidProcessor.updateRecipe(newBaseLiquid);
            getRecipesList(newBaseLiquid);
//            recipesComBox.setValue(newBaseLiquid);

        }
        else{
            baseLiquidProcessor.addNewBase(newBaseLiquid);
            getRecipesList(newBaseLiquid);
//            setLoadedRecipe();
//            recipesComBox.setValue(newBaseLiquid);
        }
//        loadedRecipe = newBaseLiquid;
        setLoadedRecipe(newBaseLiquid);

    }

    @FXML
    public void calculateVGto100(){
        FieldIntChecker.checkField(desiredPg);
        FieldIntChecker.checkField(desiredVg);
        FieldIntChecker.checkField(waterAmmount);

        AutoCalculateFields.autoFillTo100(desiredPg, desiredVg, waterAmmount);
    }
    @FXML
    public void calculatePGto100(){
        FieldIntChecker.checkField(desiredPg);
        FieldIntChecker.checkField(desiredVg);
        FieldIntChecker.checkField(waterAmmount);

        AutoCalculateFields.autoFillTo100(desiredVg, desiredPg, waterAmmount);
    }

    @FXML
    public void calculateWaterTo100(){
        FieldIntChecker.checkField(desiredPg);
        FieldIntChecker.checkField(desiredVg);
        FieldIntChecker.checkField(waterAmmount);

        AutoCalculateFields.autoFillTo100(waterAmmount, desiredVg, desiredPg);
    }

    @FXML
    public void nicBaseCalculatePGField(){
        FieldIntChecker.checkField(baseAmountPg);
        FieldIntChecker.checkField(baseAmountVg);

        AutoCalculateFields.autoFillTo100(baseAmountVg, baseAmountPg);
    }
    @FXML
    public void nicBaseCalculateVGField(){
        FieldIntChecker.checkField(baseAmountPg);
        FieldIntChecker.checkField(baseAmountVg);

        AutoCalculateFields.autoFillTo100(baseAmountPg, baseAmountVg);
    }

//    @FXML
//    public void loadRecipe(ActionEvent event){
//
//
//        loadedRecipe = recipesComBox.getValue();
//        setLoadedRecipe();
//
//    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        getRecipesList();

        recipesComBox.valueProperty().addListener(new ChangeListener<BaseLiquid>() {
            @Override
            public void changed(ObservableValue<? extends BaseLiquid> observableValue, BaseLiquid baseLiquid, BaseLiquid t1) {
                setLoadedRecipe(observableValue.getValue());
                System.out.println("***** RECIPE SET *****");
                System.out.println(observableValue.getValue());
                System.out.println(" ");

            }

        });

    }

    @Override
    public void showPanel() {
        baseMixerPane.toFront();
    }

    @Override
    public void hidePanel() {
        baseMixerPane.toBack();
    }

    private void getRecipesList(){

        ObservableList<BaseLiquid> baseLiquidObservableList = FXCollections.observableList(baseLiquidProcessor.getBasesList());
        recipesComBox.setItems(baseLiquidObservableList);
    }
    private void getRecipesList(BaseLiquid updatedBase){

        ObservableList<BaseLiquid> baseLiquidObservableList = FXCollections.observableList(baseLiquidProcessor.getBasesList());
        recipesComBox.setItems(baseLiquidObservableList);
        recipesComBox.setValue(updatedBase);

    }

    private void setLoadedRecipe(BaseLiquid recipeToSet){
        try {
            newRecipeName.setText(recipeToSet.getBaseName());
            desiredAmmount.setText(String.valueOf(recipeToSet.getDesiredAmmount()));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
