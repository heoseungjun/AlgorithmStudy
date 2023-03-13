package programmers;
class Solution9 {
	 public int solution(int a, int b, int n) {
	        int answer = 0;
	        while(n>=a){
	            int rest = n%a;
	            n = n/a*b;
	            answer += n;
	            n += rest;
	        }
	        return answer;
	    }
}

public class cokeProblem {
	public static void main(String[] args) {
		Solution9 sol = new Solution9();
		System.out.println(sol.solution(3,1,20));
	}
}
