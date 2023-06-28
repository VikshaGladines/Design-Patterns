package sample.design.comportement.templatemethod;

import lombok.extern.java.Log;

@Log
public abstract class CoffeeMachineRecipe {

    protected String recipename;

    public final void doRecipe() {
        boilWater();
        addMainIngredients();
        addAdditionalIngredients();
        putIntoACup();
        drinkReady();

    }

    private void drinkReady() {
        log.info("Votre boisson est prête à être consommée");
    }

    private void putIntoACup() {
        // implémentation
        log.info("La boisson a été versée dans une tasse");

    }

    protected abstract void addAdditionalIngredients();

    protected abstract void addMainIngredients();

    private void boilWater() {
        // implémentation
        log.info("L'eau bouillante est prête à être utilisée'");
    }


}
