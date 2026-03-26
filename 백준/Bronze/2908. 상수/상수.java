import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s);
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        String reversedA = new StringBuilder(String.valueOf(A)).reverse().toString();
        String reversedB = new StringBuilder(String.valueOf(B)).reverse().toString();

        int numA = Integer.parseInt(reversedA);
        int numB = Integer.parseInt(reversedB);

        if (numA > numB) {
            System.out.println(reversedA);
        } else {
            System.out.println(reversedB);
        }
    }
}
