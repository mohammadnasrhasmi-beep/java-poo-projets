// =============================================================
// CLASSE PRINCIPALE : Main
// C'est le point d'entrée du programme.
// Java cherche toujours une méthode "public static void main"
// pour savoir par où commencer l'exécution.
// =============================================================

// Importation des classes nécessaires
import ca.proligue.personnes.Joueur;
import ca.proligue.personnes.Entraineur;
import ca.proligue.gestion.ClubSportif;

/**
 * CLASSE : Main
 * --------------
 * Crée les objets du scénario, les ajoute au club,
 * lance un entraînement et génère le bilan financier.
 */
public class Main {

    public static void main(String[] args) {

        // ==========================================================
        // ÉTAPE 1 : Créer les personnes du scénario
        // ==========================================================

        // --- Entraîneur Novice ---
        // 1 an d'expérience → subira la retenue de 15 % sur sa prime
        // 5 victoires, salaire forfaitaire de 3000 $
        Entraineur entraineurNovice = new Entraineur(
                "Tremblay",   // nom
                     "Marc",       // prénom
                     1,            // anneesExperience
                     5,            // nbVictoires
                     3000.0        // salaireForfaitaire
        );

        // Calcul attendu :
        //   Salaire forfaitaire : 3000.00 $
        //   Prime de victoire   : 5 × 200 = 1000.00 $
        //   Retenue (< 2 ans)   : 1000 × 15 % = 150.00 $
        //   Prime après retenue : 1000 - 150 = 850.00 $
        //   TOTAL               : 3000 + 850 = 3850.00 $

        // --- Joueur Vétéran ---
        // 10 ans d'expérience → reçoit le bonus de fidélité de 10 %
        // 4 buts, 2 passes, base de 500 $ par match
        Joueur joueurVeteran = new Joueur(
                "Gagnon",    // nom
                     "Sophie",    // prénom
                     10,          // anneesExperience
                     4,           // nbButs
                     2,           // nbPasses
                     500.0        // salaireBaseMatch
        );

        // Calcul attendu :
        //   Salaire de base     : 500 × 5 = 2500.00 $
        //   Prime buts          : 4 × 150 = 600.00 $
        //   Prime passes        : 2 × 75  = 150.00 $
        //   Bonus fidélité(10%): 2500 × 10 % = 250.00 $
        //   TOTAL               : 2500 + 600 + 150 + 250 = 3500.00 $

        // --- Joueur Recrue ---
        // 1 an d'expérience, aucun but ni passe, base de 400 $ par match
        Joueur joueurRecrue = new Joueur(
                "Leblanc",   // nom
                     "Alex",      // prénom
                     1,           // anneesExperience
                     0,           // nbButs
                     0,           // nbPasses
                     400.0        // salaireBaseMatch
        );

        // Calcul attendu :
        //   Salaire de base     : 400 × 5 = 2000.00 $
        //   Prime buts          : 0 × 150 = 0.00 $
        //   Prime passes        : 0 × 75  = 0.00 $
        //   Bonus fidélité      : NON (1 an ≤ 5 ans)
        //   TOTAL               : 2000.00 $

        // ==========================================================
        // ÉTAPE 2 : Créer le club et y ajouter les membres
        // ==========================================================
        ClubSportif club = new ClubSportif();

        club.ajouterMembre(entraineurNovice);
        club.ajouterMembre(joueurVeteran);
        club.ajouterMembre(joueurRecrue);

        // ==========================================================
        // ÉTAPE 3 : Lancer un entraînement d'intensité 8
        // Intensité 8 > 7 → les joueurs font un entraînement intensif
        // L'entraîneur affiche toujours son message habituel
        // ==========================================================
        club.lancerEntrainement(8);

        // Séparation visuelle entre les deux sections
        System.out.println();

        // ==========================================================
        // ÉTAPE 4 : Générer le bilan financier
        // ==========================================================
        club.genererBilanFinancier();
    }
}
