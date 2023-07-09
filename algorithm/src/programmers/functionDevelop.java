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
			System.out.println("���� �۾� ���� : "+progress[i]+" �ش� �۾� �ӵ� : "+speed[i]);
		}
		System.out.println("�ð� �帧�� ���� ���� ��� �� : ");
		for(int i=0;i<sol.solution(progress, speed).length;i++) {
			System.out.println(sol.solution(progress, speed)[i]);
		}
	}
}