package ca.cegepmv.formegeometrique;

public class Rectangle extends Forme{

    private double longueur, largeur;

    public Rectangle(double longueur, double largeur, String couleur){
        super(couleur, "ca.cegepmv.formegeometrique.Rectangle");
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double calculerPerimetre(){
        return (longueur + largeur) * 2;
    }

    @Override
    public double calculaireAire() {
        return longueur * largeur;
    }

}
