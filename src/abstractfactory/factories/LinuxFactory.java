package abstractfactory.factories;

import abstractfactory.buttons.Button;
import abstractfactory.buttons.LinuxButton;
import abstractfactory.checkboxes.CheckBox;
import abstractfactory.checkboxes.LinuxCheckBox;

public class LinuxFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LinuxCheckBox();
    }
}
