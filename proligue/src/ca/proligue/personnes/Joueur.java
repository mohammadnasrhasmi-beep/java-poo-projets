// =============================================================
// PACKAGE : ca.proligue.personnes
// =============================================================
package ca.proligue.personnes;

/**
 * CLASSE : Joueur
 * ----------------
 * "extends Personne" signifie que Joueur HÉRITE de Personne.
 * Un Joueur EST une Personne : il a donc nom, prenom,
 * anneesExperience EN PLUS de ses propres attributs.
 *
 * HÉRITAGE = la sous-classe reçoit automatiquement tout ce que
 * la classe parent possède.
 */
public class Joueur extends Personne {

    // -------------------------------------------------------
    // ATTRIBUTS PROPRES AU JOUEUR
    // Ces données s'ajoutent à celles héritées de Personne.
    // -------------------------------------------------------
    private int nbButs;
    private int nbPasses;
    private double salaireBaseMatch;

    // Constante : nombre de matchs fixé pour cet exercice
    // "static final" = une constante partagée par tous les joueurs
    private static final int NB_MATCHS = 5;

    // -------------------------------------------------------
    // CONSTRUCTEUR
    // "super(...)" appelle le constructeur de la classe parent
    // (Personne) pour initialiser nom, prenom, anneesExperience.
    // -------------------------------------------------------
    public Joueur(String nom, String prenom, int anneesExperience,
                  int nbButs, int nbPasses, double salaireBaseMatch) {
        // Appel OBLIGATOIRE au constructeur parent en 1re ligne
        super(nom, prenom, anneesExperience);

        // Initialisation des attributs propres au Joueur
        this.nbButs = nbButs;
        this.nbPasses = nbPasses;
        this.salaireBaseMatch = salaireBaseMatch;
    }

    // -------------------------------------------------------
    // IMPLÉMENTATION DE calculerRemuneration()
    // On est obligé de définir cette méthode car elle est
    // abstraite dans Personne. Le mot "@Override" indique
    // qu'on remplace la version de la classe parent.
    // -------------------------------------------------------
    @Override
    public double calculerRemuneration() {

        // ÉTAPE 1 : Salaire de base = salaire par match × nombre de matchs
        double salaire = salaireBaseMatch * NB_MATCHS;

        // ÉTAPE 2 : Prime de performance
        // 150 $ par but + 75 $ par passe
        double primePerformance = (nbButs * 150.0) + (nbPasses * 75.0);
        salaire += primePerformance;

        // ÉTAPE 3 : Bonus de fidélité si plus de 5 ans d'expérience
        // Le bonus est de 10 % sur le salaire de base total (pas sur la prime)
        if (getAnneesExperience() > 5) {
            double bonusFidelite = (salaireBaseMatch * NB_MATCHS) * 0.10;
            salaire += bonusFidelite;
        }

        return salaire;
    }

    // -------------------------------------------------------
    // IMPLÉMENTATION DE effectuerActivite(int intensite)
    // -------------------------------------------------------
    @Override
    public void effectuerActivite(int intensite) {
        if (intensite > 7) {
            System.out.println(getNomComplet() + " réalise un entraînement intensif de haute performance.");
        } else {
            System.out.println(getNomComplet() + " effectue une séance de récupération technique.");
        }
    }

}