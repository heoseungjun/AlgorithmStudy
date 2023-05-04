package programmers;
import java.util.Stack;
class Solution26 {
	public int solution(String s){
        int answer = 0;
        Stack<Character> stk = new Stack<>();
        stk.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char c = s.charAt(i);
            if(stk.isEmpty() || stk.peek()!=c) stk.push(c);
            else if(stk.peek()==c) stk.pop();
        }
        if(stk.isEmpty()) answer = 1;
        return answer;
    }
}
public class pairRemove {
	public static void main(String[] args) {
		Solution26 sol = new Solution26();
		String s = "baabaa";
		if(sol.solution(s)==1) System.out.println("모든 문자열이 제거되었습니다.");
		else System.out.println("제거되지 않은 문자열이 있습니다.");
	}
}
