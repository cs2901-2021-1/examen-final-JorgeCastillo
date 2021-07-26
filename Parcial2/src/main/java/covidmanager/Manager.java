package covidmanager;

import usuario.Listener;

import java.util.*;

public class Manager {
    List<Listener> listeners = new LinkedList<>();;

    public Manager() {

    }

    public void subscribe(Listener listener) {
        listeners.add(listener);
    }

    public void unsubscribe(Listener listener) {
        listeners.remove(listener);
    }

    public void notifyusers() {
        for (int i=0; i<listeners.size(); i++) {
            var listener = listeners.get(i);
            listener.update();
        }
    }
}
