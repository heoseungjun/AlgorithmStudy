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
		
		System.out.println("구명보트 탑승 인원의 몸무게 : ");
		for(int i=0;i<weight.length;i++) System.out.println(weight[i]);
		
		System.out.println("\n최소로 필요한 구명보트 수 : "+sol.solution(weight,limit));
	}
}