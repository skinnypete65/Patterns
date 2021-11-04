package abstractfactory.factories;

import abstractfactory.buttons.Button;
import abstractfactory.checkboxes.CheckBox;


public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
