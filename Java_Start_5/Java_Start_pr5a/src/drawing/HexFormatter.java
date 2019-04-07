package drawing;

import javax.swing.text.DefaultFormatter;
import java.text.ParseException;

public class HexFormatter extends DefaultFormatter {

    public HexFormatter() {
        super();
    }

    @Override
    public Object stringToValue(String string) throws ParseException {
        try {
            return Integer.valueOf(string, 16);
        }
        catch (NumberFormatException e) {
            return 0;
        }
    }

    @Override
    public String valueToString(Object value) throws ParseException {
        try {
            return Integer.toHexString((int) value).toUpperCase();
        }
        catch (NumberFormatException e) {
            return "000000";
        }
    }
}
