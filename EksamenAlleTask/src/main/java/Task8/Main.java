package Task8;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate saleByDate = LocalDate.of(2024,01,22);
        FoodWaste f = new FoodWaste();
        System.out.println(f.checkDate(2, saleByDate));

    }
}
