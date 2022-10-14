import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Main {
    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();
    public static void main(String[] args) {
        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        PrintGameBoard(gameBoard);

        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Your Placement (1-9): ");
            int playerPos = scan.nextInt();

            while(playerPositions.contains(playerPos) || cpuPositions.contains(playerPos)){
                System.out.println("Position Taken! Enter a Correct Position");
                playerPos = scan.nextInt();
            }

            PlacePiece(gameBoard, playerPos, "Player");

            String result = CheckWinner(gameBoard);
            if(result.length() > 0){
                System.out.println(result);
                break;
            }


            Random rand = new Random();
            int cpuPos = rand.nextInt(9) + 1;
            while(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)){
                cpuPos = rand.nextInt(9) + 1;
            }
            PlacePiece(gameBoard, cpuPos, "Computer");

            PrintGameBoard(gameBoard);

            result = CheckWinner(gameBoard);
            if(result.length() > 0){
                System.out.println(result);
                break;
            }

        }

    }

    public static void PrintGameBoard(char[][] gameBoard)
    {
        for(char[] row: gameBoard){
            for(char c: row){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void PlacePiece(char[][] gameBoard, int pos, String user)
    {
        char symbol = ' ';

        if(user.equals("Player")){
            symbol = 'X';
            playerPositions.add((pos));
        }
        else if(user.equals("Computer")){
            symbol = 'O';
            cpuPositions.add((pos));
        }
        switch (pos){
            case 1:
                gameBoard[0][0] = symbol;
                break;

            case 2:
                gameBoard[0][2] = symbol;
                break;

            case 3:
                gameBoard[0][4] = symbol;
                break;

            case 4:
                gameBoard[2][0] = symbol;
                break;

            case 5:
                gameBoard[2][2] = symbol;
                break;

            case 6:
                gameBoard[2][4] = symbol;
                break;

            case 7:
                gameBoard[4][0] = symbol;
                break;

            case 8:
                gameBoard[4][2] = symbol;
                break;

            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }

    public static String CheckWinner(char[][] gameBoard)
    {
        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);
        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(7, 5, 3);

        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);

        for(List l : winning){
            if(playerPositions.containsAll(l)){
                PrintGameBoard(gameBoard);
                return  "Congratulations, You WON !";
            }
            else if(cpuPositions.containsAll(l)){
                PrintGameBoard(gameBoard);
                return "You LOSE !";
            }
            else if(playerPositions.size() + cpuPositions.size() == 9){
                PrintGameBoard(gameBoard);
                return "It's TIE !";
            }
        }

        return "";
    }
}