public class Main {
    public static void main(String[] args) {
        Livre psychoBoys = new Livre("Psycho Boys", "Michel", 2025, 450);
        Livre livre1 = new Livre("Livre1", "Manuel", 2026, 300);
        Livre livre2 = new Livre("Livre2", "Jayla", 2025, 150);

        Bibliotheque forgePhoenix = new Bibliotheque("🔥 Forge du Phoenix");
        forgePhoenix.ajouterLivre(psychoBoys);
        forgePhoenix.ajouterLivre(livre1);
        forgePhoenix.ajouterLivre(livre2);
        forgePhoenix.ajouterLivre(livre1); // doublon refusé

        System.out.println("\n--- Emprunts ---");
        forgePhoenix.emprunterLivre("psycho boys");
        forgePhoenix.emprunterLivre("Psycho Boys"); // déjà emprunté
        forgePhoenix.emprunterLivre("Livre10");     // n'existe pas

        System.out.println("\n--- Retour ---");
        forgePhoenix.retournerLivre("Psycho Boys");

        livre2.emprunter();
        forgePhoenix.afficherLivres();

        System.out.printf("%n🏆 Points de gloire du royaume : %d%n", forgePhoenix.getPointsGloire());
    }
}
