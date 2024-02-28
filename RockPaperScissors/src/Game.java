public class Game {
    Gamer g1;
    Gamer g2;
    static boolean isGameOver;

    public Game(Gamer g1, Gamer g2){
        this.g1 = g1;
        this.g2 = g2;
    }

    void startGame(){
        while(!isGameOver){
            g1.move();
            g2.move();
            processMoves();
            displayScores(g1);
            displayScores(g2);
        }
    }

    void processMoves(){
        if(g1 == null || g2 == null || isGameOver) return;
        else if(g1.sign == g2.sign) Gamer.numOfDraws++;
        else if(g1.sign == HandSign.ROCK && g2.sign == HandSign.SCISSORS)
            g1.numOfWins++;
        else if(g1.sign == HandSign.PAPER && g2.sign == HandSign.ROCK)
            g1.numOfWins++;
        else if(g1.sign == HandSign.SCISSORS && g2.sign == HandSign.PAPER)
            g1.numOfWins++;
        else g2.numOfWins++;
        Gamer.numOfTrials++;
    }

    void displayScores(Gamer gamer){
        String data = String.format("name: %s number of wins: %d number " + "of draws: %d number of trials %d", gamer.name, gamer.numOfWins, Gamer.numOfDraws, Gamer.numOfTrials);
        System.out.println(data);
    }
}
