package programmers;
class Solution24 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        for(int i=1;i<words.length;i++){
            // ch1 - ���� �ܾ��� ù ����, ch2 - ���� �ܾ��� ������ ����
            char ch1 = words[i].charAt(0);
            char ch2 = words[i-1].charAt(words[i-1].length()-1);
            for(int j=0;j<i;j++){
            	// ������ ���ߴ� �ܾ �ְų� ch1�� ch2�� ���� ���� ���� ��
                if (words[i].equals(words[j]) || ch1 != ch2) {
                    // person - Ʋ�� ����� �� ��° ������� ��Ÿ���� ����
                    int person = (i+1)%n;
                    if(person == 0) person = n;
                    // answer[1]���� person�� �� ��° ������ Ʋ�ȴ��� ����� ���� ����
                    answer[0] = person;answer[1] = (i/n)+1;
                }
            }
            // Ʋ�� ����� �߰��ߴٸ� ����
            if(answer[0]!=0) break;
        }
        return answer;
    }
}
public class lastCharChain {
	public static void main(String[] args) {
		Solution24 sol = new Solution24();
		String[] s = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		System.out.println(sol.solution(3,s)[0]+"��° ����� ");
		System.out.println(sol.solution(3,s)[1]+"��° �������� Ʋ�Ƚ��ϴ�.");
	}
}
