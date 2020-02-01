import java.util.ArrayList;
import java.util.Arrays;

public class ProcessGuess {
    private int randomCount = 0;
    private GenerateResult generateResult;
    private ArrayList<Integer> random;

    public  ProcessGuess(GenerateNumber generateNumber)
    {
        this.random = generateNumber.GenerateRandomNumbers();
    }
    public String Guess(String[] input)
    {
        StartNewRound();
        Arrays.stream(input).forEach(i->
        {
            UpdateNumber(i);
            randomCount++;
        });

        return generateResult.GetResult();
    }

    private void UpdateNumber(String i) {
        if(i.equals(random.get(randomCount).toString()))
        {
            generateResult.setAllCorrectNumber();
            return;
        }
        if(random.contains(Integer.parseInt(i)))
        {
            generateResult.setValueCorrectNumber();
        }
    }

    private void StartNewRound()
    {
        randomCount =0;
        generateResult = new GenerateResult();
    }
}
