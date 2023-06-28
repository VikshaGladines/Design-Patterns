package sample.design.comportement.templatemethod;

import lombok.extern.java.Log;

@Log
public class CoffeeLatteRecipeTM extends CoffeeMachineRecipe {

    protected String recipename = "café latte";

    @Override
    protected void addAdditionalIngredients() {
        log.info("le chocolat en poudre, le lait et du sucre vanillé ont été ajoutés");
    }

    @Override
    protected void addMainIngredients() {
        log.info("Le café a été filtré avec l'eau bouillante");
    }

}
