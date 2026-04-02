import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N =  st.nextToken();
        int B =  Integer.parseInt(st.nextToken());
        
        int result = 0;
        
        for (int i = 0; i < N.length(); i++) {
            char ch = N.charAt(i);
            int value;
            
            if (ch >= '0' && ch <= '9') {
                value = ch - '0';
            }
            
            else {
                value = ch - 'A' + 10;
            }
            
            result = result * B + value;
        }

        System.out.println(result);
    }
}