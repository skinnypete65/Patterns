package abstractfactory.checkboxes;

public class MaxCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
