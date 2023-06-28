package sample.design.comportement.observer;

public interface Subject {

    /**
     * ajoute un nouvel observateur
     * @param observer
     */
    void addObserver(Observer observer);

    /**
     * supprime un observateur
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * notifie tous les observateurs d'un nouvel évènement
     */
    void notifyObservers();


}
