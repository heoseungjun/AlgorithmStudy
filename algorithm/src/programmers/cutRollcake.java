package programmers;
import java.util.HashMap;
class Solution60 {
	public int solution(int[] topping) {
        int answer = 0;
        
        HashMap<Integer,Integer> map1 = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> map2 = new HashMap<Integer,Integer>();
        
        for(int i=0;i<topping.length;i++) {
            map1.put(topping[i],map1.getOrDefault(topping[i],0)+1);
        }

        for(int j=0;j<topping.length;j++) {
            map2.put(topping[j],map2.getOrDefault(topping[j],0)+1);
            map1.put(topping[j],map1.getOrDefault(topping[j],0)-1);
            if(map1.getOrDefault(topping[j],0) == 0) map1.remove(topping[j]);
            if(map1.size() == map2.size()) answer++;
        }
        
        return answer;
    }
}
public class cutRollcake {
	public static void main(String[] args) {
		Solution60 sol = new Solution60();
		int k = 1, d = 5;
		int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};
		System.out.println("롤케이크의 토핑은 다음과 같습니다.\n");
		for(int i=0;i<topping.length;i++) System.out.println(topping[i]);
		System.out.println("\n토핑 종류가 공평하게 나뉘도록 롤케이크를 자르는 방법의 수 : "+sol.solution(topping)+"개");
	}
}