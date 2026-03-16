public class JeuDeCarte {
    private Carte[] deck;
    private final int MAX_CARTE = 52;

    public JeuDeCarte() {
        this.deck = new Carte[MAX_CARTE];

        int index = 0;
        for (Couleur couleur : Couleur.values()) {
            for (Valeur valeur : Valeur.values()) {
                deck[index] = new Carte(couleur, valeur);
                index++;
            }
        }
    }

    public void seeDeck() {
        for (Carte carte : deck) {
            System.out.println(carte.getValeur() + " " + carte.getCouleur());
        }
    }
}