import java.io.File;

public class LecteurMp3 implements Lecteur{

    @Override
    public void ouvrirFichier(String cheminFichier) {
        System.out.println("ouvre le fichier");
    }

    @Override
    public void décoderFichier(File fichier) {
        System.out.println("décode le fichier");
    }

    @Override
    public void envoyerSonVersEnceinte(byte[] son, String nomEnceinte) {
        System.out.println("envoie le son vers l'enceinte");
    }

}
