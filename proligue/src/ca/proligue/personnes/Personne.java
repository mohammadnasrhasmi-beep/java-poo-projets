// =============================================================
// PACKAGE : ca.proligue.personnes
// Regroupe toutes les classes qui représentent des personnes.
// En Java, le mot-clé "package" permet d'organiser le code
// en dossiers logiques, comme des tiroirs dans un classeur.
// =============================================================
package ca.proligue.personnes;

/**
 * CLASSE ABSTRAITE : Personne
 * ----------------------------
 * Une classe abstraite est un "modèle incomplet".
 * On ne peut PAS créer un objet directement depuis cette classe
 * (ex: new Personne() est interdit).
 *
 * Elle sert de BASE pour les classes Joueur et Entraineur.
 * Tout ce qui est commun à toutes les personnes est défini ici.
 */
public abstract class Personne {

    // -------------------------------------------------------
    // ATTRIBUTS (données de la classe)
    // "private" signifie que personne ne peut accéder à ces
    // attributs directement, même pas les sous-classes.
    // On passe obligatoirement par les getters pour les lire.
    // -------------------------------------------------------
    private String nom;
    private String prenom;
    private int anneesExperience;

    // -------------------------------------------------------
    // CONSTRUCTEUR
    // Le constructeur initialise les données de l'objet
    // quand on le crée avec "new".
    // -------------------------------------------------------
    public Personne(String nom, String prenom, int anneesExperience) {
        this.nom = nom;
        this.prenom = prenom;
        this.anneesExperience = anneesExperience;
    }

    // -------------------------------------------------------
    // MÉTHODES ABSTRAITES
    // Une méthode abstraite n'a PAS de corps (pas d'accolades).
    // Chaque sous-classe EST OBLIGÉE de l'implémenter.
    // C'est comme un contrat que les sous-classes doivent respecter.
    // -------------------------------------------------------

    /**
     * Calcule la rémunération de la personne.
     * Chaque type de personne (Joueur, Entraineur) a sa propre formule.
     * @return le salaire total en dollars
     */
    public abstract double calculerRemuneration();

    /**
     * Fait effectuer une activité à la personne.
     * Le comportement est différent selon le type de personne.
     * @param intensite niveau d'intensité de l'activité (1 à 10)
     */
    public abstract void effectuerActivite(int intensite);

    /**
     * Retourne le nom complet (prénom + nom) de la personne.
     * Utilisé dans ClubSportif pour afficher le bilan.
     */
    public String getNomComplet() {
        return prenom + " " + nom;
    }

    /**
     * Retourne les années d'expérience.
     * Utilisé par Joueur et Entraineur dans calculerRemuneration().
     */
    public int getAnneesExperience() {
        return anneesExperience;
    }
}