import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int hundred = b / 100;    // 백의 자리
        int ten = (b / 10) % 10;  // 십의 자리
        int one = b % 10;         // 일의 자리

        System.out.println(a * one);
        System.out.println(a * ten);
        System.out.println(a * hundred);
        System.out.println(a * one + a * ten * 10 + a * hundred * 100);

    }
}