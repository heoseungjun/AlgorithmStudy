package programmers;

class Solution32 {
	 public int solution(int n) {
	        int answer = 0;
	        int cnt1 = Integer.bitCount(n);
	        for(int i=1;;i++){
	            int cnt2 = Integer.bitCount(n+i);
	            answer = n+i;
	            if(cnt1 == cnt2) break;
	        }
	        return answer;
	    }
}
public class nextBigNum {
	public static void main(String[] args) {
		Solution32 sol = new Solution32();
		int n1 = 78, n2 = 15;
		System.out.println(n1+"�� ���� ���ڴ� "+sol.solution(n1));
		System.out.println(n2+"�� ���� ���ڴ� "+sol.solution(n2));
	}
}