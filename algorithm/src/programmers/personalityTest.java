package programmers;
import java.util.HashMap;
class Solution4 {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<survey.length;i++){
            if(choices[i]<4) {
                char ch = survey[i].charAt(0);
                if(map.containsKey(ch)) {
                    int cnt = map.get(ch);               
                    map.put(ch,cnt+4-choices[i]);
                }else{
                    map.put(ch,4-choices[i]);
                }
            }
            if(choices[i]>4) {
                char ch = survey[i].charAt(1);
                if(map.containsKey(ch)) {
                    int cnt = map.get(ch);
                    map.put(ch,cnt+choices[i]-4);
                }else{
                    map.put(ch,choices[i]-4);
                }
            }
        }
        
        answer += map.getOrDefault('R',0)>=map.getOrDefault('T',0) ? 'R':'T';
        answer += map.getOrDefault('C',0)>=map.getOrDefault('F',0) ? 'C':'F';
        answer += map.getOrDefault('J',0)>=map.getOrDefault('M',0) ? 'J':'M';
        answer += map.getOrDefault('A',0)>=map.getOrDefault('N',0) ? 'A':'N';
    
        return answer;
    }
}
public class personalityTest {
	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
		int[] choices = {5, 3, 2, 7, 5};
		
		System.out.println(sol.solution(survey,choices));
	}
}
