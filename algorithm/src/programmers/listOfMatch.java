package programmers;
import java.lang.Math;
class Solution41 {
	public int solution(int n, int a, int b){
        int answer = 1;
        while(true){
            int dist = a-b;
            if(Math.abs(dist)==1 && Math.max(a,b)%2==0) break;
            a = (a%2 !=0) ? a/2+1 : a/2;
            b = (b%2 !=0) ? b/2+1 : b/2;
            answer++;
        }
        return answer;
    }
}
public class listOfMatch {
	public static void main(String[] args) {
		Solution41 sol = new Solution41();
		int n=8, a=4, b=5;
		System.out.println(a+"번 선수와 "+b+"번 선수가 만나기 위해 치뤄야 하는 경기 수 : "+sol.solution(n,a,b));
	}
}