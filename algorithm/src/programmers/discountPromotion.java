package programmers;
class Solution50 {
	public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0, check = 0;
        
        for(int i=0;i<discount.length-9;i++) {
            for(int j=0;j<want.length;j++) {
                int cnt = 0;
                for(int k=i;k<i+10;k++) {
                    if(discount[k].equals(want[j])) {
                        cnt++;
                    }
                }
                if(cnt != number[j]) {
                    check++; break;
                }
            }
            if(check == 0) answer++;
            check = 0;
        }
        return answer;
    }
}
public class discountPromotion {
	public static void main(String[] args) {
		Solution50 sol = new Solution50();
		String[] want = {"banana", "apple", "rice", "pork", "pot"};
		int[] number = {3, 2, 2, 2, 1};
		String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
 		System.out.println("할인 행사 참여 가능 횟수 : " + sol.solution(want, number, discount));
	}
}