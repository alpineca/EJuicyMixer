package com.alpineca.liquidmixer;

import controllers.BaseMixerController;
import controllers.QuickMixerController;
import controllers.MyRecipesController;
import controllers.OptionsController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import processors.BaseLiquidProcessor;
import utils.AppControl;

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
    private QuickMixerController liquidMixerController;

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
        AppControl.exitApplication();
    }

    @FXML
    private void handleButtonClicks(ActionEvent mouseEvent) {

        if(mouseEvent.getSource() == buttonExit){
            AppControl.exitApplication();
        }

        if(mouseEvent.getSource() == buttonLiquidMixer){
            liquidMixerController.showPanel();
            pressButton(buttonLiquidMixer);
        }

        if(mouseEvent.getSource() == buttonBaseMixer){
            baseMixerController.showPanel();
            pressButton(buttonBaseMixer);
        }
        if(mouseEvent.getSource() == buttonOptions){
            optionsController.showPanel();
            pressButton(buttonOptions);
        }
        if(mouseEvent.getSource() == buttonRecipes){
            myRecipesController.showPanel();
            pressButton(buttonRecipes);
        }
    }

    @FXML
    public void minimize_app(MouseEvent event) {
        AppControl.minimizeApplication();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        BaseLiquidProcessor baseLiquidProcessor = BaseLiquidProcessor.getInstance();

        this.loadButtons();
        baseLiquidProcessor.loadAllBases();

        baseMixerController.showPanel();
        pressButton(buttonBaseMixer);

//        VegetableGlycerin testVG = new VegetableGlycerin(252);
//        System.out.println(testVG.getWeigth());

    }

    private void loadButtons(){
        menuButtonsList.add(buttonBaseMixer);
        menuButtonsList.add(buttonExit);
        menuButtonsList.add(buttonOptions);
        menuButtonsList.add(buttonRecipes);
        menuButtonsList.add(buttonLiquidMixer);
    }

    private void pressButton(Button pressedButton){
        pressedButton.getStyleClass().add("menu-button-selected");
        for(Button element : menuButtonsList){
            if(!element.equals(pressedButton)){
                element.getStyleClass().clear();
                element.getStyleClass().add("menu-button");
            }
        }
    }
}
