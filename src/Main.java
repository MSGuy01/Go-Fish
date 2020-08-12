import processing.core.*;
import java.util.Random;

public class Main extends PApplet{
    PImage[] cardImages = new PImage[52];
    String[] cardNames = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    String[] suitNames = {"C", "D", "H", "S"};

    Random rand = new Random();

    public int[][] takenCards = new int[52][2];
    int center = 500;
    public static void main(String[] args) {
        PApplet.main("Main");
        new Game();
    }
    public void settings() {
        size(1300, 1000);
    }
    public void setup() {
        int j = 0;
        int k = 0;
        for (int i = 0; i < cardImages.length; i++) {
            System.out.println("cardImages/" + cardNames[j] + suitNames[k] + ".png");
            cardImages[i] = loadImage("cardImages/" + cardNames[j] + suitNames[k] + ".png");
            j++;
            if (j == cardNames.length) {
                j = 0;
                k++;
            }
        }
        background(255, 255, 255);
        fill(0);
        textSize(100);
        text("LOADING IMAGES...", center, 100);
        int y = 0;
        int x = 0;
        for (int i = 0; i < cardImages.length; i++) {
            image(cardImages[i], x * 100, y, 100, 200);
            x++;
            if (x == 13) {
                x = 0;
                y += 200;
            }
        }
    }
    public void draw() {

    }
}
