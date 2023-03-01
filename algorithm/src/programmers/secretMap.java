package programmers;
class Solution2 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0;i<n;i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            answer[i] = String.format("%" + n + "s", answer[i]);
            answer[i] = answer[i].replaceAll("0"," ");
            answer[i] = answer[i].replaceAll("1","#");
        }
        return answer;
    }
}

public class secretMap {
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int[] arr1 = {46, 33, 33 ,22, 31, 50};
		int[] arr2 = {27 ,56, 19, 14, 14, 10};
		sol.solution(6, arr1, arr2);
	}
}
