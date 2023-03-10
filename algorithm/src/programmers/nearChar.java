package programmers;
class Solution6 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int cnt = 0;
        answer[0] = -1;
        for(int i=1;i<s.length();i++){
            for(int j=0;j<i;j++){
                if(s.charAt(i)==s.charAt(j)) {
                    cnt++;
                    answer[i] = i-j;
                }
                if(cnt==0) answer[i] = -1;
            }
            cnt = 0;
        }
        return answer;
    }
}

public class nearChar {
	public static void main(String[] args) {
		String s = "banana";
		Solution6 sol = new Solution6();
		sol.solution(s);
	}
}
