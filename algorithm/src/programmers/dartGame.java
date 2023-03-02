package programmers;
class Solution3 {
	public int solution(String dartResult) {
        int answer = 0;
        
        for(int i=1,j=2;i<dartResult.length();i++,j++){
            char ch1 = dartResult.charAt(i);
            char ch2 = dartResult.charAt(i-1);
            int num = dartResult.charAt(i-1) - 48;
            int num2 = dartResult.charAt(j-2) - 48;
            
            if(ch1=='S') answer += num;
            if(ch1=='D') answer += num*num;
            if(ch1=='T') answer += num*num*num;
            if(ch1=='*') answer *= 2;
            if(ch1=='#') {
                if(ch2=='S')answer -= 2*num2;
                if(ch2=='D')answer -= 2*num2*num2;
                if(ch2=='T')answer -= 2*num2*num2*num2;
            }
        }
        return answer;
    }
}

public class dartGame {
	public static void main(String[] args) {
		
	}
}
