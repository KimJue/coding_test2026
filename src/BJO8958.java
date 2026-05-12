import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BJO8958 {
    public static void main(String[] args) throws IOException {
        //*문제 파악 먼저 하고 코드작성*
        /*
        1. 문제 파악
        2. 파악한 문제를 기반으로 어떻게 코드작성할 지 설계
        -> (1)스캐너 객체 이용 >> 테스트 케이스 입력받기
        -> (2)입력받은 n개의 개수만큼 반복문 구현
        -> (3)2번에 구현한 반복문 내부에서 OX 퀴즈 입력받기
        -> (4)입력받은 문자열에서 문자마다 조건문 이용하여 O,X파악
        3. Scanner보다는 BufferedReader가 낫지 않나? / StringBuilder
         */
        // exam1();
        exam2();


    }

    private static void exam2() throws IOException {
        System.out.println("버퍼드리더, 스트링빌더 사용");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++)
        {
            int score = 0;
            int initNum = 0;

            char[] cr = br.readLine().toCharArray();
            for(int j=0; j<cr.length; j++)
            {
                if(cr[j] == 'O') initNum++;
                else initNum = 0;
                score += initNum;
            }

            sb.append(score).append('\n');

        }
        System.out.println(sb);

        br.close();
    }

    private static void exam1() {
        System.out.println("스캐너 사용");
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());

        for(int i=1; i<=a; i++)
        {
            String s = sc.nextLine();
            int score = 0; // 총 점수
            int initNum = 0; // O 점수
            for(int j=0; j<s.length(); j++)
            {
                if(s.charAt(j) == 'O')
                {
                    initNum++;
                }
                else initNum = 0;
                score += initNum;
            }
            System.out.println(score);
        }
        sc.close();
    }
}
