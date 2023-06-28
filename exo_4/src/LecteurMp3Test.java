import java.io.File;

public class LecteurMp3Test {

    public static void main(String[] args) {

        byte[] tableau = new byte[5];

        LecteurMp3 lecture = new LecteurMp3();
        lecture.ouvrirFichier("ouvrir");
        lecture.décoderFichier(new File("décoder"));
        lecture.envoyerSonVersEnceinte(tableau,"envoie le son");
    }

}
