import java.util.Scanner;

public class Gamer {
    static int numOfDraws;
    static int numOfTrials;
    int numOfWins;
    String name;
    HandSign sign;

    public Gamer(String name){
        this.name = name;
    }

    void move(){
        if(Game.isGameOver) return;
        boolean isInvalidInput = false;
        Scanner input = new Scanner(System.in);
        System.out.println(this.name + " please enter r: rock p: paper s: scissors q: quit");

        do {
            char inChar = input.next().toLowerCase().charAt(0);
            switch (inChar){
                case 'q':
                    Game.isGameOver = true;
                    break;
                case 'r':
                    this.sign = HandSign.ROCK;
                    break;
                case 'p':
                    this.sign = HandSign.PAPER;
                    break;
                case 's':
                    this.sign = HandSign.SCISSORS;
                    break;
                default:
                    System.out.println("your input is invalid. Please try again.");
                    isInvalidInput = true;
                    break;
            }
        }
        while (isInvalidInput);
    }
}
