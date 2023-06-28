import java.nio.file.Path;
import java.util.List;

public interface LecteurFLAC {

    void ouvrirFichier(Path cheminFichier);
    void décoderFichier(Path fichier);
    void envoyerSonVersEnceinte (byte[]son, List<String> nomEnceinte);


}
