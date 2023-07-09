package programmers;
class Solution48 {
	public int[] solution(String s) {
        int[] answer = new int[2];
        int strlen = 0;
        
        while(!s.equals("1")) {
            String str = "";
            String[] arr = s.split("");
            for(int i=0;i<arr.length;i++) {
                if(arr[i].equals("1")) str += String.valueOf(arr[i]);
                else answer[1]++;
            }
            strlen = str.length();
            s = Integer.toBinaryString(strlen);
            answer[0]++;
        }
        return answer;
    }
}
public class binaryRepeat {
	public static void main(String[] args) {
		Solution48 sol = new Solution48();
		String s = "110010101001";
		System.out.println("�־��� ���ڿ� : "+s+"\n���� ��ȯ Ƚ�� : "+sol.solution(s)[0]+"\n���� ��ȯ �� 0 ���� Ƚ�� : "+sol.solution(s)[1]);
	}
}