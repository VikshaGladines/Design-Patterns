package sample.design.comportement.templatemethod;

import lombok.extern.java.Log;

@Log
public class TeaRecipeTM extends CoffeeMachineRecipe {

    protected String recipename = "thé";

    @Override
    protected void addAdditionalIngredients() {
        log.info("le gingembre, le poivre et le clou de girofle ont été ajoutés");
    }

    @Override
    protected void addMainIngredients() {
        log.info("la feuille de thé a été ajoutée");
    }
}
