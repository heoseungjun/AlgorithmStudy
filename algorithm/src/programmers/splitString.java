package programmers;
class Solution13 {
    public int solution(String s) {
        int answer = 0;
        int fcnt = 0;
        int ocnt = 0;
        
        char fixchar = s.charAt(0);
        for(int i=0;i<s.length();i++){
            if(fcnt==ocnt) {
                answer++;
                fixchar = s.charAt(i);
            }
            if(s.charAt(i)==fixchar) fcnt++;
            else ocnt++;
        }
        return answer;
    }
}

public class splitString {
	public static void main(String[] args) {
		Solution13 sol = new Solution13();
		System.out.println(sol.solution("banana"));
		System.out.println(sol.solution("abracadabra"));
		System.out.println(sol.solution("aaabbaccccabba"));
		System.out.println(sol.solution("abaa"));
	}
}
