package drawing;

import javax.swing.*;
import javax.swing.text.DefaultFormatterFactory;

public class HexFormatterFactory extends DefaultFormatterFactory {
    @Override
    public JFormattedTextField.AbstractFormatter getDefaultFormatter() {
        return new HexFormatter();
    }
}
