import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner inputStringIn = new Scanner(System.in);
        String inputString = inputStringIn.nextLine();
        Scanner keyIn = new Scanner(System.in);
        int key = keyIn.nextInt();
        Scanner encryptIn = new Scanner(System.in);
        boolean encrypt = encryptIn.nextBoolean();
        System.out.println(caesar(inputString, key, encrypt));

    }

    private static String caesar(String in, int key, boolean encrypt) {
        if (in == null || in.isEmpty())
            return null;

        final int len = in.length();
        char[] out = new char[len];
        for (int i = 0; i < len; ++i) {
            out[i] = (char) (in.charAt(i) + ((encrypt) ? key : -key));
        }
        return new String(out);
    }
}
