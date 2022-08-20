package utils;

import com.alpineca.liquidmixer.Application;
import processors.BaseLiquidProcessor;

public class AppControl {

    public static void minimizeApplication(){
        Application.stage.setIconified(true);
    }
    public static void exitApplication(){
        BaseLiquidProcessor baseLiquidProcessor = BaseLiquidProcessor.getInstance();


        baseLiquidProcessor.saveAllBases();

        System.exit(0);
    }
}
