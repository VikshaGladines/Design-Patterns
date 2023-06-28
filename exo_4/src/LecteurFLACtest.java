import java.io.File;
import java.nio.file.Path;
import java.util.List;

public class LecteurFLACtest {

    LecteurFLAC lecteurF = new LecteurFLAC() {

        @Override
        public void ouvrirFichier(Path cheminFichier) {
            System.out.println("ouvre le fichier");
        }

        @Override
        public void décoderFichier(Path fichier) {
            System.out.println("décode le fichier");
        }

        @Override
            public void envoyerSonVersEnceinte(byte[] son, List<String> nomEnceinte) {
            System.out.println("envoie le son vers l'enceinte");
        }

    };

}

