package programmers;
class Solution55 {
	public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int sum = 0, l = 0, r = -1, len = 1000000;
        while(r<sequence.length) {
            if(sum<k) {
                if(++r < sequence.length) sum += sequence[r];
            }
            else if(sum>k) {
                sum -= sequence[l++];
            }
            else if(sum==k) {
                if(r-l < len || (r-l == len && r<answer[1])) {
                    answer[0] = l;answer[1] = r;len = r-l;
                }
                sum -= sequence[l++];
            }
        }
        return answer;
    }
}
public class partitialSum {
	public static void main(String[] args) {
		Solution55 sol = new Solution55();
		int[] arr = {1, 1, 1, 2, 3, 4, 5};
		int k = 5;
		
		System.out.println("arr의 원소 : ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("\n최소 길이 부분합 : "+sol.solution(arr, k)[0]+"부터 "+sol.solution(arr, k)[1]);
	}
}