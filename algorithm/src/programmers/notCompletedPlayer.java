package programmers;
import java.util.Arrays;
class Solution22 {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int check = 0;
        for(int i=0;i<participant.length;i++){
            if(participant.length-1 == 0) {
                String answer = participant[0];
                return answer;
            }
            if(!(participant[i].equals(completion[i]))) {
                check = i;
                break;
            }
            if(i == participant.length-2) {
                check = i+1;
                break;
            }
        }
        String answer = participant[check];
        return answer;
    }
}
public class notCompletedPlayer {
	public static void main(String[] args) {
		Solution22 sol = new Solution22();
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		System.out.println(sol.solution(participant, completion));
	}
}
