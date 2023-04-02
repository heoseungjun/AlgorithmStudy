package programmers;
class Solution18 {
    public String solution(String s, String skip, int index) {
        String answer = "";
        int cnt = 0;
        
        for(int i=0;i<s.length();i++) {
            for(int j=0;j<5;j++){
                for(int k=0;k<skip.length();k++){
                    if((char)(s.charAt(i)+j)==skip.charAt(k)) cnt++;
                }
            }
            char newChar = (char)(s.charAt(i)+5);
            if(newChar >= 122) newChar = (char)(newChar-26);
            answer += String.valueOf((char)(newChar+cnt));
            cnt = 0;
        }
        return answer;
    }
}

public class secretCode {
	public static void main(String[] args) {
		Solution18 sol = new Solution18();
	}
}
