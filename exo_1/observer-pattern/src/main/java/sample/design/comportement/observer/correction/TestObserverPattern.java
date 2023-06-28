package sample.design.comportement.observer.correction;


import java.beans.PropertyChangeListener;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TestObserverPattern {

    public static void main(String[] args) {

        // création des consommateurs des actualités de l'AFP
        JournalistePCL france2 = new JournalistePCL("France2");
        JournalistePCL france3 = new JournalistePCL("France3");
        JournalistePCL tf1 = new JournalistePCL("Tf1");
        JournalistePCL m6 = new JournalistePCL("M6");
        final List<PropertyChangeListener> channels = Arrays.asList(france2, france3, tf1, m6);

        // abonnement des chaines de Télé à l'AFP
        AgenceFrancePressePCL afp = new AgenceFrancePressePCL(channels);

        // création d'une nouvelle actualité
        News news = News.builder().content("Tout va bien !").title("Nouvelle sensationnel !").createdDate(new Date()).build();
        afp.addNews(news);


        // création d'une nouvelle actualité
        News news_1 = News.builder().content("Tout va encore très bien !").title("Une autre nouvelle sensationnel !").createdDate(new Date()).build();
        afp.addNews(news_1);



        // création d'une nouvelle chaine et abonnement à l'AFP
        JournalistePCL euronews = new JournalistePCL("Euronews");
        afp.addObserver(euronews);

        // désabonnement d'une chaine existante
        afp.removeObserver(france2);

        // création d'une nouvelle actualité
        News news_2 = News.builder().content(" Abonnez-vous !").title("Un média s'est abonné et un autre c'est désabonné !").createdDate(new Date()).build();
        afp.addNews(news_2);

    }
}
