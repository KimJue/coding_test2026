import java.util.ArrayList;

public class Programmers_dont_samenumber {
    public int[] main(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(arr[0]); // arraylist 0번째에 arr[0]을 넣었기 때문에 포문 1부터 시작

        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] != arr[i-1])
            {
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];// list 사이즈만큼 할당

        for(int i=0; i<answer.length; i++)
        {
            answer[i] = list.get(i);
        }
        return answer;

    }
}
