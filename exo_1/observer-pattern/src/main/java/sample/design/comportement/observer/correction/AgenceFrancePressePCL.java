package sample.design.comportement.observer.correction;

import lombok.extern.java.Log;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;
@Log
public class AgenceFrancePressePCL {

    private List<News> newsList = new ArrayList<>();

    private News lastNews = null;

    private PropertyChangeSupport support;

    public AgenceFrancePressePCL() {
        support = new PropertyChangeSupport(this);
    }

    public AgenceFrancePressePCL(List<PropertyChangeListener> observers) {
        support = new PropertyChangeSupport(this);
        for (PropertyChangeListener observer : observers) {
            this.addObserver(observer);
        }
    }

    public void addObserver(PropertyChangeListener observer) {
        support.addPropertyChangeListener(observer);
        log.info("Abonnement d'un média");
    }

    public void removeObserver(PropertyChangeListener observer) {
        support.removePropertyChangeListener(observer);
        log.info("Désabonnement d'un média");
    }

    public void addNews(News news) {
        support.firePropertyChange("news", this.lastNews, news);
        this.lastNews = news;

    }


}
