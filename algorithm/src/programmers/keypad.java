package programmers;
import java.lang.Math;
class Solution10 {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int lloc = 10;
        int rloc = 12;
        
        for(int num:numbers){
            if(num==1 || num==4 || num==7) {
                answer += "L";
                lloc = num;
            }else if(num==3 || num==6 || num==9){
                answer += "R";
                rloc = num;
            }else{
                if(num==0) num = 11;
                int ldist = Math.abs(num-lloc)/3+Math.abs(num-lloc)%3;
                int rdist = Math.abs(num-rloc)/3+Math.abs(num-rloc)%3;
                if(ldist<rdist) {
                    answer += "L";
                    lloc = num;
                }else if(ldist>rdist) {
                    answer += "R";
                    rloc = num;
                }else{
                    if(hand.equals("left")){
                        answer+="L";
                        lloc = num;
                    }else{
                        answer+="R";
                        rloc = num;
                    }
                }
            }
        }
        return answer;
    }
}

public class keypad {
	public static void main(String[] args) {
		Solution10 sol = new Solution10();
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		System.out.println(sol.solution(numbers, "right"));
	}
}
