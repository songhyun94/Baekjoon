import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // 시
        int b = sc.nextInt();  // 분
        int c = sc.nextInt();  // 조리시간

        b = a * 60 + b + c;
        a = b / 60;
        b = b % 60;

        if (a >= 24) {
            a = a % 24;
        }

        System.out.println(a + " " + b);
    }
}