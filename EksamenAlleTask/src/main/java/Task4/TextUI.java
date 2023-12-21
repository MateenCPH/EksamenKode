package Task4;

import java.util.ArrayList;
import java.util.Scanner;


public class TextUI {
    private Scanner scan = new Scanner(System.in);

    public String getInput(String msg){
        displayMsg(msg);
        return scan.nextLine();
    }

    public void displayMsg(String msg){
        System.out.println(msg);
    }

    public void displayMsg(ArrayList<String> list){
        System.out.println(list);
    }

    public int getNumericInput(String msg) {
        displayMsg(msg);
        String input = scan.nextLine();
        int num = 0;
        try {
            num = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            displayMsg("This was not a number, " + e.getMessage());
            num = getNumericInput(msg);
        }
        return num;
    }


}
