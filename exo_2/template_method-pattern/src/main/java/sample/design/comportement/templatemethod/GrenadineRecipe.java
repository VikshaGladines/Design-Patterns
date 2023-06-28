package sample.design.comportement.templatemethod;

public class GrenadineRecipe extends CoffeeMachineRecipe {

    protected String recipename = "grenadine_a_l_eau";

    @Override
    protected void addAdditionalIngredients() {
        System.out.println ("Ajouter le sirop de grenadine");
    }

    @Override
    protected void addMainIngredients() {
        System.out.println ("Ajouter l'eau");
    }
}
