package programmers;
class Solution56 {
	public int solution(int storey) {
        // set : storey의 자릿수, len : storey의 길이, idx : storey의 인덱스
        int answer = 0, set = 1, len = Integer.toString(storey).length(), idx = len-1;
        
        while(storey > 0) {
            String str = Integer.toString(storey);
            
            // storey를 0으로 만드는 과정에서 storey의 길이가 늘어났을 때 반복 횟수 1 증가
            if(str.length() > len) {
                idx++;len = str.length();
            }
            
            // storey의 idx번째 자리 수가 4 이하일 때
            if(str.charAt(idx) <= '4') {
                storey -= (str.charAt(idx) - '0') * set;
                answer += str.charAt(idx) - '0';
            
            // storey의 idx번째 자리 수가 5일 때
            }else if(str.charAt(idx) == '5') {
            	// storey의 가장 큰 자리 수이거나 앞 자리수가 5보다 작을 때
                if(idx==0 || str.charAt(idx-1) < '5') {
                    storey -= (str.charAt(idx) - '0') * set;
                    answer += str.charAt(idx) - '0';
                }
                // 앞 자리수가 5보다 클 때
                else {
                    storey += (10 - (str.charAt(idx) - '0')) * set;
                    answer += str.charAt(idx) - '0';
                }
             
            // storey의 idx번째 자리 수가 6 이상일 때
            }else {
                storey += (10 - (str.charAt(idx) - '0')) * set;
                answer += 10 - (str.charAt(idx) - '0');
            }
            
            set *= 10;idx--;
        }
        return answer;
    }
}
public class magicalElevator {
	public static void main(String[] args) {
		Solution56 sol = new Solution56();
		int storey = 2554;
		
		System.out.println(storey+" -> "+sol.solution(storey)+"회 만에 0으로 바꿀 수 있음");
	}
}