package sample.design.comportement.templatemethod;

public class ChocolatRecipe extends CoffeeMachineRecipe {

    protected String recipename = "chocolat_chaud";

    @Override
    protected void addAdditionalIngredients() {
        System.out.println ("Ajouter le chocolat en poudre");
    }

    @Override
    protected void addMainIngredients() {
        System.out.println ("Ajouter le lait chaud");
    }
}
