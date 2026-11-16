//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Création d'un compte chèque pour Samuel
        CompteBancaire cheque = new CompteBancaire("Samuel", 500, "cheque");
        System.out.println(cheque.getTitulaire());
        cheque.setSolde(-50);
        System.out.println(cheque.getSolde());

        //Création d'un compte d'épargne pour Samuel
        CompteBancaire epargne = new CompteBancaire("Samuel", 200, "epargne");

        //
        int[] nombres = new int[2];
        nombres[0] = 6;

        //Création d'un tableau de compte bancaire
        CompteBancaire[] comptes = new CompteBancaire[2];
        comptes[0] = cheque;
        comptes[1] = epargne;


    }
}