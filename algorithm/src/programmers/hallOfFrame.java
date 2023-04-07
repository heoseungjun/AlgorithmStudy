package programmers;
import java.util.ArrayList;
import java.util.Collections;
class Solution19 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> rank = new ArrayList<Integer>();
        for(int i=0;i<score.length;i++){
            rank.add(score[i]);
            Collections.sort(rank);
            if(i>=k) rank.remove(0);
            answer[i] = rank.get(0);
        }
        return answer;
    }
}

public class hallOfFrame {
	public static void main(String[] args) {
		Solution19 sol = new Solution19();
	}
}
