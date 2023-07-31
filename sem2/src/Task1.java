import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int k = 1000;
        Random rnd = new Random();
        int[] array = new int[1000];
        for (int i = 0; i < array.length; ++i) {
            array[i] = rnd.nextInt(k);
        }
        countsort(array,k);
        System.out.println(Arrays.toString(array));


    }

    public static void countsort(int[] arr, int k){

        int[] output = new int[arr.length];
        int[] buckets = new int[k + 1];

        for (int i: arr) {
            buckets[i]++;
        }

        int total = 0;

        for (int i = 0; i < k + 1; i++)
        {
            int oldCount = buckets[i];
            buckets[i] = total;
            total += oldCount;
        }

        for (int i: arr)
        {
            output[buckets[i]] = i;
            buckets[i]++;
        }

        Arrays.setAll(arr, i -> output[i]);
    }
}
