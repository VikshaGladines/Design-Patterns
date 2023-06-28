package sample.design.comportement.observer;

import java.net.http.WebSocket;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TestObserverPattern {

    public static void main(String[] args) {

        // création des consommateurs des actualités de l'AFP
        Journaliste france2 = new Journaliste("France2");
        Journaliste france3 = new Journaliste("France3");
        Journaliste tf1 = new Journaliste("Tf1");
        Journaliste m6 = new Journaliste("M6");
        final List<Observer> channels = Arrays.asList(france2, france3, tf1, m6);

        france3.publishNews();

        // abonnement des chaines de Télé à l'AFP
        AgenceFrancePresse afp = new AgenceFrancePresse(channels);

        // création d'une nouvelle actualité
        News news = News.builder().content("Tout va bien !").title("Nouvelle sensationnel !").createdDate(new Date()).build();
        afp.addNews(news);

        // vérification de la mise à jour des chaines de télévision
        france3.publishNews();

        // création d'une nouvelle actualité
        News news_1 = News.builder().content("Tout va encore très bien !").title("Une autre nouvelle sensationnel !").createdDate(new Date()).build();
        afp.addNews(news_1);

        // vérification de la mise à jour des chaines de télévision
        france2.publishNews();

    }
}
