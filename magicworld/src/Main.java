import ca.magicworld.employes.Animateur;
import ca.magicworld.employes.Gerant;
import ca.magicworld.employes.Technicien;
import ca.magicworld.gestion.Parc;

public class Main {
    public static void main(String[] args) {
        Parc parc = new Parc("MagicWorld");

        Animateur vedette = new Animateur(6, 3, 28, "Clara", "Fontaine", 7);
        Technicien senior = new Technicien(4, 1400, "Hassan", "Morin", 5);
        Technicien recrue = new Technicien(2, 1100, "Léo", "Gagnon", 1);
        Gerant gerant = new Gerant(25, 3900, "Sophie", "Tremblay", 12);

        parc.ajouterEmploye(vedette);
        parc.ajouterEmploye(senior);
        parc.ajouterEmploye(recrue);
        parc.ajouterEmploye(gerant);
        parc.ajouterEmploye(new Animateur(1, 1, 20, "Clara", "Fontaine", 7)); // doublon

        parc.afficherEmployes();
        parc.journeeDeTravail(90);
        parc.afficherBilan();
    }
}
