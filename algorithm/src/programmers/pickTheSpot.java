package programmers;
import java.lang.Math;
class Solution59 {
    public long solution(int k, int d) {
        long answer = 0;
        for(long x=0;x<=d;x+=k) {
            long y = (long)Math.sqrt((long)d*(long)d - x*x) / k;
            answer += y+1;
        }
        return answer;
    }
}
public class pickTheSpot {
	public static void main(String[] args) {
		Solution59 sol = new Solution59();
		int k = 1, d = 5;
		
		System.out.println("좌표평면에 찍을 수 있는 점 개수 : "+sol.solution(k, d));
	}
}