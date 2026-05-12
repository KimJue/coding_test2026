import java.util.ArrayList;

public class Programmers_develop {
    public int[] main(int[] progresses, int[] speeds) {

        /*
        1.기능개발 속도에 따라 기능개발 -> int[] speeds
        2.배포는 하루에 한 번 -> If 진도율 95%일 경우 개발 속도가 하루에 4%라면 2일 뒤 배포
        3.progresses[93,30,55] / speeds[1,30,5]일 경우 1번이 완성된 경우가 아니기에 2번째가 먼저 완성 되더라도 7일째에 배포
        -> 7일째에 2개의 기능, 9일째에 1개의 기능이 배포됨
         */

        ArrayList<Integer> list = new ArrayList<>();
        int[] days = new int[progresses.length]; // 각 기능이 완료되는 날짜
        // progress[i] + speeds[i] = 100 -> 배포
        for(int i=0; i<progresses.length; i++)
        {
            int count = 0;
            int progress = progresses[i];

            while(progress<100)
            {
                progress += speeds[i];
                count++; // 몇 일인지
            }

            days[i] = count;

        }


        int current = days[0]; // 현재 배포 날짜
        int deployCount = 1; // 같이 배포되는 개수

        for(int i=1; i<days.length; i++)
        {
            //현재 기준 날짜보다 빨리 끝났으면 배포
            if(days[i] <= current)
            {
                deployCount++;
            }
            else
            {
                //현재 개수 저장
                list.add(deployCount);

                //새로운 배포 시작
                current = days[i];
                deployCount = 1;
            }
        }

        list.add(deployCount); // 마지막 배포 개수

        //어레이리스트 변환
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++)
        {
            answer[i] = list.get(i);
        }
        return answer;

    }
}
