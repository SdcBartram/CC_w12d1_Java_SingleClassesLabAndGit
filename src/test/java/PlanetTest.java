import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetTest {
    Planet planet;

    @Before
    public void before() {
        planet = new Planet("Jupiter", 444498);
    }

    @Test
    public void hasName() {assertEquals("Jupiter", planet.getName());}

    @Test
    public void hasSize() {assertEquals(444498, planet.getSize());}

    @Test
    public void canExplode() {assertEquals("Boom! Jupiter has exploded.", String.format("Boom! %1$s has exploded.",planet.getName()));}
}
