package sample.design.comportement.observer;

import java.util.ArrayList;
import java.util.List;

public class AgenceFrancePresse implements Subject {

    private List<News> newsList = new ArrayList<>();

    private List<Observer> observers = new ArrayList<>();

    private News lastNews = null;

    public AgenceFrancePresse() {
    }


    public void addNews(News news){
        this.lastNews = news;
        notifyObservers();
    }


}
