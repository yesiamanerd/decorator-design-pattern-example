import org.example.Bird;
import org.example.Dragon;
import org.example.Lizard;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DragonTest {

    @Test
    public void testBirdFly() {
        Bird bird = new Bird();
        bird.age = 5;
        assertEquals("flying", bird.fly());
        bird.age = 15;
        assertEquals("too old", bird.fly());
    }

    @Test
    public void testLizardCrawl() {
        Lizard lizard = new Lizard();
        lizard.age = 2;
        assertEquals("crawling", lizard.crawl());
        lizard.age = 0;
        assertEquals("too young", lizard.crawl());
    }

    @Test
    public void testDragonFly() {
        Dragon dragon = new Dragon();
        dragon.age = 150;
        assertEquals("flying", dragon.fly());
        dragon.age = 250;
        assertEquals("too old", dragon.fly());
    }

    @Test
    public void testDragonCrawl() {
        Dragon dragon = new Dragon();
        dragon.age = 150;
        assertEquals("crawling", dragon.crawl());
        dragon.age = 50;
        assertEquals("too young", dragon.crawl());
    }

    @Test
    public void testDragonAge() {
        Dragon dragon = new Dragon();
        dragon.setAge(150);
        assertEquals(150, dragon.age);
    }

    @Test
    public void testDragonConstructor() {
        Dragon dragon = new Dragon(100);
        assertEquals(100, dragon.age);
    }
}