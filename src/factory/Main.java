package factory;

import factory.dialogs.Dialog;
import factory.dialogs.HtmlDialog;
import factory.dialogs.MacDialog;
import factory.dialogs.WindowsDialog;

import java.util.Scanner;

public class Main {
    private static Dialog dialog;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("OS name: ");
        String name = sc.next();

        configure(name);
        runBusinessLogic();
    }

    static void configure(String name) {
        if (name.equals("windows")){
            dialog = new WindowsDialog();
        }
        else if (name.equals("mac")) {
            dialog = new MacDialog();
        }
        else{
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic(){
        dialog.renderWindow();
    }

}
