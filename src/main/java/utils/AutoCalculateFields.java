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
        int focusFieldIntValue  = Integer.parseInt(focusField.getText());
        int secondFieldIntValue = Integer.parseInt(secondField.getText());
        int thirdFieldIntValue  = Integer.parseInt(thirdField.getText());

        if(secondFieldIntValue > 100) focusField.setText("100");
        Integer result = 100 - focusFieldIntValue;
        if(result < 0){
            result = 0;
            focusField.setText("100");
        }
        secondField.setText(result.toString());

    }
}
