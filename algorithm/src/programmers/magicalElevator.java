package programmers;
class Solution56 {
	public int solution(int storey) {
        // set : storey�� �ڸ���, len : storey�� ����, idx : storey�� �ε���
        int answer = 0, set = 1, len = Integer.toString(storey).length(), idx = len-1;
        
        while(storey > 0) {
            String str = Integer.toString(storey);
            
            // storey�� 0���� ����� �������� storey�� ���̰� �þ�� �� �ݺ� Ƚ�� 1 ����
            if(str.length() > len) {
                idx++;len = str.length();
            }
            
            // storey�� idx��° �ڸ� ���� 4 ������ ��
            if(str.charAt(idx) <= '4') {
                storey -= (str.charAt(idx) - '0') * set;
                answer += str.charAt(idx) - '0';
            
            // storey�� idx��° �ڸ� ���� 5�� ��
            }else if(str.charAt(idx) == '5') {
            	// storey�� ���� ū �ڸ� ���̰ų� �� �ڸ����� 5���� ���� ��
                if(idx==0 || str.charAt(idx-1) < '5') {
                    storey -= (str.charAt(idx) - '0') * set;
                    answer += str.charAt(idx) - '0';
                }
                // �� �ڸ����� 5���� Ŭ ��
                else {
                    storey += (10 - (str.charAt(idx) - '0')) * set;
                    answer += str.charAt(idx) - '0';
                }
             
            // storey�� idx��° �ڸ� ���� 6 �̻��� ��
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
		
		System.out.println(storey+" -> "+sol.solution(storey)+"ȸ ���� 0���� �ٲ� �� ����");
	}
}