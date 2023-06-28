package sample.solid.ocp;

import lombok.extern.java.Log;

@Log
public class AmphibiousCar extends Car {

    public void navigate() {
        log.info("La voiture navigue sur l'eau");
    }

}
