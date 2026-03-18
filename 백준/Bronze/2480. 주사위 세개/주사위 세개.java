import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // 첫번째 주사위
        int b = sc.nextInt();  // 두번째 주사위
        int c = sc.nextInt();  // 세번째 주사위

        long prize = 0;

        if (a == b && b == c) {
            prize = 10000 + a * 1000;
        } else if (a != b && a == c) {
            prize = 1000 + a * 100;
        } else if (a != c && a == b) {
            prize = 1000 + b * 100;
        } else if (a != b && b == c) {
            prize = 1000 + b * 100;
        } else if (a != c && a != b) {
            if (a > b && a > c) {
                prize = a * 100;
            }else if(b > a && b > c) {
                prize = b * 100;
            }else if(c > a && c > b) {
                prize = c * 100;
            }
        }
        System.out.println(prize);
    }
}