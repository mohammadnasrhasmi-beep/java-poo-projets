// =============================================================
// PACKAGE : ca.proligue.personnes
// =============================================================
package ca.proligue.personnes;

/**
 * CLASSE : Entraineur
 * --------------------
 * Comme Joueur, Entraineur hérite de Personne (extends Personne).
 * Un Entraîneur EST une Personne avec ses propres règles de paie
 * et ses propres activités.
 */
public class Entraineur extends Personne {

    // -------------------------------------------------------
    // ATTRIBUTS PROPRES À L'ENTRAÎNEUR
    // -------------------------------------------------------
    private int nbVictoires;
    private double salaireForfaitaire;

    // -------------------------------------------------------
    // CONSTRUCTEUR
    // -------------------------------------------------------
    public Entraineur(String nom, String prenom, int anneesExperience,
                      int nbVictoires, double salaireForfaitaire) {
        // Appel au constructeur de Personne
        super(nom, prenom, anneesExperience);

        this.nbVictoires = nbVictoires;
        this.salaireForfaitaire = salaireForfaitaire;
    }

    // -------------------------------------------------------
    // IMPLÉMENTATION DE calculerRemuneration()
    // -------------------------------------------------------
    @Override
    public double calculerRemuneration() {

        // ÉTAPE 1 : Salaire de base = salaire forfaitaire (fixe)
        double salaire = salaireForfaitaire;

        // ÉTAPE 2 : Prime de victoire = 200 $ par victoire
        double primeVictoire = nbVictoires * 200.0;

        // ÉTAPE 3 : Retenue de formation si moins de 2 ans d'expérience
        // La retenue est de 15 % sur la prime de victoire SEULEMENT
        // (le salaire forfaitaire n'est pas touché)
        if (getAnneesExperience() < 2) {
            double retenue = primeVictoire * 0.15;
            primeVictoire -= retenue;
            // Note : on soustrait la retenue uniquement de la prime
        }

        // Ajout de la prime (possiblement réduite) au salaire total
        salaire += primeVictoire;

        return salaire;
    }

    // -------------------------------------------------------
    // IMPLÉMENTATION DE effectuerActivite(int intensite)
    // L'entraîneur affiche toujours le même message,
    // peu importe l'intensité.
    // -------------------------------------------------------
    @Override
    public void effectuerActivite(int intensite) {
        System.out.println(getNomComplet() + " analyse les statistiques et prépare la stratégie pour " + intensite + " joueurs.");
    }

}