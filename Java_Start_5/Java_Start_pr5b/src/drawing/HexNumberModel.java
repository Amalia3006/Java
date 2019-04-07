package drawing;

import javax.swing.*;

public class HexNumberModel extends AbstractSpinnerModel {
    private int value, minimum, maximum, stepSize;

    public HexNumberModel(int value, int minimum, int maximum, int stepSize) {
        this.value = value;
        this.minimum = minimum;
        this.maximum = maximum;
        this.stepSize = stepSize;
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public void setValue(Object value) {
        this.value = (int) value;
        fireStateChanged();
    }

    @Override
    public Object getNextValue() {
        return isInBounds(value + stepSize);
    }

    @Override
    public Object getPreviousValue() {
        return isInBounds(value - stepSize);
    }

    private Object isInBounds(int value) {
        if(value < minimum || value > maximum)
            return null;

        return value;
    }
}
