package utils;

import javafx.scene.control.TextField;

import java.util.regex.Pattern;

public class FieldIntChecker {

    private static Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

    public static void checkField(TextField field){

        if(!isNumeric(field.getText())){
            field.setText("0");
        }

        if(Integer.parseInt(field.getText()) < 0){
            field.setText("0");
        }

    }

    private static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }
}
