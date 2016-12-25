import org.junit.Assert;
import org.junit.Test;

public class HelloTest {

    @Test
    public void testHello() {
        Assert.assertEquals(new Hello().hello("Stephen"), "Hello, Stephen!");
        Assert.assertEquals(new Hello().hello(), "Hello, World!");
    }
}
