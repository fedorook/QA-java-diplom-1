import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunParameterizedTest {

    private final String name;
    private final float price;
    private final Bun bun;

    public BunParameterizedTest(String name, float price) {
        this.name = name;
        this.price = price;
        this.bun = new Bun(name, price);
    }

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                { "white bun", 100.0f },
                { "black bun", 200.0f },
                { "red bun", 300.0f }
        };
    }

    @Test
    public void testGetName() {
        assertEquals(name, bun.getName());
    }

    @Test
    public void testGetPrice() {
        assertEquals(price, bun.getPrice(), 0.0f);
    }
}
