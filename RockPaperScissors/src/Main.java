public class Main {
    public static void main(String[] args) {
        Gamer g1 = new Gamer("Player1");
        Gamer g2 = new Gamer("Player2");
        Game game = new Game(g1, g2);
        game.startGame();
    }
}