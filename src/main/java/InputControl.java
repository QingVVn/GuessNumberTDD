import java.util.Scanner;
import java.util.stream.Stream;

public class InputControl {
    private int times = 1;
    private final String inputMessage = "Please input the number you guessed:";
    public final String WrongInputMessage = "Wrong Input";

    public void SetTime(int time)
    {
        this.times = time;
    }
    public int GetTime()
    {
        return this.times;
    }

    public String[] GetInput()
    {
        Print(inputMessage);
        String[] receiveInput = new Scanner(System.in).nextLine().split(" ");
        boolean isValid =  receiveInput.length==4 && Stream.of(receiveInput).allMatch(s->s.matches("^[0-9]"));
        return isValid ? receiveInput : null;
    }

    public void Print(String message)
    {
        System.out.println(message);
    }
}
