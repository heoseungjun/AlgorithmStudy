package programmers;
class Solution35 {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int len = -1, sum = 0;
        for(int i=0;i<sequence.length;i++){
            sum += sequence[i];
            len++;
            if(sum == k) {
                answer[0] = i-len;
                answer[1] = i;
            }
            if(sum == k || sum > k){
                i = i - len + 1;
                sum = 0;len = -1;
            }
        }
        return answer;
    }
}
public class partSequenceSum {
	public static void main(String[] args) {
		Solution35 sol = new Solution35();
		int[] sequence = {1, 2, 3, 4, 5};
	}
}