import java.util.Random;
public class Deck{
    Random rand = new Random();
    int cards;
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private int[][] cardVals;
    public Deck(int cards) {
        this.cards = cards;
        addCards();
    }
    public void addCards() {
        cardVals = new int[cards][2];
        for (int i = 0; i < cards; i++) {
            int[] newCard = new int[2];
            boolean inCards = true;
            while (inCards) {
                inCards = false;
                newCard = new int[]{rand.nextInt(4), rand.nextInt(14)};
                for (int j = 0; j < cardVals.length; j++) {
                    if (cardVals[j] == newCard) {
                        inCards = true;
                        break;
                    }
                }
            }
            System.out.println(decodeCard(newCard));
        }
    }
    public String decodeCard (int[] card) {
        switch(card[1]) {
            case 1:
                return "Ace of " + suits[card[0]];
            case 11:
                return "Jack of " + suits[card[0]];
            case 12:
                return "Queen of " + suits[card[0]];
            case 13:
                return "King of " + suits[card[0]];
            default:
                return card[1] + " of " + suits[card[0]];
        }
    }
}
