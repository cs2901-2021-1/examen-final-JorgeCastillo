public class CovidManager {
    Manager manager;
    boolean login = false;

    public CovidManager() {
        manager = new Manager();
    }

    public void login(Usuario usuario) {
        var rev = new StringBuilder(usuario.getUsername());
        var comp = rev.reverse().toString();
        if (usuario.getUsername() == comp) {
            System.out.println("Sesión iniciada");
            login = true;
            manager.subscribe(usuario);
        }
        while (login) {
            manager.notifyusers();
        }

    }

    public void logout(Usuario usuario) {
        System.out.println("Sesión iniciada");
        login = false;
        manager.unsubscribe(usuario);
        // no se desuscribe realmente, solo deja de recibir notificaciones
    }
}
