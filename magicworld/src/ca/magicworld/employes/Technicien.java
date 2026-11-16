package ca.magicworld.employes;

public class Technicien extends Employee {
    private int nbManegesGeres;
    private int salaireForfaitaireSemaine;

    public Technicien(int nbManegesGeres, int salaireForfaitaireSemaine, String nom, String prenom, int anneesAnciennete) {
        super(nom, prenom, anneesAnciennete);
        this.nbManegesGeres = nbManegesGeres;
        this.salaireForfaitaireSemaine = salaireForfaitaireSemaine;
    }

    @Override
    public double calculerRemuneration() {
        double primeManeges = nbManegesGeres * 120;
        // Prime réduite de 10 % pour les techniciens de moins de 2 ans
        if (getAnneesAnciennete() < 2) {
            primeManeges *= 0.90;
        }
        return primeManeges + salaireForfaitaireSemaine;
    }

    @Override
    public void effectuerActivite(int duree) {
        System.out.println(getNomComplet() + " effectue l'inspection technique de " + nbManegesGeres + " manèges pendant " + duree + " minutes.");
    }

    @Override
    public String toString() {
        return super.toString() + " | Technicien | Manèges : " + nbManegesGeres;
    }
}
