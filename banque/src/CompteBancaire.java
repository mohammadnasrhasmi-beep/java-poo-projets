public class CompteBancaire {
    private String motDePasse;
    private String titulaire;
    private double solde;
    private String type;

    public String getTitulaire(){
        return titulaire;
    }

    /*
    public void setTitulaire(String titulaireParam){
        titulaire = titulaireParam;
    }*/

    public double getSolde() {
        return solde;
    }

    public void setSolde(double montant){
        if (montant < 0){
            System.out.println("Tu dois me fournir un montant plus élevé");
            return;
        }
        solde = montant;
    }

    public void retirer(int montant){
        solde -= montant;
    }

    public void deposer(double montant){
        solde += montant;
    }

    public CompteBancaire(String titulaire, double soldeInitial, String type){
        this.titulaire = titulaire;
        this.solde = soldeInitial;
        this.type = type;
    }


}
