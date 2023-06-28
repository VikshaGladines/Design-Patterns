package sample.design.comportement.templatemethod;

public class CofeeMachine {

    public static void main(String[] args) {
        // faire un café
        CoffeeLatteRecipeTM latteRecipe = new CoffeeLatteRecipeTM();
        latteRecipe.doRecipe();
        // faire un thé
        TeaRecipeTM teaRecipeTM = new TeaRecipeTM();
        teaRecipeTM.doRecipe();

        Factory boisson = new Factory();
        boisson.recipename();//mettre en parametre "grenadine_a_l_eau" ou "chocolat_chaud
    }
}
