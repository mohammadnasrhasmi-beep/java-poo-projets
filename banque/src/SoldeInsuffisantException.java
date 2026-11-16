public class SoldeInsuffisantException extends Exception {
    private double soldeActuel, montantDemande;

    public SoldeInsuffisantException(double soldeActuel, double montantDemande) {
        super(String.format("solde inssufisant %2.f < %2.f", soldeActuel, montantDemande ));
        this.soldeActuel = soldeActuel;
        this.montantDemande = montantDemande;
    }
    public double getSoldeActuel() {
        return soldeActuel;
    }
    public double getMontantDemande() {
        return montantDemande;
    }
}
