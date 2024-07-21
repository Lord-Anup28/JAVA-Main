import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = facto(n);
        System.out.println(value);
        sc.close();
    }

    public static int facto(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = i * ans;
        }
        return ans;
    }
}
