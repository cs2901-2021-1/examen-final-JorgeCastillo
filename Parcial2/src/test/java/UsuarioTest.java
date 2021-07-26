import center.Center;
import covidmanager.CovidManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import usuario.Usuario;

public class UsuarioTest {
    @Test
    public static void test1() {
        var u1 = new Usuario("Jorge", "JorgeC", "CegroJ", 19);
        u1.setName("Juan");
        u1.setUsername("Juan1");
        u1.setEdad(18);
        u1.setPassword("1nauJ");

        Assert.assertEquals(u1.getName(), "Juan");
        Assert.assertEquals(u1.getEdad(), 18);
        Assert.assertEquals(u1.getPassword(), "1nauJ");
        Assert.assertEquals(u1.getUsername(), "Juan1");
    }

    @Test
    public static void test2() {
        var u1 = new Usuario("Jorge", "JorgeC", "CegroJ", 19);
        var c1 = new Center("Cesar Vallejo", 500);
        var cm = new CovidManager();
        cm.login(u1);
        u1.centerAlta(c1);
        cm.manager.notifyusers();
        Assert.assertEquals(c1.getActualparcial(), 0);
    }
}