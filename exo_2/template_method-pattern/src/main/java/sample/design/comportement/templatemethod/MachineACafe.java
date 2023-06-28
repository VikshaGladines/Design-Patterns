package sample.design.comportement.templatemethod;

import lombok.extern.java.Log;

@Log
public abstract class MachineACafe {

   public final  void doRecipe() {
        boilWater();
        addMainIngredients();
        addAdditionalIngredients();
        putIntoACup();

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
