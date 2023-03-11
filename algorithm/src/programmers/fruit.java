package programmers;
import java.util.Arrays;
class Solution7 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for(int i=score.length-1;i>=0;i--){
            if((score.length-i)%m==0) answer += score[i]*m;
        }
        return answer;
    }
}

public class fruit {
	public static void main(String[] args) {
		Solution7 sol = new Solution7();
		int[] score = {1, 2, 3, 1, 2, 3, 1};
		System.out.println(sol.solution(3,4,score));
	}
}
