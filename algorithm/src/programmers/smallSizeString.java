package programmers;
class Solution15 {
	public int solution(String t, String p) {
        int answer = 0;
        for(int i=0,j=p.length();i<t.length()-p.length()+1;i++){
            if(Long.parseLong(p)>=Long.parseLong(t.substring(i,j))) answer++;
            j++;
        }
        return answer;
    }
}

public class smallSizeString {
	public static void main(String[] args) {
		Solution15 sol = new Solution15();
		System.out.println(sol.solution("3141592","271"));
		System.out.println(sol.solution("10203","15"));
	}
}
