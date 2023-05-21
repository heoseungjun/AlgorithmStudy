package programmers;
import java.lang.Math;
class Solution34 {
    int solution(int[][] land) {
        int answer = 0;
        for(int i=1;i<land.length;i++){
            land[i][0] += Math.max(land[i-1][1],Math.max(land[i-1][2],land[i-1][3]));
            land[i][1] += Math.max(land[i-1][0],Math.max(land[i-1][2],land[i-1][3]));
            land[i][2] += Math.max(land[i-1][0],Math.max(land[i-1][1],land[i-1][3]));
            land[i][3] += Math.max(land[i-1][0],Math.max(land[i-1][1],land[i-1][2]));
        }
        
        for(int i=0;i<4;i++){
            answer = Math.max(answer,land[land.length-1][i]);
        }
        return answer;
    }
}
public class landGame {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		int[][] land = {
				{1,2,3,4},
				{6,7,4,5},
				{3,9,5,7}
		};
		System.out.println("땅따먹기에서 얻은 최고 점수 : "+sol.solution(land));
	}
}