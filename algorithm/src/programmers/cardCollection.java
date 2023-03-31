package programmers;
class Solution16 {
	public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        for(int i=0,j=0,k=0;i<goal.length;i++){
            if(goal[i].equals(cards1[j])) {
                j++;
                if(j==cards1.length) --j;
            }
            else if(goal[i].equals(cards2[k])) {
                k++;
                if(k==cards2.length) --k;
            }
            else {
                answer = "No";
                break;
            }
        }
        if(answer.equals("")) answer = "Yes";
        return answer;
    }
}

public class cardCollection {
	public static void main(String[] args) {
		Solution16 sol = new Solution16();
		String[] cards1 = {"i", "drink", "water"};
		String[] cards2 = {"want", "to"};
		
		String[] cards3 = {"i", "water", "drink"};
		
		String[] goal = {"i", "want", "to", "drink", "water"};
		
		System.out.println(sol.solution(cards1,cards2,goal));
		System.out.println(sol.solution(cards1,cards3,goal));
	}
}
