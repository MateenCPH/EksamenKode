package Task8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FoodWaste {
    public List<Integer> limits;

    public FoodWaste() {
        this.limits = new ArrayList<>();
        limits.add(3);
        limits.add(1);
        limits.add(14);
        limits.add(2);
        limits.add(5);
    }


    public boolean checkDate(int category, LocalDate saleByDate) {
        int limit = limits.get(category);

        LocalDate stopfoodWasteDate = saleByDate.minusDays(limit);

        return stopfoodWasteDate.isBefore(LocalDate.of(2024,01,7)) || stopfoodWasteDate.isEqual(LocalDate.of(2024,01,7));
    }
}
