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
        Enemy enemy = new Enemy("Heroku Saki", 1000);

        List<Hero> roles = new ArrayList<>(Arrays.asList(
                new Warrior("Cynthia Rothrock"),
                new Archer("Paul Young"),
                new Mage("Goodwin")
        ));
        Stream stream = roles.stream();
        stream.forEach(role -> {
            ((Hero)role).attackEnemy(enemy);
        });
    }
}
