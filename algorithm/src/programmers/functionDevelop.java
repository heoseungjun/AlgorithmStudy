package programmers;
import java.util.Stack;
import java.util.ArrayList;
class Solution47 {
    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> stk = new Stack<>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int work = 0, cnt = 1;
        for(int i=0;i<progresses.length;i++) {
            work = (100-progresses[i]) / speeds[i];
            if((100-progresses[i]) % speeds[i] != 0) work += 1;
            if(stk.isEmpty() || stk.peek() < work) {
                stk.push(work); cnt = 1; list.add(cnt);
            }
            else {
                list.set(list.size()-1,++cnt);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=stk.size()-1;i>=0;i--) answer[i] = list.get(i);
        return answer;
    }
}
public class functionDevelop {
	public static void main(String[] args) {
		Solution47 sol = new Solution47();
		int[] progress = {95,30,55};
		int[] speed = {1,30,5};
		for(int i=0;i<progress.length;i++) {
			System.out.println("현재 작업 진도 : "+progress[i]+" 해당 작업 속도 : "+speed[i]);
		}
		System.out.println("시간 흐름에 따른 개발 기능 수 : ");
		for(int i=0;i<sol.solution(progress, speed).length;i++) {
			System.out.println(sol.solution(progress, speed)[i]);
		}
	}
}