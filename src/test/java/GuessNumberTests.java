import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

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
    public void Get_Guess_Result()
    {
        ArrayList<Integer> lists = new ArrayList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
        }};
        GenerateNumber mock = Mockito.mock(GenerateNumber.class);
        Mockito.when(mock.GenerateRandomNumbers()).thenReturn(lists);
        ProcessGuess processGuess = new ProcessGuess(mock);
        Assert.assertEquals("0A3B", processGuess.Guess(new String[]{"2","3","1","5"}));
        Assert.assertEquals("1A1B", processGuess.Guess(new String[]{"1","3","5","6"}));
        Assert.assertEquals("0A1B", processGuess.Guess(new String[]{"8","7","1","5"}));
    }
}

