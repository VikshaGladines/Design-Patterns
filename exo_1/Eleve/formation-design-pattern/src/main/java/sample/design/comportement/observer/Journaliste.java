package sample.design.comportement.observer;

import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.List;
@Log
public class Journaliste implements Observer{

    private final String agencyName;

    List<News> list = new ArrayList<>();

    public Journaliste(String agencyName) {
        this.agencyName = agencyName;
    }

    @Override
    public void update(News news) {
      list.add(news);
      log.info("Ajout d'une nouvelle actualité à l'agence "+agencyName +" " + news );
    }

    public void publishNews(){
        log.info("publication des actualités de "+agencyName+ " : "+ list);
    }
}
