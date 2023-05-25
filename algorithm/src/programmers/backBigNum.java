package programmers;
class Solution36 {
    public int[] solution(int[] numbers) {
        int N = numbers.length;
        int[] answer = new int[N];
        answer[N-1] = -1;
        for(int i=0;i<N-1;i++){
            int j = N-1;
            while(j>=i){
                if(numbers[j]>numbers[i]) answer[i] = numbers[j];
                j--;
            }
            if(answer[i]==0) answer[i] = -1;
        }
        return answer;
    }
}
public class backBigNum {
	public static void main(String[] args) {
		Solution36 sol = new Solution36();
		int[] numbers = {2, 3, 3, 5};
		System.out.println("µÞ Å« ¼ö : ");
		for(int i=0;i<sol.solution(numbers).length;i++) System.out.println(numbers[i]);;
	}
}