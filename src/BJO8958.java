import java.util.Scanner;

public class BJO8958 {
    public static void main(String[] args) {
        //*문제 파악 먼저 하고 코드작성*
        /*
        1. 문제 파악
        2. 파악한 문제를 기반으로 어떻게 코드작성할 지 설계
        -> (1)스캐너 객체 이용 >> 테스트 케이스 입력받기
        -> (2)입력받은 n개의 개수만큼 반복문 구현
        -> (3)2번에 구현한 반복문 내부에서 OX 퀴즈 입력받기
        -> (4)입력받은 문자열에서 문자마다 조건문 이용하여 O,X파악
         */
        Scanner sc = new Scanner(System.in);

        int score = 0; //총 점수
        int initNum = 0; //초기화 점수

        int a = Integer.parseInt(sc.nextLine());

        for(int i=1; i<=a; i++)
        {
            String s = sc.nextLine();

            for(int j=0; j<s.length(); j++)
            {
                if(s.charAt(j) == 'O')
                {
                    initNum++;
                }
                else initNum = 0;
                score += initNum;
            }
            initNum = 0;
            System.out.println(score);
            score = 0;
        }
        sc.close();
    }
}
