package ca.cegepmv.formegeometrique;

import java.util.ArrayList;

public class GestionnaireForme {

    private ArrayList<Forme> formes;

    public GestionnaireForme(){
        formes = new ArrayList<>();
    }

    public void ajouterForme(Forme forme){
        formes.add(forme);
    }

    public double calculerSommeDesAiresDeToutesLesFormes()
    {
        double somme = 0;
        for (Forme forme: formes){
            somme += forme.calculaireAire();
        }
        return  somme;
    }

    public void afficherAireEtPerimetre(){
        for (Forme forme : formes){
            System.out.printf("La forme %s a un périmètre de %.2f\n", forme.getType(), forme.calculerPerimetre());
            System.out.printf("La forme %s a une aire de %.2f\n\n", forme.getType(), forme.calculaireAire());
        }
    }

    public Forme trouverFormeAvecPlusGrangeAire(){
        Forme formePlusGrandeAire = formes.get(0);

        for (Forme forme : formes){
            if (forme.calculaireAire() > formePlusGrandeAire.calculaireAire())
            {
                formePlusGrandeAire = forme;
            }
        }

        return formePlusGrandeAire;
    }
}
