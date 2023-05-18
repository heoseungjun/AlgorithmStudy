package programmers;
import java.util.Stack;
class Solution33 {
    boolean solution(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==40) stk.push(s.charAt(i));
            else {
                if(stk.isEmpty()) return false;
                stk.pop();
            }
        }
        return stk.isEmpty();
    }
}
public class rightParenthesis {
	public static void main(String[] args) {
		Solution33 sol = new Solution33();
		String s1 = "(())()";
		String s2 = "(()(";
		if(sol.solution(s1)==true) {
			if(sol.solution(s2)==true) System.out.println(s1+"��"+s2+"�� �ùٸ� ��ȣ�Դϴ�.");
			else System.out.println(s1+"�� �ùٸ� ��ȣ, "+s2+"�� �ùٸ��� ���� ��ȣ�Դϴ�.");
		}
		else {
			if(sol.solution(s2)==true) System.out.println(s2+"�� �ùٸ� ��ȣ, "+s1+"�� �ùٸ��� ���� ��ȣ�Դϴ�.");
			else System.out.println(s1+"��"+s2+"�� ��� �ùٸ��� ���� ��ȣ�Դϴ�.");
		}
	}
}