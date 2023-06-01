package programmers;
import java.util.Arrays;
class Solution38 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int l1 = arr1.length, l2 = arr2[0].length, l3 = arr1[0].length;
        int[][] answer = new int[l1][l2];
        
        for(int i=0;i<l1;i++){
            for(int j=0;j<l2;j++){
                for(int k=0;k<l3;k++){
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }
}
public class MultiOfMatrix {
	public static void main(String[] args) {
		Solution38 sol = new Solution38();
		int x[][] = {{1,4},{3,2},{4,1}};
		int y[][] = {{3,3},{3,3}};
		System.out.println("배열 x : "+Arrays.deepToString(x));
		System.out.println("배열 y : "+Arrays.deepToString(y));
		System.out.println("x와 y의 곱 : "+Arrays.deepToString(sol.solution(x, y)));
	}
}