import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        System.out.print("Enter the String : ");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String b = reverseUsingMyMethod(str);
        String c = reverseUsingStringBuilder(str);
        System.out.println(b);
        if (b.equals(c)) {
            System.out.println("Strings are Equal...");
        }
    }


    public static String reverseUsingMyMethod(String str) {
        int len = str.length();
        char[] st = new char[len];

        for (int i = 0; i < len; i++) {
            st[i] = str.charAt(i);
        }

        for (int j = 0, k = len - 1; j < k; j++, k--)

        {
            char temp = st[j];
            st[j] = st[k];
            st[k] = temp;

        }

        return new String(st);

    }

    public static String reverseUsingStringBuilder(String s) {
        StringBuilder b = new StringBuilder(s);
        return b.reverse().toString();
    }
}