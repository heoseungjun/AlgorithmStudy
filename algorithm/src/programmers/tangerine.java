package programmers;
import java.util.*;
class Solution44 {
	public int solution(int k, int[] tangerine) {
        int answer = 0, sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:tangerine) map.put(i,map.getOrDefault(i,0)+1);
        
        List<Integer> list = new ArrayList<Integer>(map.keySet());
        Collections.sort(list, (v1, v2) -> (map.get(v2).compareTo(map.get(v1))));
        
        for(int i=0; i<list.size(); i++) {
            sum += map.get(list.get(i));
            answer++;
            if(sum >= k) break;
        }
        
        return answer;
    }
}
public class tangerine {
	public static void main(String[] args) {
		Solution44 sol = new Solution44();
		int k = 6;
		int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
		System.out.println("귤 크기는 각각");
		for(int i:tangerine) System.out.println(i);
		System.out.println("귤 "+k+"개를 뽑을 때 크기가 서로 다른 종류의 최솟값 : "+sol.solution(k, tangerine));
	}
}