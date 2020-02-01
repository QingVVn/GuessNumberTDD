import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class GuessNumberTests {
    @Test
    public void Get_Random_Numbers() {
        GenerateNumber mock = new GenerateNumber();
        var randomNumbers = mock.GenerateRandomNumbers();
        var it = randomNumbers.iterator();
        Assert.assertEquals(4, randomNumbers.size());
        while (it.hasNext())
        {
            Assert.assertTrue(it.next()<=9 && it.next()>=0);
        }
    }

    @Test
    public void Get_Guess_Result() {
        GuessNumber guessNumber = new GuessNumber();
        ArrayList<Integer> lists = new ArrayList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
        }};
        Assert.assertEquals("0A3B", guessNumber.Guess("2 3 1 5", lists));
        Assert.assertEquals("1A1B", guessNumber.Guess("1 3 5 6", lists));
        Assert.assertEquals("0A1B", guessNumber.Guess("8 7 1 5", lists));
    }
}

