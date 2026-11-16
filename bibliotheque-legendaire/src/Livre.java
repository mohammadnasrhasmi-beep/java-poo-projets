public class Livre extends Document {

    private String auteur;
    private int nombrePages;

    public Livre(String titre, String auteur, int annee, int nombrePages) {
        super(titre, annee);
        this.auteur = auteur;
        this.nombrePages = nombrePages;
        System.out.println("✨ NOUVEAU LIVRE CRÉÉ : " + titre);
    }

    // Mission 1.2 : affichage d'un livre avec son auteur et son nombre de pages
    @Override
    public void afficher() {
        System.out.println("╔════════════════════════════════╗");
        System.out.println(" 📚 " + getTitre());
        System.out.println(" ✍️ " + auteur);
        System.out.println(" 📅 " + getAnnee() + " · " + nombrePages + " pages" + (isLong() ? " (pavé !)" : ""));

        if (estEmprunte()) {
            System.out.println(" 🔴 EMPRUNTÉ");
        } else {
            System.out.println(" 🟢 DISPONIBLE");
        }

        System.out.println("╚════════════════════════════════╝");
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNombrePages() {
        return nombrePages;
    }

    public boolean isLong() {
        return nombrePages > 400;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
}
