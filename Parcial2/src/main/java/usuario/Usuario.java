package usuario;

import center.Center;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Usuario implements Listener {
    private String name;
    private String username;
    private String password;
    private int edad;
    private List<Center> centers = new LinkedList<>();

    static final Logger logger = Logger.getLogger(Usuario.class.getName());

    public Usuario(String name, String username, String password, int edad) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void centerAlta(Center center) {
        centers.add(center);
    }

    public void centerBaja(Center center) {
        centers.remove(center);
    }

    @Override
    public void update() {
        logger.log(Level.INFO,"Ciudadano {0} \n:" , name);
        for (int i=0; i<centers.size(); i++) {
            var center = centers.get(i);
            logger.info(center.getName() + "\n" +
                    "\tha vacuado a " + center.getActualparcial() + " de " + center.getTotal() + "\n" +
                    "\tvacunados parciales:" + center.getPercentageParcial() + "\n" +
                    "\tvacunados totales" + center.getPercentageTotal() + "\n");
        }
    }

}
