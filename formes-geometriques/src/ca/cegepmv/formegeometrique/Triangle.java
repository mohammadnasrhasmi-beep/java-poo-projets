package ca.cegepmv.formegeometrique;

public class Triangle extends Forme {
    private double base, hauteur, cote1, cote2;
    public Triangle(double base, double hauteur, double cote1, double cote2 , String couleur){
        super(couleur, "ca.cegepmv.formegeometrique.Triangle");
        this.base = base;
        this.hauteur = hauteur;
        this.cote1 = cote1;
        this.cote2 = cote2;
    }

    public double calculerPerimetre(){
        return base + cote1 + cote2;
    }

    @Override
    public double calculaireAire() {
        return (base * hauteur)/2;
    }

}
