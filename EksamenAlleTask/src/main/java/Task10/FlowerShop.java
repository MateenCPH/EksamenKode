package Task10;

import java.util.ArrayList;

public class FlowerShop {

    private final ArrayList<Flower> flowerList;
    private ArrayList<Flower> flowerChoices;
    private final TextUI ui = new TextUI();
    private final FileIO io = new FileIO();
    private int totalPrice = 0;


    public FlowerShop() {
        this.flowerList = new ArrayList<>();
    }

    public void setup() {
        ArrayList<String> flowerData = io.readFlowerData("src/main/java/Task10/flowers.txt");

        for (String s : flowerData) {
            String[] row = s.split(",");
            String name = row[0].trim();
            String color = row[1].trim();
            String scent = row[2].trim();
            int price = Integer.parseInt(row[3].trim());

            registerFlowers(name, color, scent, price);
        }
    }

    public void registerFlowers(String name, String color, String scent, int price) {
        Flower f = new Flower(name, color, scent, price);
        flowerList.add(f);
    }

    public void userDialog() {
        this.flowerChoices = new ArrayList<>();
        int flowersChosen = 0;

        ui.displayMsg("Welcome to my flower shop. Here's a list of my flowers:\n");

        for (int i = 0; i < flowerList.size(); i++) {
            ui.displayMsg((i + 1) + ": " + flowerList.get(i));
        }

        while (flowersChosen < 3) {
            String response = ui.getInput("\nChoose three flowers");
            switch (response.toLowerCase()) {
                case "1":
                case "rose":
                    flowerChoices.add(flowerList.get(0));
                    //displayChosenFlowers();
                    break;
                case "2":
                case "tulip":
                    flowerChoices.add(flowerList.get(1));
                    //displayChosenFlowers();
                    break;
                case "3":
                case "orchid":
                    flowerChoices.add(flowerList.get(2));
                    //displayChosenFlowers();
                    break;
                case "4":
                case "sunflower":
                    flowerChoices.add(flowerList.get(3));
                    //displayChosenFlowers();
                    break;
                case "5":
                case "lilly":
                    flowerChoices.add(flowerList.get(4));
                    //displayChosenFlowers();
                    break;
                case "6":
                case "daffodil":
                    flowerChoices.add(flowerList.get(5));
                    //displayChosenFlowers();
                    break;
                case "7":
                case "daisy":
                    flowerChoices.add(flowerList.get(6));
                    //displayChosenFlowers();
                    break;
                case "8":
                case "jasmine":
                    flowerChoices.add(flowerList.get(7));
                    //displayChosenFlowers();
                    break;
                case "9":
                case "peony":
                    flowerChoices.add(flowerList.get(8));
                    //displayChosenFlowers();
                    break;
                case "10":
                case "carnation":
                    flowerChoices.add(flowerList.get(9));
                    //displayChosenFlowers();
                    break;
                default:
                    ui.displayMsg("Seems like you made a typo, try again\n");
                    continue;
            }
            flowersChosen++;
        }

        displayChosenFlowers();

        String bouquetChoice = ui.getInput("You have chosen three flowers. Would you like to add the flowers to a bouquet? (costs DKK 50,-) Y/N");
        if (bouquetChoice.equalsIgnoreCase("Y")){
            totalPrice += 50;
            ui.displayMsg("Your flowers have been added to a bouquet. Your total price is: " + totalPrice);
        } else if (bouquetChoice.equalsIgnoreCase("N")) {
            ui.displayMsg("Your flowers have NOT been added to a bouquet. Your total price is: " + totalPrice);
        }
    }

    public void displayChosenFlowers() {
        ui.displayMsg("Flowers chosen: ");
        for (Flower f : flowerChoices) {
            ui.displayMsg(String.valueOf(f));
            totalPrice += f.getPrice();
        }
        ui.displayMsg("Total price: " + String.valueOf(totalPrice));
    }


}
