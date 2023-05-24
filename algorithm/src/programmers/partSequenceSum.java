package programmers;
class Solution35 {
	public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int len = sequence.length;
        for(int L=0, R=L; L<len; L++){
            int sum = 0;
            while(sum<=k && R<len) sum += sequence[R++];
            System.out.println(sum);
            if(sum == k) {
                answer[0] = L;
                answer[1] = R;
            }
            //sum -= sequence[L];
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