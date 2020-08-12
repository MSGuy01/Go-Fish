public class Game {
    public Deck player;
    public Deck computer;
    public Game() {
        System.out.println("***PLAYER***");
        player = new Deck(8);
        System.out.println("***COMPUTER***");
        computer = new Deck(8);
    }
}
