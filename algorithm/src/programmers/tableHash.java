package programmers;
import java.util.Arrays;
class Solution57 {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        
        // 2���� �迭 data ����
        Arrays.sort(data,(o1,o2)->{
           if(o1[col-1] == o2[col-1]) return o2[0]-o1[0]; 
           return o1[col-1]-o2[col-1];
        });
        
        // XOR ����
        for(int i=row_begin-1;i<row_end;i++) {
            int sum = 0;
            for(int j=0;j<data[i].length;j++) {
                sum += data[i][j] % (i+1);
            }
            answer ^= sum;
        }

        return answer;
    }
}
public class tableHash {
	public static void main(String[] args) {
		Solution57 sol = new Solution57();
		int[][] data = {{2,2,6},{1,5,10},{4,2,9},{3,8,3}};
		int col = 2, row_begin = 2, row_end = 3, result = 4;
		
		System.out.println("2���� �迭 data�� ���� : ");
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) System.out.println(data[i][j]);
			System.out.println(" ");
		}
		System.out.println("data�� "+row_begin+"����� "+row_end+"����� XOR ���� ��� : "+sol.solution(data, col, row_begin, row_end));
	}
}