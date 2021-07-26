package covidmanager;

import usuario.Usuario;

import java.util.logging.Logger;

public class CovidManager {
    public static final Manager manager = new Manager();
    boolean login = false;

    static final Logger logger = Logger.getLogger(CovidManager.class.getName());

    public CovidManager() {
        /* Manager is initilized */
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
