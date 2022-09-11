import javafx.scene.control.TextField;
import org.junit.Test;
import utils.AutoCalculateFields;
import static org.junit.Assert.*;

public class AutoCalculateFieldsTest{

    @Test
    public void oneIsZeroOtherIs100(){
        TextField field1 = new TextField();
        TextField field2 = new TextField();

        field1.setText("0");
        field2.setText("0");

        AutoCalculateFields.autoFillTo100(field1, field2);

        assertEquals(field2.getText(), "90");


    }

}