import org.junit.Assert;
import org.junit.Test;

public class GuessNumberTests {
    @Test
    public void Get_Random_Numbers() {
        GuessNumber mock = new GuessNumber();
        var randomNumbers = mock.GenerateRandomNumbers();
        var it = randomNumbers.iterator();
        Assert.assertEquals(4, randomNumbers.size());
        while (it.hasNext())
        {
            Assert.assertTrue(it.next()<=9 && it.next()>=0);
        }
    }
}

