public abstract class CofeeRecipe {

    public void CofeeMachine(){
        Bouillir();
        Filtrer();
        Ajouter();
        Verser();
    }

    private void Verser() {
        System.out.println("Verser la boisson dans la tasse");
    }

    private void Bouillir() {
        System.out.println("Faire bouillir de l'eau");
    }

    protected abstract void Ajouter();

    protected abstract void Filtrer();




}
