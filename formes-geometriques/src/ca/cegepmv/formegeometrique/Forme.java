package ca.cegepmv.formegeometrique;

    public abstract class Forme {
        private String couleur;
        private String type;

        public Forme (String couleur, String type){
            this.couleur = couleur;
            this.type = type;
        }

        //Méthodes abstraites
        public abstract double calculerPerimetre();
        public abstract double calculaireAire();

        public void afficherCouleur(){
            System.out.printf("La couleur de la forme est: %s ", couleur);
        }

        public String getType(){
            return type;
        }
    }
