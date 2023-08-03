package programmers;
import java.util.HashMap;
import java.util.Arrays;
class Solution61 {
    public long solution(int[] weights) {
        long answer = 0;
        Arrays.sort(weights);
        HashMap<Double,Integer> map = new HashMap<>();
        
        for(double weight : weights) {
            double type1 = weight * 1.0;
            double type2 = weight * 0.5;
            double type3 = weight * 2.0 / 3.0;
            double type4 = weight * 0.75;
            
            if(map.containsKey(type1)) answer += map.get(type1);
            if(map.containsKey(type2)) answer += map.get(type2);
            if(map.containsKey(type3)) answer += map.get(type3);
            if(map.containsKey(type4)) answer += map.get(type4);
            
            map.put(weight, map.getOrDefault(weight,0)+1);
        }
        return answer;
    }
}
public class seesawPair {
	public static void main(String[] args) {
		Solution61 sol = new Solution61();
		int[] weights = {100,180,360,100,270};
		System.out.println("¸ö¹«°Ô Á¤º¸\n");
		for(int i=0;i<weights.length;i++) System.out.println(weights[i]);
		System.out.println("\n½Ã¼Ò Â¦±Ã ¼ö : "+sol.solution(weights));
	}
}