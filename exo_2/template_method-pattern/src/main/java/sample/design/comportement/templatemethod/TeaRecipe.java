package sample.design.comportement.templatemethod;

import lombok.extern.java.Log;

@Log
public class TeaRecipe {

    protected String recipename = "thé";

    public void boilWater() {
        log.info("l'eau chaude est prête");
    }

    public void addTeaLeaf() {
        log.info("la feuille de thé a été ajoutée");
    }

    public void addAdditionalIngredientsForTea() {
        log.info("le gingembre, le poivre et le clou de girofle ont été ajoutés");
    }

    public void putIntoACup() {
        log.info("La préparation a été versée dans la tasse");
    }
}
