public class Document {
    private String titre;
    private int annee;
    private boolean estEmprunte;

    public Document(String titre, int annee){
        this.titre = titre;
        this.annee = annee;
        estEmprunte = false;
    }

    public String getTitre() {
        return titre;
    }

    public int getAnnee() {
        return annee;
    }

    public boolean estEmprunte() {
        return estEmprunte;
    }

    public void emprunter(){
        if (estEmprunte){
            System.out.printf("❌ Oups ! %s est déjà emprunté !\n", titre);
        } else {
            estEmprunte = true;
            System.out.printf("✅ Super ! Tu as emprunté %s \n", titre);
            System.out.printf("🎉 +1 emprunt réussi !\n");
        }
    }

    public void retourner(){
        if (estEmprunte){
            estEmprunte = false;
            System.out.printf("✅ Merci ! %s est de retour !\n", titre);
            System.out.printf("⭐ +1 point de karma !\n");
        } else {
            System.out.printf("⚠️ Hmm... %s n'était pas emprunté !\n", titre);
        }
    }

    public void afficher(){
        System.out.println("╔════════════════════════════════╗");
        System.out.println(" 📚 " + titre);
        System.out.println(" 📅 " + annee);

        if (this.estEmprunte){
            System.out.println(" 🔴 EMPRUNTÉ");
        } else {
            System.out.println(" 🟢 DISPONIBLE");
        }

        System.out.println("╚════════════════════════════════╝");
    }
}
