public class Programmers_correct {
    boolean main(String s) {

        /*
        String s라는 문자열이 주어졌을 때 문자열은 괄호 ()가 되어야됨
        1. 문자열의 첫 시작은 "(" 마지막은 ")"
        2. 그러면 탐색이 필요한가? 맨 마지막 부분을 확인하는 로직을 구현해볼까
        3. 굳이 asnwer이라는 변수가 필요할까 시간 복잡도는 어떻게 잡아야하지? O(n)?
        4. 스택과 관련된 문제라 그런지 테스트케이스 12개는 다 통과했으나 효율성 테스트 1,2에서 떨어짐
        -> 그런데 효율성은 스택에서 push, pop을 사용하는 것보다 좋음 효율성 테스트 시간초과가 나는 이유 -> 스택 객체를 사용하지 않아서 인 것 같음.
         */

        int count = 0;

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) =='(')
            {
                count++;
            }
            else count--;

            if(count<0) return false;
        }
        return count == 0;
    }
}
