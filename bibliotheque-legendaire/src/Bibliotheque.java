import java.util.ArrayList;

public class Bibliotheque {

    private String nom;
    private ArrayList<Livre> livres;
    private int pointsGloire;

    public Bibliotheque(String nom) {
        this.nom = nom;
        this.livres = new ArrayList<>();
        this.pointsGloire = 0;
        System.out.println("🏰════════════════════════════════════🏰");
        System.out.printf("LE ROYAUME DE %s EST NÉ !%n", nom);
        System.out.println("🏰════════════════════════════════════🏰");
    }

    // Ajoute un livre au royaume, sauf s'il y est déjà
    public void ajouterLivre(Livre livre) {
        if (livres.contains(livre)) {
            System.out.printf("⚠️ %s fait déjà partie du royaume !%n", livre.getTitre());
            return;
        }
        livres.add(livre);
        pointsGloire += 10;
        System.out.printf("✨ %s a rejoint le royaume !%n", livre.getTitre());
        System.out.printf("🏆 +10 points de gloire ! Total : %d%n", pointsGloire);
    }

    public Livre chercherLivre(String titre) {
        for (int indexLivre = 0; indexLivre < livres.size(); indexLivre++) {
            if (livres.get(indexLivre).getTitre().equalsIgnoreCase(titre)) {
                System.out.printf("✅ TROUVÉ ! Position : [%d]%n", indexLivre + 1);
                return livres.get(indexLivre);
            }
        }
        System.out.println("❌ Trésor introuvable...");
        return null;
    }

    public void emprunterLivre(String titre) {
        // Je commence par vérifier si le livre existe
        Livre livreTrouve = chercherLivre(titre);

        if (livreTrouve != null) {
            livreTrouve.emprunter();
        } else {
            System.out.printf("Malheureusement, tu ne peux pas emprunter le livre %s, car il n'existe pas%n", titre);
        }
    }

    public void retournerLivre(String titre) {
        Livre livreTrouve = chercherLivre(titre);
        if (livreTrouve != null) {
            livreTrouve.retourner();
        }
    }

    public void afficherLivres() {
        System.out.printf("%n📜 Catalogue du royaume %s (%d livres)%n", nom, livres.size());
        for (Livre livre : livres) {
            livre.afficher();
        }
    }

    public int getPointsGloire() {
        return pointsGloire;
    }
}
