package ca.magicworld.employes;

public abstract class Employee {
    private String nom;
    private String prenom;
    private int anneesAnciennete;

    public Employee(String nom, String prenom, int anneesAnciennete) {
        this.nom = nom;
        this.prenom = prenom;
        this.anneesAnciennete = anneesAnciennete;
    }

    public int getAnneesAnciennete() {
        return anneesAnciennete;
    }

    public String getNomComplet() {
        return nom + " " + prenom;
    }

    public abstract double calculerRemuneration();

    public abstract void effectuerActivite(int duree);

    @Override
    public String toString() {
        return getNomComplet() + " (" + anneesAnciennete + " ans)";
    }
}
