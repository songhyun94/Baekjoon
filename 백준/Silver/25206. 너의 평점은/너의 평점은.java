import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
   
    public static double getGradePoint(String grade) {
        switch (grade) {
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            case "F":
                return 0.0;
            default:
                return -1.0; 
        }
    }
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double totalScore = 0.0;   
        double totalCredit = 0.0;  
        
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String subject = st.nextToken();     
            double credit = Double.parseDouble(st.nextToken()); 
            String grade = st.nextToken();       

            // P는 계산에서 제외
            if (grade.equals("P")) {
                continue;
            }

            double gradePoint = getGradePoint(grade);

            totalScore += credit * gradePoint;
            totalCredit += credit;
        }

        double gpa = totalScore / totalCredit;
        System.out.printf("%.6f\n", gpa);
    }
}