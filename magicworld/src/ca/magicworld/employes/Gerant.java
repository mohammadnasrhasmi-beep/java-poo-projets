package ca.magicworld.employes;

public class Gerant extends Employee {
    private static final double SALAIRE_BASE = 2500;
    private static final double PRIME_PAR_EMPLOYE = 15;

    private int nbEmployesSupervises;
    private int bonusTrimestre;

    public Gerant(int nbEmployesSupervises, int bonusTrimestre, String nom, String prenom, int anneesAnciennete) {
        super(nom, prenom, anneesAnciennete);
        this.nbEmployesSupervises = nbEmployesSupervises;
        this.bonusTrimestre = bonusTrimestre;
    }

    @Override
    public double calculerRemuneration() {
        double salaire = SALAIRE_BASE + nbEmployesSupervises * PRIME_PAR_EMPLOYE;
        // Après 10 ans, le bonus du trimestre est réparti sur ses 13 semaines
        if (getAnneesAnciennete() > 10) {
            salaire += bonusTrimestre / 13.0;
        }
        return salaire;
    }

    @Override
    public void effectuerActivite(int duree) {
        System.out.println(getNomComplet() + " tient une réunion d'équipe de " + duree + " minutes avec " + nbEmployesSupervises + " employés.");
    }

    @Override
    public String toString() {
        return super.toString() + " | Gérant | Employés supervisés : " + nbEmployesSupervises;
    }
}
