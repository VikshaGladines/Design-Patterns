public class CoffeeLatteRecipe extends CofeeRecipe{

    @Override
    public void Filtrer() {
        System.out.println("Filtrer le café avec de l'eau bouillante");
    }

    @Override
    public void Ajouter() {
        System.out.println("Ajouter votre cuillerée de chocolat en poudre, votre lait et du sucre vanillé");
    }
}
