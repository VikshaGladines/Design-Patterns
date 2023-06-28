package sample.design.comportement.observer.correction;

import lombok.extern.java.Log;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

@Log
public class JournalistePCL implements PropertyChangeListener {

    private final String agencyName;

    List<News> list = new ArrayList<>();

    public JournalistePCL(String agencyName) {
        this.agencyName = agencyName;
    }

    public void publishNews(){
        log.info("publication des actualités de "+agencyName+ " : "+ list);
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.list.add((News)propertyChangeEvent.getNewValue());
        log.info("Ajout d'une nouvelle actualité à l'agence "+agencyName +" " + propertyChangeEvent.getNewValue() );
    }
}
