package programmers;
import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        // �ε����� �������� ���� 2���� �迭 ����
        double[][] list = new double[N][2];
        // ������ ���� prob
        double prob = 0;
        // �������� ���ڸ� ��Ÿ���� ���� success
        int success = 0;
        // �������� ��ȣ�� ��Ÿ���� ���� num
        int num = 1;
        // �迭 stages�� ���� ���� len
        int len = stages.length;
        
        // 2���� �迭 list�� ù��° �����࿡ 1~N���� ����
        for(int i=0;i<N;i++) list[i][0] = i+1;
        
        // stages�� ���Ұ� num�� ���� ���� ��� ���Ͽ� ������ ��� (num�� 1�� ����)
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
        
        // list�� �������� ���� ������������ ����
        Arrays.sort(list, new Comparator<double[]>() {
            public int compare(double[] o1, double[] o2){
                return Double.compare(o1[1],o2[1]);
            }
        });
        
        // return�� �迭 answer�� list�� ù��° ������(���ĵ� �ε���) ����
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
