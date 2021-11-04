package abstractfactory.factories;

import abstractfactory.buttons.Button;
import abstractfactory.buttons.WindowsButton;
import abstractfactory.checkboxes.CheckBox;
import abstractfactory.checkboxes.WindowsCheckBox;


public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
