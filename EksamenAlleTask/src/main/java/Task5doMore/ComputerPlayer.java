package Task5doMore;

import java.util.Random;

public class ComputerPlayer implements Player{
    Random r = new Random();

    public int makeAGuess(int maxValue){
        //int low = 1;
        return r.nextInt(1,maxValue);
    }
}
