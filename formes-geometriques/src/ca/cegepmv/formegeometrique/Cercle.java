package ca.cegepmv.formegeometrique;

public class Cercle extends Forme {
    private double rayon;

    public Cercle(double rayon, String couleur) {
        super(couleur, "ca.cegepmv.formegeometrique.Cercle");
        this.rayon = rayon;
    }

    @Override
    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public double calculaireAire() {
        return Math.PI * Math.pow(rayon, 2);
    }
}
