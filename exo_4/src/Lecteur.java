import java.io.File;

public interface Lecteur {

    void ouvrirFichier(String cheminFichier);
    void décoderFichier(File fichier);
    void envoyerSonVersEnceinte (byte[]son, String nomEnceinte);

}
