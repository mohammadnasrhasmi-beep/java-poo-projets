// =============================================================
// PACKAGE : ca.proligue.gestion
// Ce package contient les classes de gestion du club.
// Il est SÉPARÉ du package "personnes" pour organiser le code
// selon les responsabilités (qui gère quoi).
// =============================================================
package ca.proligue.gestion;

// IMPORTATION : on doit importer les classes d'autres packages
// pour pouvoir les utiliser ici.
import ca.proligue.personnes.Personne;
import ca.proligue.personnes.Joueur;
import ca.proligue.personnes.Entraineur;

// ArrayList est une liste dynamique de Java (taille variable)
import java.util.ArrayList;

/**
 * CLASSE : ClubSportif
 * ---------------------
 * Cette classe représente le club dans son ensemble.
 * Elle gère une liste de personnes (joueurs et entraîneurs)
 * et peut générer des rapports financiers ou lancer des entraînements.
 *
 * POLYMORPHISME :
 * La liste contient des objets de type "Personne", mais en réalité
 * ce sont des Joueur ou des Entraineur. Java sait automatiquement
 * quelle version de calculerRemuneration() appeler selon le vrai type
 * de l'objet. C'est ça, le polymorphisme !
 */
public class ClubSportif {

    // -------------------------------------------------------
    // ATTRIBUT : la liste des membres du club
    // ArrayList<Personne> peut contenir des Joueur ET des Entraineur
    // car les deux héritent de Personne.
    // -------------------------------------------------------
    private ArrayList<Personne> membres;

    // -------------------------------------------------------
    // CONSTRUCTEUR
    // -------------------------------------------------------
    public ClubSportif() {
        // Initialisation de la liste vide
        membres = new ArrayList<Personne>();
    }

    // -------------------------------------------------------
    // MÉTHODE : ajouterMembre
    // Permet d'ajouter n'importe quelle Personne (Joueur ou Entraineur)
    // -------------------------------------------------------
    public void ajouterMembre(Personne p) {
        membres.add(p);
    }

    // -------------------------------------------------------
    // MÉTHODE : genererBilanFinancier
    // Parcourt la liste et affiche la rémunération de chaque personne,
    // puis la masse salariale totale.
    // -------------------------------------------------------
    public void genererBilanFinancier() {
        System.out.println("==============================================");
        System.out.println("         BILAN FINANCIER - PROLIGUE          ");
        System.out.println("==============================================");

        double totalMasseSalariale = 0.0;

        // Boucle "for-each" : parcourt chaque membre de la liste
        for (Personne p : membres) {

            // Déterminer le rôle de la personne
            // "instanceof" vérifie de quel type réel est l'objet
            String role;
            if (p instanceof Joueur) {
                role = "Joueur";
            } else if (p instanceof Entraineur) {
                role = "Entraîneur";
            } else {
                role = "Inconnu";
            }

            // Appel POLYMORPHIQUE : Java choisit automatiquement la bonne
            // version de calculerRemuneration() selon le vrai type de p
            double remuneration = p.calculerRemuneration();

            // Affichage formaté : %.2f affiche 2 décimales
            System.out.printf("%-20s | %-12s | %10.2f $%n",
                    p.getNomComplet(), role, remuneration);

            // Accumulation du total
            totalMasseSalariale += remuneration;
        }

        System.out.println("----------------------------------------------");
        System.out.printf("MASSE SALARIALE TOTALE        : %10.2f $%n", totalMasseSalariale);
        System.out.println("==============================================");
    }

    // -------------------------------------------------------
    // MÉTHODE : lancerEntrainement
    // Demande à chaque membre d'effectuer son activité
    // avec le niveau d'intensité donné.
    // -------------------------------------------------------
    public void lancerEntrainement(int niveau) {
        System.out.println("==============================================");
        System.out.println("   ENTRAÎNEMENT - INTENSITÉ : " + niveau);
        System.out.println("==============================================");

        for (Personne p : membres) {
            // Appel POLYMORPHIQUE : chaque personne réagit à sa façon
            p.effectuerActivite(niveau);
        }

        System.out.println("==============================================");
    }
}
