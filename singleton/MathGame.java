package singleton;

import java.util.Random;
import java.util.Scanner;

public class MathGame {
    private static MathGame mathGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private String[] operands;

    private MathGame() {
        operands = new String[4];
        operands[0] = "+";
        operands[1] = "-";
        operands[2] = "*";
        operands[3] = "/";
        score = 0;
        rand = new Random();
        
        System.out.println("Let's have fun with Math!");
    }

    public static MathGame getInstance(){
        if(mathGame == null){
            mathGame = new MathGame();
        }
        return mathGame;
    }

    public void play(){
        System.out.println("(P)lay or (Q)uit:");
        reader = new Scanner(System.in);
        String ans = reader.next();
        if(ans.equalsIgnoreCase("p")){
            playRound();
        }
        else if(ans.equalsIgnoreCase("q")){
            System.out.println("You won " + score + " games!\nGoodbye");
        }
        else{
            System.out.println("Sorry, you must enter p or q");
            play();
        }
    }

    private boolean playRound(){
        int num1 = 1 + rand.nextInt(100);
        int num2 = 1 + rand.nextInt(100);
        int arrayPick = rand.nextInt(4);
        double correctAnswer;
        System.out.println("\nRound answer to 1 decimal place");
        System.out.println(num1 + " " + operands[arrayPick] + " " + num2 + " =");
        if(arrayPick == 0){
            correctAnswer = num1+num2;
        }
        else if(arrayPick == 1){
            correctAnswer = num1-num2;
        }
        else if(arrayPick == 2){
            correctAnswer = num1*num2;
        }
        else{
            correctAnswer = num1/num2;
        }
        double givenAnswer = reader.nextDouble();
        if(givenAnswer == correctAnswer){
            System.out.println("You got it!");
            score++;
            play();
            return true;
        }
        else{
            System.out.println("The correct answer is: " + correctAnswer);
            play();
            return false;
        }
        
    }
}
