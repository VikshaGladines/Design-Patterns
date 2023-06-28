package sample.design.comportement.templatemethod;

public class Factory {

    public CoffeeMachineRecipe recipename (String name) {

        if ("chocolat_chaud".equals(name)) {
            return new ChocolatRecipe();
        }

        if ("grenadine_a_l_eau".equals(name)) {
            return new GrenadineRecipe();
        }

        return null;
    }

}
