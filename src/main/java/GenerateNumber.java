import java.util.ArrayList;
import java.util.Random;

public class GenerateNumber {
    public  ArrayList<Integer>  GenerateRandomNumbers(){
        Random ran = new Random();
        ArrayList<Integer> set = new  ArrayList<Integer>();
        while(set.size()==4? false:true) {
            int num = ran.nextInt(10);
            if(!set.contains(num)) {
                set.add(num);
            }
        }
        return set;
    }
}
