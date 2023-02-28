package programmers;
import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        // 인덱스와 성공률을 담을 2차원 배열 생성
        double[][] list = new double[N][2];
        // 성공률 변수 prob
        double prob = 0;
        // 성공률의 분자를 나타내는 변수 success
        int success = 0;
        // 스테이지 번호를 나타내는 변수 num
        int num = 1;
        // 배열 stages의 길이 변수 len
        int len = stages.length;
        
        // 2차원 배열 list의 첫번째 세로축에 1~N까지 삽입
        for(int i=0;i<N;i++) list[i][0] = i+1;
        
        // stages의 원소가 num과 같을 때를 모두 구하여 성공률 계산 (num은 1씩 증가)
        for(int x=0,y=0;x<stages.length;x++){
            if(num>N) break;
            if(stages[x]==num) success++;
            if(x==stages.length-1){
                prob = (double)(len-success)/len;
                list[y++][1] = prob;
                len-=success;
                success=0;
                x=-1;
                num++;
            }
        }
        
        // list를 성공률에 따라 오름차순으로 정렬
        Arrays.sort(list, new Comparator<double[]>() {
            public int compare(double[] o1, double[] o2){
                return Double.compare(o1[1],o2[1]);
            }
        });
        
        // return할 배열 answer에 list의 첫번째 세로축(정렬된 인덱스) 삽입
        for(int j=0;j<N;j++) answer[j] = (int)list[j][0];
        return answer;
    }
}

public class fail {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int N = 4;
		int[] arr = {4,4,4,4};
		for(int i=0;i<4;i++) System.out.println(sol.solution(N, arr)[i]);
	}
}
