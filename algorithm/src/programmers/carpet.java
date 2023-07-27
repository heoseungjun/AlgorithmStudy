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
		
		System.out.println("갈색 타일이 "+brown+"개, 노란 타일이 "+yellow+"개인 타일의");
		System.out.println("가로 길이 : "+sol.solution(brown, yellow)[0]+" | 세로 길이 : "+sol.solution(brown, yellow)[1]);
	}
}