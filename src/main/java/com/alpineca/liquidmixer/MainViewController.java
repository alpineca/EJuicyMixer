package com.alpineca.liquidmixer;

import controllers.BaseMixerController;
import controllers.LiquidMixerController;
import controllers.MyRecipesController;
import controllers.OptionsController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import models.VegetableGlycerin;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {
    @FXML
    private BaseMixerController baseMixerController;

    @FXML
    private OptionsController optionsController;

    @FXML
    private MyRecipesController myRecipesController;

    @FXML
    private LiquidMixerController liquidMixerController;

    @FXML
    private Button buttonBaseMixer;

    @FXML
    private Button buttonExit;

    @FXML
    private Button buttonLiquidMixer;

    @FXML
    private Button buttonOptions;

    @FXML
    private Button buttonRecipes;

    private List<Button> menuButtonsList = new ArrayList<>();
    @FXML
    void close_app(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    private void handleButtonClicks(ActionEvent mouseEvent) {

        if(mouseEvent.getSource() == buttonExit){
            System.exit(0);
        }

        if(mouseEvent.getSource() == buttonLiquidMixer){
            liquidMixerController.showPanel();
            buttonLiquidMixer.getStyleClass().add("menu-button-selected");
            pressButton(buttonLiquidMixer);
        }

        if(mouseEvent.getSource() == buttonBaseMixer){
            baseMixerController.showPanel();
            buttonBaseMixer.getStyleClass().add("menu-button-selected");
            pressButton(buttonBaseMixer);
        }
        if(mouseEvent.getSource() == buttonOptions){
            optionsController.showPanel();
            buttonOptions.getStyleClass().add("menu-button-selected");
            pressButton(buttonOptions);
        }
        if(mouseEvent.getSource() == buttonRecipes){
            myRecipesController.showPanel();
            buttonRecipes.getStyleClass().add("menu-button-selected");
            pressButton(buttonRecipes);
        }
    }

    @FXML
    public void minimize_app(MouseEvent event) {
        Application.stage.setIconified(true);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.loadButtons();

        baseMixerController.showPanel();

        VegetableGlycerin testVG = new VegetableGlycerin(252);
        System.out.println(testVG.getWeigth());

    }

    private void loadButtons(){
        menuButtonsList.add(buttonBaseMixer);
        menuButtonsList.add(buttonExit);
        menuButtonsList.add(buttonOptions);
        menuButtonsList.add(buttonRecipes);
        menuButtonsList.add(buttonLiquidMixer);
    }

    private void pressButton(Button pressedButton){
        for(Button element : menuButtonsList){
            if(!element.equals(pressedButton)){
                element.getStyleClass().clear();
                element.getStyleClass().add("menu-button");
            }
        }
    }
}
