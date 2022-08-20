package utils;

import javafx.scene.control.TextField;

public class AutoCalculateFields {

    public static void autoFillTo100(TextField focusField, TextField secondField){
        int focusFieldIntValue  = Integer.parseInt(focusField.getText());
        int secondFieldIntValue = Integer.parseInt(secondField.getText());

        if(secondFieldIntValue > 100) focusField.setText("100");
        Integer result = 100 - focusFieldIntValue;
        if(result < 0){
            result = 0;
            focusField.setText("100");
        }
        secondField.setText(result.toString());
    }
    public static void autoFillTo100(TextField focusField, TextField secondField, TextField thirdField){
        Integer focusFieldIntValue      = Integer.parseInt(focusField.getText());
        int focusFieldDevidedValue  = Math.abs(focusFieldIntValue/2);
        Integer secondFieldIntValue     = Integer.parseInt(secondField.getText());
        Integer thirdFieldIntValue      = Integer.parseInt(thirdField.getText());

        if(secondFieldIntValue > thirdFieldIntValue && focusFieldIntValue > 0){
            secondFieldIntValue     -= focusFieldIntValue;
        }
        if(thirdFieldIntValue > secondFieldIntValue && focusFieldIntValue > 0){
            thirdFieldIntValue      -= focusFieldIntValue;
        }
        if(secondFieldIntValue == thirdFieldIntValue && focusFieldIntValue > 0){
            secondFieldIntValue     -= focusFieldDevidedValue;
            thirdFieldIntValue      -= focusFieldDevidedValue;
        }

//        if(secondFieldIntValue == 0 && focusFieldIntValue > 0){
//
//        }
//        if(thirdFieldIntValue == 0 && focusFieldIntValue > 0){
//
//        }
//        if(focusFieldIntValue > 0 && secondFieldIntValue > 0 && thirdFieldIntValue > 0){
//
//        }

//        if(secondFieldIntValue > 100) focusField.setText("100");
//        Integer result = 100 - focusFieldIntValue;
//        if(result < 0){
//            result = 0;
//            focusField.setText("100");
//        }
        secondField.setText(secondFieldIntValue.toString());
        thirdField.setText(thirdFieldIntValue.toString());

    }
}
