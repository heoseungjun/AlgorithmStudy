package programmers;
class Solution34 {
	int solution(int[][] land) {
        int answer = 0, tmp = 0, pre = 0;
        
        for(int i=0;i<land.length;i++){
            int max = land[i][0];
            for(int j=1;j<land[0].length;j++){
                if(max<land[i][j] && j!=pre) {
                    max = land[i][j];
                    tmp = j;
                }
            }
            pre = tmp;
            answer += max;
        }
        return answer;
    }
}
public class landGame {
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		int[][] land = {
				{1,2,3,5},
				{5,6,7,8},
				{4,3,2,1}
		};
		System.out.println("땅따먹기에서 얻은 최고 점수 : "+sol.solution(land));
	}
}