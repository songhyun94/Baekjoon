import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();

            boolean[] visited = new boolean[26];

            boolean isGroupWord = true;
            char prev = 0;

            for (int j = 0; j < word.length(); j++) {
                char current = word.charAt(j);

                if (current != prev) {
                    if (visited[current - 'a']) {
                        isGroupWord = false;
                        break;
                    }
                    visited[current - 'a'] = true;
                }
                prev = current;
            }
            if (isGroupWord) {
                count++;
            }
        }
        System.out.println(count);
    }
}
