package programmers;
class Solution27 {
    public int solution(int[] arr) {
        int cnt = 0;
        int answer = arr[arr.length-1];
        for(int i=0,j=2;i<arr.length-1;i++){
            if(answer % arr[i] != 0) cnt++;
            if(cnt>0){
                answer = arr[arr.length-1] * j++;
                cnt = 0;i=0;
            }
        }
        return answer;
    }
}
public class commonMultiple {
	public static void main(String[] args) {
		Solution27 sol = new Solution27();
		int[] arr = {2,6,8,14};
		System.out.println("2,6,8,14의 최소공배수 : " + sol.solution(arr));
	}
}
