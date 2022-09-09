import java.util.Arrays;
public class Display {
    public static void displayArray(){
        int[] arrayOfInt1 = RandomArray.generateRandomArray();
        System.out.println("Unsorted array: " + Arrays.toString(arrayOfInt1));
        
        long start = System.nanoTime();
        BubbleSort.bubbleSort(arrayOfInt1);
        long end = System.nanoTime() - start;
        System.out.println("Sorted array using bubble sort: " + Arrays.toString(arrayOfInt1) + "| Take: " + end + "ns");
        //
        int[] arrayOfInt2 = RandomArray.generateRandomArray();
        System.out.println("Unsorted array: " + Arrays.toString(arrayOfInt1));
        long start_enhance = System.nanoTime();
        BubbleSort.enhanceBubbleSort(arrayOfInt2);
        long end_enhance = System.nanoTime() - start_enhance;
        System.out.println("Sorted array using enhance bubble sort: " + Arrays.toString(arrayOfInt2) + "| Take: " + end_enhance + "ns");
    }
}
