import java.util.Scanner;

public class boj10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        // A+B, A-B, A*B, A/B(몫), A%B(나머지)
        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.println(A % B);

        sc.close();
    }
}
