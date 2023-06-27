package programmers;
import java.util.Stack;
class Solution36 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stk = new Stack<>();
        for(int i=numbers.length-1;i>=0;i--){
            while(!stk.isEmpty()) {
                if(stk.peek() > numbers[i]){
                    answer[i] = stk.peek(); break;
                }
                else stk.pop();
            }
            if(stk.isEmpty()) answer[i] = -1;
            stk.push(numbers[i]);
        }
        return answer;
    }
}
public class backBigNum {
	public static void main(String[] args) {
		Solution36 sol = new Solution36();
		int[] numbers = {2, 3, 3, 5};
		System.out.println("µÞ Å« ¼ö : ");
		for(int i=0;i<numbers.length;i++) System.out.println(sol.solution(numbers)[i]);
	}
}