package programmers;
class Solution29 {
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        int[] len = new int[N];
        for(int i=0;i<road.length;i++){
            int start = road[i][0]; int target = road[i][1]; int dist = road[i][2];
            if(start == 1) len[target-2] = dist;
            else{
                if(len[target-2] == 0) len[target-2] = len[start-2] + dist;
                else{
                    if(len[target-2]+dist < len[start-1]) len[start-1] = len[target-2] + dist;
                }
            }
        }
        for(int i=0;i<len.length;i++) {
            if(len[i] <= K) answer++;
        }

        return answer;
    }
}
public class delivery {
	public static void main(String[] args) {
		Solution29 sol = new Solution29();
		int n = 5;
		int[][] road = {
				{1,2,1},
				{2,3,3},
				{5,2,2},
				{1,4,2},
				{5,3,1},
				{5,4,2}
		};
		int k = 3;
		System.out.println("배달 거리가 "+k+"이하인 마을의 개수 : "+sol.solution(n, road, k));
	}
}
