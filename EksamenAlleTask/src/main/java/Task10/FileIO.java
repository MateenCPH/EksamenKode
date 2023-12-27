package Task10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {

    public ArrayList<String> readFlowerData(String path) {
        ArrayList<String> flowers = new ArrayList<>();
        //Instantier filerne
        File file = new File(path);

        try {
            Scanner scan = new Scanner(file);
            scan.nextLine();
            while (scan.hasNextLine()) {
                String s = scan.nextLine();
                flowers.add(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return flowers;
    }

}
