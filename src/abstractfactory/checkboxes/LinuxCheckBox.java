package abstractfactory.checkboxes;

public class LinuxCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("You have created LinuxCheckBox");
    }
}
