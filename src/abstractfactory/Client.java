package abstractfactory;

import abstractfactory.factories.GUIFactory;
import abstractfactory.factories.LinuxFactory;
import abstractfactory.factories.MacFactory;
import abstractfactory.factories.WindowsFactory;

import java.util.Scanner;

public class Client {

    private static Application configureApplication(String osName){
        Application app;
        GUIFactory factory;

        if (osName.equals("windows")){
            factory = new WindowsFactory();
        }
        else if (osName.equals("linux")){
            factory = new LinuxFactory();
        }
        else {
            factory = new MacFactory();
        }

        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("OS name: ");
        String osName = sc.next();
        Application app = configureApplication(osName);
        app.paint();

        System.out.println();
        app.getButton().paint();
        app.getCheckBox().paint();
    }
}
