package abstractfactory;


import abstractfactory.buttons.Button;
import abstractfactory.checkboxes.CheckBox;
import abstractfactory.factories.GUIFactory;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void paint(){
        button.paint();
        checkBox.paint();
    }

    public Button getButton() {
        return button;
    }

    public CheckBox getCheckBox() {
        return checkBox;
    }
}
