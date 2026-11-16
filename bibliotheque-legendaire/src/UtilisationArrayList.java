import java.util.ArrayList;
import java.util.Arrays;

public class UtilisationArrayList {

    public static void main(String[] args) {
        //Créer une liste de nom et initialiser cette liste-là avec les noms suivants: "Samuel", "Manuel", "Jayla"
        String [] noms = {"Samuel", "Manuel", "Jayla"};
        ArrayList<String> listeNoms = new ArrayList<>(Arrays.asList(noms));



        //Affichez le nombre d'éléments dans la liste : 3
        System.out.println(listeNoms.size());
        //Ensuite ajouter les noms suivants: Carl, Alessandro, Jade
        listeNoms.add("Carl");
        listeNoms.add("Alessandro");
        listeNoms.add("Jade");

        //Affichez le nombre d'éléments dans la liste à nouveau : 6
        System.out.println(listeNoms.size());

        //Vérifiez si Walid est dans la liste : faux

        System.out.println(listeNoms.contains("Walid"));
        //Vérifiez si Jayla est la liste : true
        System.out.println(listeNoms.contains("Jayla"));

        //Supprimez Carl
        listeNoms.remove("Carl");

        //Affichez le nombre d'éléments dans la liste à nouveau : 5
        System.out.println(listeNoms.size());

        //Ensuite, c'est la PPPPPPUUUURRRRGGGGGGEEEEEE
        listeNoms.clear();

        //Vérifiez si la liste est vide : true
        System.out.println(listeNoms.isEmpty());
    }
}
