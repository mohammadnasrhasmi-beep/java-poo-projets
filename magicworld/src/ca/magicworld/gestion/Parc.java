package ca.magicworld.gestion;

import ca.magicworld.employes.Employee;

import java.util.ArrayList;
import java.util.List;

public class Parc {
    private String nom;
    private List<Employee> employes = new ArrayList<>();

    public Parc(String nom) {
        this.nom = nom;
    }

    public boolean estDejaInscrit(Employee employe) {
        for (Employee e : employes) {
            if (e.getNomComplet().equalsIgnoreCase(employe.getNomComplet())) {
                return true;
            }
        }
        return false;
    }

    public void ajouterEmploye(Employee employe) {
        if (estDejaInscrit(employe)) {
            System.out.println("⚠️ " + employe.getNomComplet() + " travaille déjà au parc.");
        } else {
            employes.add(employe);
            System.out.println("✅ " + employe.getNomComplet() + " rejoint l'équipe de " + nom + " !");
        }
    }

    public void afficherEmployes() {
        System.out.println("\n===== Employés de " + nom + " =====");
        for (Employee e : employes) {
            System.out.println(e);
        }
    }

    public void journeeDeTravail(int duree) {
        System.out.println("\n===== Une journée à " + nom + " =====");
        for (Employee e : employes) {
            e.effectuerActivite(duree);
        }
    }

    public double calculerMasseSalariale() {
        double total = 0;
        for (Employee e : employes) {
            total += e.calculerRemuneration();
        }
        return total;
    }

    public void afficherBilan() {
        System.out.println("\n===== Bilan salarial hebdomadaire =====");
        for (Employee e : employes) {
            System.out.printf("%-20s %10.2f $%n", e.getNomComplet(), e.calculerRemuneration());
        }
        System.out.printf("%-20s %10.2f $%n", "TOTAL", calculerMasseSalariale());
    }
}
