package Tools;

import java.util.Random;

public class RandomNum {
    public static int nextRandom(int min, int max) {
        Random rn = new Random();
        return (min + rn.nextInt(max - min + 1));
    }
}
