public class StartGame {
    private static final int GameTimes = 6;
    public static void Start(InputControl inputControl, ProcessGuess processGuess) {
        int CurrentTime = inputControl.GetTime();
        while (inputControl.GetTime() < GameTimes)
        {
            var input = inputControl.GetInput();
            inputControl.SetTime(CurrentTime++);
            if(input==null)
            {
                inputControl.Print(inputControl.WrongInputMessage);
            }
            else
            {
                System.out.println(processGuess.Guess(input));
            }
        }
    }
}
