import java.util.Scanner;

public class StringArrays {
    public static void main(String[] args) {
        System.out.print("Enter the String : ");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int len = str.length();
        String[] arr = new String[len / 2];
        int x = 0;
        if (len % 2 != 0) {
            x = len - 1;
        } else {
            x = len;
        }
        for (int i = 0; i < x; i = i + 2) {
            arr[i / 2] = Character.toString(str.charAt(i)) + Character.toString(str.charAt(i + 1));
        }

        for (int i = 0; i < len / 2; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
