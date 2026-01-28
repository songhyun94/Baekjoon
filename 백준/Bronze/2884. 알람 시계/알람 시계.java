import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (b < 45) {
            b = b + 60 - 45;
            if (a == 0) {
                a = 24;
            }
            a = a - 1;
        } else{
            b = b - 45;
        }

        System.out.println(a + " " + b);
    }
}