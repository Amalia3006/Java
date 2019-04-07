package drawing;

import javax.swing.*;

public class JHexSpinner extends JSpinner {

    public JHexSpinner(int value, int minimum, int maximum, int stepSize) {
        super(new HexNumberModel(value, minimum, maximum, stepSize));

        JSpinner.DefaultEditor editor = (JSpinner.DefaultEditor) this.getEditor();
        JFormattedTextField formattedTextField = editor.getTextField();
        formattedTextField.setFormatterFactory(new HexFormatterFactory());
        formattedTextField.setEditable(true);
    }


}
