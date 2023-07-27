package programmers;
class Solution58 {
	public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for(int i=2;i<=(brown+yellow)/2;i++) {
            if((brown+yellow) % i == 0) {
                answer[0] = (brown+yellow) / i; answer[1] = i;
            }
            if((answer[0]-2) * (answer[1] - 2) == yellow) break;
        }
        return answer;
    }
}
public class carpet {
	public static void main(String[] args) {
		Solution58 sol = new Solution58();
		int brown = 10, yellow = 2;
		
		System.out.println("���� Ÿ���� "+brown+"��, ��� Ÿ���� "+yellow+"���� Ÿ����");
		System.out.println("���� ���� : "+sol.solution(brown, yellow)[0]+" | ���� ���� : "+sol.solution(brown, yellow)[1]);
	}
}