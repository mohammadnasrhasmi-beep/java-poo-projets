package ca.magicworld.employes;

public class Animateur extends Employee {
    private int nbSpectacles;
    private int nbAteliers;
    private int tauxHoraireBase;

    public Animateur(int nbSpectacles, int nbAteliers, int tauxHoraireBase, String nom, String prenom, int anneesAnciennete) {
        super(nom, prenom, anneesAnciennete);
        this.nbSpectacles = nbSpectacles;
        this.nbAteliers = nbAteliers;
        this.tauxHoraireBase = tauxHoraireBase;
    }

    @Override
    public double calculerRemuneration() {
        double salaire = tauxHoraireBase * 40 + nbAteliers * 35 + nbSpectacles * 80;
        // Prime de fidélité de 8 % après 3 ans
        if (getAnneesAnciennete() > 3) {
            return salaire * 1.08;
        }
        return salaire;
    }

    @Override
    public void effectuerActivite(int duree) {
        if (duree > 60) {
            System.out.println(getNomComplet() + " prépare un grand spectacle de " + duree + " minutes avec costumes et effets spéciaux.");
        } else {
            System.out.println(getNomComplet() + " anime un atelier créatif de " + duree + " minutes.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " | Animateur | Spectacles : " + nbSpectacles + " | Ateliers : " + nbAteliers;
    }
}
