import java.util.Arrays;
public class Display {
    public static void displayArray(){
        int[] arrayOfInt = RandomArray.generateRandomArray();
        System.out.println("Unsorted array: " + Arrays.toString(arrayOfInt));
        long start = System.nanoTime();
        BubbleSort.bubbleSort(arrayOfInt);
        long end = System.nanoTime() - start;
        System.out.println("Sorted array using bubble sort: " + Arrays.toString(arrayOfInt) + "| Take: " + end + "ns");
        //
        long start_enhance = System.nanoTime();
        BubbleSort.enhanceBubbleSort(arrayOfInt);
        long end_enhance = System.nanoTime() - start_enhance;
        System.out.println("Sorted array using enhance bubble sort: " + Arrays.toString(arrayOfInt) + "| Take: " + end_enhance + "ns");
    }
}
