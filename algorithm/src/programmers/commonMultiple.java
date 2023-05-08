package programmers;
class Solution27 {
	public int solution(int[] arr) {
        int answer = arr[arr.length-1];
        for(int i=0;i<arr.length-1;i++) answer = lcm(answer,arr[i]);
        return answer;
    }
    static int gcd(int x, int y){
        while(y != 0){
            int r = x % y;
            x = y;
            y = r;
        }
        return x;
    }
    static int lcm(int x, int y){
        int r = 0;
        r = x*y/gcd(x,y);
        System.out.println(r);
        return r;
    }
}
public class commonMultiple {
	public static void main(String[] args) {
		Solution27 sol = new Solution27();
		int[] arr = {2,6,8,14};
		System.out.println("2,6,8,14의 최소공배수 : " + sol.solution(arr));
	}
}
