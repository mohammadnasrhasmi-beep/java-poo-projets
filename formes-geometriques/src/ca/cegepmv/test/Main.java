package ca.cegepmv.test;

import ca.cegepmv.formegeometrique.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 class Main {
    public static void main(String[] args) {

        GestionnaireForme gestionnaire = new GestionnaireForme();

        Forme rectangle = new Rectangle(5, 7, "rouge");
        Forme triangle = new Triangle(4, 6, 6, 5, "bleu");
        Cercle cercle = new Cercle(6, "vert");
        Cercle cercle2 = new Cercle(8, "noir");
        Forme triangleIsocele = new Triangle(8, 4, 7, 8, "jaune");


        gestionnaire.ajouterForme(rectangle);
        gestionnaire.ajouterForme(triangle);
        gestionnaire.ajouterForme(cercle);
        gestionnaire.ajouterForme(cercle2);
        gestionnaire.ajouterForme(triangleIsocele);

        gestionnaire.afficherAireEtPerimetre();
        System.out.println();

        Forme formePlusGrandeAire = gestionnaire.trouverFormeAvecPlusGrangeAire();
        System.out.printf("La forme avec la plus grande aire est %s et son aire est %.2f\n\n", formePlusGrandeAire.getType(), formePlusGrandeAire.calculaireAire());

        System.out.printf("La somme de toutes les aires est %.2f\n", gestionnaire.calculerSommeDesAiresDeToutesLesFormes());
    }
}