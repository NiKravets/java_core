import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = 1;
        Shift(array, n);
        System.out.println(Arrays.toString(array));

    }

    public static void Shift(int[] array, int n) {
        int length = array.length;

        if (n < 0) {
            n = n % length + length;
        }

        if (n >= length) {
            n = n % length;
        }

        int[] shiftArray = new int[length];

        for (int i = 0; i < length; i++) {
            int newIndex = (i + n) % length;
            shiftArray[newIndex] = array[i];
        }

        System.arraycopy(shiftArray, 0, array, 0, length);
    }

}
