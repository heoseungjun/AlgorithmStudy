package programmers;
import java.util.Arrays;
class Solution52 {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer = 0, l = 0, r = people.length-1;
        while(l<=r) {
            answer++;
            if(people[l] + people[r] <= limit) {
                l++; r--;
            }
            else r--;
        }
        return answer;
    }
}
public class rescueBoat {
	public static void main(String[] args) {
		Solution52 sol = new Solution52();
		int[] weight = {70, 50, 80, 50};
		int limit = 100;
		
		System.out.println("����Ʈ ž�� �ο��� ������ : ");
		for(int i=0;i<weight.length;i++) System.out.println(weight[i]);
		
		System.out.println("\n�ּҷ� �ʿ��� ����Ʈ �� : "+sol.solution(weight,limit));
	}
}