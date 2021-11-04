package abstractfactory.factories;

import abstractfactory.buttons.Button;
import abstractfactory.buttons.MacButton;
import abstractfactory.checkboxes.CheckBox;
import abstractfactory.checkboxes.MaxCheckBox;


public class MacFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MaxCheckBox();
    }
}
