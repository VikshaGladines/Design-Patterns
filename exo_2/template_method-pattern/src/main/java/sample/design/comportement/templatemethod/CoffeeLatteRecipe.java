package sample.design.comportement.templatemethod;

import lombok.extern.java.Log;

@Log
public class CoffeeLatteRecipe {

    protected String recipename = "café latte";

    public void boilWater() {
        log.info("l'eau chaude est prête");
    }

    public void addCoffee() {
        log.info("Le café a été filtré avec l'eau bouillante");
    }

    public void addAdditionalIngredientsForCafe() {
        log.info("le chocolat en poudre, le lait et du sucre vanillé ont été ajoutés");
    }

    public void putIntoACup() {
        log.info("la préparation a été versée dans la tasse");
    }

}
