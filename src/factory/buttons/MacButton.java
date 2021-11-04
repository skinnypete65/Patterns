package factory.buttons;

public class MacButton implements Button{
    @Override
    public void render() {
        System.out.println("rendering");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("This is mac button!");
    }
}
