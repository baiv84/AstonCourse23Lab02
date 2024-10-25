import Model.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TrainingGround {
    @Test
    public void main() {
        Enemy enemy = new T800Cyberdyne("Arnold Schwarzenegger", 1000);

        List<Hero> roles = new ArrayList<>(Arrays.asList(
                new Warrior("Cynthia Rothrock", 100),
                new Archer("Paul Young", 200),
                new Mage("Goodwin", 300)
        ));
        Stream stream = roles.stream();
        stream.forEach(role -> {
            ((Hero)role).attackEnemy(enemy);
        });
    }
}
