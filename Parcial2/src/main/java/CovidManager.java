import java.util.logging.Logger;

public class CovidManager {
    Manager manager;
    boolean login = false;

    static final Logger logger = Logger.getLogger(CovidManager.class.getName());

    public CovidManager() {
        manager = new Manager();
    }

    public void login(Usuario usuario) {
        var rev = new StringBuilder(usuario.getUsername());
        var comp = rev.reverse().toString();
        if (usuario.getUsername().equals(comp)) {
            logger.info("Sesión iniciada");
            login = true;
            manager.subscribe(usuario);
        }
        while (login) {
            manager.notifyusers();
        }

    }

    public void logout(Usuario usuario) {
        logger.info("Sesión Cerrada");
        login = false;
        manager.unsubscribe(usuario);
        // no se desuscribe realmente, solo deja de recibir notificaciones
    }
}
