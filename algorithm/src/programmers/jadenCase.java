package programmers;
class Solution28 {
	public String solution(String s) {
        String answer = String.valueOf(s.charAt(0)).toUpperCase();
        for(int i=1;i<s.length();i++){
            String str = String.valueOf(s.charAt(i));
            if(s.charAt(i-1)==' ') str = str.toUpperCase();
            else str = str.toLowerCase();
            answer += str;
        }
        return answer;
    }
}
public class jadenCase {
	public static void main(String[] args) {
		Solution28 sol = new Solution28();
		String s = "3people unFollowed me";
		System.out.println("수정 전 : " + s);
		System.out.println("수정 후 : " + sol.solution(s));
	}
}
