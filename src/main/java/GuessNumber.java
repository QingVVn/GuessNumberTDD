import java.util.Random;

public class GuessNumber {

    public static void main(String[] arg)
    {
        InputControl inputControl = new InputControl();
        GenerateNumber generateNumber = new GenerateNumber();
        ProcessGuess processGuess = new ProcessGuess(generateNumber);
        StartGame startGame = new StartGame();
        startGame.Start(inputControl, processGuess);
        System.out.println("Game stopped");
    }
}
