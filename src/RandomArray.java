import java.util.Random;
public class RandomArray {
    public static int[] generateRandomArray(){
        Random randomValue = new Random();
        System.out.print("Enter number of array: ");
        int n = Validation.checkInt();
        int[] arrayOfInt = new int[n];
        for (int i = 0; i < n; i++){
            arrayOfInt[i] = randomValue.nextInt(10001);
        }
        return arrayOfInt;
    }
}
