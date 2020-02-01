import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class GuessNumber {
    public static void main(String[] arg)
    {
        int i=0;
        GenerateNumber generateNumber  = new GenerateNumber();
        ArrayList<Integer> randomNumbers = generateNumber.GenerateRandomNumbers();
        System.out.println(randomNumbers);
        System.out.println("Please input four numbers within 0-10 you guessed:");
        while (i<6)
        {
            String input = new Scanner(System.in).nextLine();
            if(!isValid(input))
            {
                System.out.println("Wrong input");
            }
            else
            {
                System.out.println(Guess(input,randomNumbers));
            }
            i++;
        }
        System.out.println("Game stopped");
    }

    public static boolean isValid(String input)
    {
        var list = input.split(" ");
        return list.length==4 && Stream.of(list).allMatch(s->s.matches("^[0-9]"));
    }

    public static String Guess(String input, ArrayList<Integer> randomNumbers)
    {
        var list = input.split(" ");
        var allCorrectNumber = 0;
        var valueCorrect = 0;
        for (int i=0; i<4; i++)
        {
            if(list[i].equals(randomNumbers.get(i).toString()))
            {
                allCorrectNumber++;
                continue;
            }
            if(randomNumbers.contains(Integer.parseInt(list[i])))
            {
                valueCorrect++;
            }
        }

        return allCorrectNumber +"A"+valueCorrect+"B";
    }
}
