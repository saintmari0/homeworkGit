import java.util.Arrays;

public class MissingNumber {
    public static int missingNumber(int[] numbers){
        int number=0;
        Arrays.sort(numbers);
        for(int i=0; i<numbers.length; i++){
            if(i!=numbers[i]){
                number=i;
                break;
            }
        }
        return number;
    }
}
