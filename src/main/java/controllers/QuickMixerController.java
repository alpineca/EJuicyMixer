package controllers;

import Interfaces.ContentPanel;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import models.QuickMixerInput;
import models.QuickMixerRecipe;
import processors.QuickMixerProcessor;

import java.net.URL;
import java.util.ResourceBundle;

public class QuickMixerController implements Initializable, ContentPanel {

    @FXML
    private GridPane liquidMixerPane;
    @FXML
    private TextField basePg;
    @FXML
    private Label baseTotalGr;
    @FXML
    private Label baseTotalMl;
    @FXML
    private TextField baseVg;
    @FXML
    private TextField delutant;
    @FXML
    private Label delutantGr;
    @FXML
    private Label delutantMl;
    @FXML
    private TextField flavourOne;
    @FXML
    private Label flavourOneGr;
    @FXML
    private Label flavourOneMl;
    @FXML
    private TextField flavourThree;
    @FXML
    private Label flavourThreeGr;
    @FXML
    private Label flavourThreeMl;
    @FXML
    private TextField flavourTwo;
    @FXML
    private Label flavourTwoGr;
    @FXML
    private Label flavourTwoMl;
    @FXML
    private Label otherGr;
    @FXML
    private Label otherMl;
    @FXML
    private TextField otherSubstance;
    @FXML
    private Button saveNewRecipe;
    @FXML
    private Button saveNewRecipe1;
    @FXML
    private TextField targetAmount;
    @FXML
    private Label targetAmountGr;
    @FXML
    private Label targetAmountMl;
    @FXML
    private TextField delutantName;
    @FXML
    private TextField flavourOneName;
    @FXML
    private TextField flavourTwoName;
    @FXML
    private TextField flavourThreeName;
    @FXML
    private TextField otherSubstanceName;
    @FXML
    private Label delutantNameLabel;
    @FXML
    private Label flavourOneNameLabel;
    @FXML
    private Label flavourTwoNameLabel;
    @FXML
    private Label flavourThreeNameLabel;
    @FXML
    private Label otherSubstanceNameLabel;

    @FXML
    private void calculateRecipe(){
        //Create input object
        QuickMixerInput inputValues = new QuickMixerInput();
        getInputValues(inputValues);

        //Get output values from processor
        QuickMixerRecipe recipe = new QuickMixerRecipe();
        recipe = QuickMixerProcessor.createRecipe(inputValues);

        //Set values in table
        setRecipeValues(recipe);

    }


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

    private void getInputValues(QuickMixerInput input){

        input.setTargetAmount(getDoubleValue(targetAmount.getText()));
        input.setBasePg(getDoubleValue(basePg.getText()));
        input.setBaseVg(getDoubleValue(baseVg.getText()));

        input.setDelutantName(delutantName.getText());
        input.setDelutant(getDoubleValue(delutant.getText()));

        input.setFlavourOneName(flavourOneName.getText());
        input.setFlavourOne(getDoubleValue(flavourOne.getText()));

        input.setFlavourTwoName(flavourTwoName.getText());
        input.setFlavourTwo(getDoubleValue(flavourTwo.getText()));

        input.setFlavourThreeName(flavourThreeName.getText());
        input.setFlavourThree(getDoubleValue(flavourThree.getText()));

        input.setOtherSubstanceName(otherSubstanceName.getText());
        input.setOther(getDoubleValue(otherSubstance.getText()));
    }

    private void setRecipeValues(QuickMixerRecipe recipe){
        targetAmountMl.setText(recipe.getTotalAmountMl());
        targetAmountGr.setText(recipe.getTotalAmountGr());
        baseTotalMl.setText(recipe.getBaseTotalMl());
        baseTotalGr.setText(recipe.getBaseTotalGr());
        delutantNameLabel.setText(delutantName.getText());
        delutantMl.setText(recipe.getDelutantMl());
        delutantGr.setText(recipe.getDelutantGr());
        flavourOneNameLabel.setText(flavourOneName.getText());
        flavourOneMl.setText(recipe.getFlavourOneMl());
        flavourOneGr.setText(recipe.getFlavourOneGr());
        flavourTwoNameLabel.setText(flavourTwoName.getText());
        flavourTwoMl.setText(recipe.getFlavourTwoMl());
        flavourTwoGr.setText(recipe.getFlavourTwoGr());
        flavourThreeNameLabel.setText(flavourThreeName.getText());
        flavourThreeMl.setText(recipe.getFlavourThreeMl());
        flavourThreeGr.setText(recipe.getFlavourThreeGr());
        otherSubstanceNameLabel.setText(otherSubstanceName.getText());
        otherMl.setText(recipe.getOtherMl());
        otherGr.setText(recipe.getOtherGr());
    }

    private double getDoubleValue(String fieldValue){
        if(fieldValue.equals("")){
            return 0.00;
        }
        return Double.valueOf(fieldValue);
    }
}
