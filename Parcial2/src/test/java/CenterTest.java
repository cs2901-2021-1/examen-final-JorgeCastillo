import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CenterTest {
    @Test
    public static void test1() {
        var c1 = new Center("Cesar Vallejo", 5000);
        c1.applyParcial();
        c1.applyTotal();
        Assert.assertEquals(c1.getActualparcial(), 50);
        Assert.assertEquals(c1.getActualparcial(), 100);
    }

}