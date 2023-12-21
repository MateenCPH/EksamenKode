package Task4;

public class Loops {
    TextUI ui = new TextUI();
    public void drawRightTriangle(int i) {
        for (int j = 0; j < i; j++) {
            System.out.print("*");
            for (int k = 0; k < j; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void drawLeftTriangle(int i) {
        for (int j = 0; j <= i; j++) {

            // Print mellemrum før stjernerne
            for (int k = i; k > j; k--) {
                System.out.print(" ");
            }

            // Print stjerner
            for (int k = 0; k < j; k++) {
                System.out.print("*");
            }

            // Ny linje efter hver række
            System.out.println();
        }
    }
    public void drawTriangle(){
        int numberChoice = ui.getNumericInput("Type a number which indicates the size of your triangle");
        String triangleChoice = ui.getInput("Choose which direction the triangle should face\n[1] Right\n[2] Left");
        if (triangleChoice.equals("1") || triangleChoice.equalsIgnoreCase("right")){
            drawRightTriangle(numberChoice);
        } else if (triangleChoice.equals("2") || triangleChoice.equalsIgnoreCase("left")){
            drawLeftTriangle(numberChoice);
        }else{
            ui.displayMsg("Please enter a valid option");
            drawTriangle();
        }
        tryAgain();
    }

    public void tryAgain(){
        String choice = ui.getInput("Do you want to try again Y/N?");
        if(choice.equalsIgnoreCase("Y")){
            drawTriangle();
        }else if (choice.equalsIgnoreCase("N")){
            System.out.println("Okay bye bye");
        } else {
            System.out.println("Please enter a valid option");
            tryAgain();
        }
    }
}
