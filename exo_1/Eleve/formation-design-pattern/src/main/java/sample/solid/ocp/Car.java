package sample.solid.ocp;

import lombok.extern.java.Log;

@Log
public class Car {

    public void run() {
        log.info("La voiture roule");
    }

    public void stop() {
        log.info("La voiture s'arrête");
    }

}
