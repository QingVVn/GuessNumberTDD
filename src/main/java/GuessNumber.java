import java.util.Random;
import java.util.Set;
import java.util.HashSet;
public class GuessNumber {

    public Set<Integer> GenerateRandomNumbers(){
        Random ran = new Random();
            Set <Integer> set = new HashSet<>();
            while(set.size()==4? false:true) {
                int num = ran.nextInt(10);
                if(!set.contains(num)) {
                    set.add(num);
                }
            }

        return set;
    }
}
