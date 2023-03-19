package programmers;
class Solution11 {
    public String solution(String new_id) {
        String answer = "";
        // 1�ܰ� : �빮�ڸ� �ҹ��ڷ� ����
        answer = new_id.toLowerCase();
        // 2�ܰ� : ���ʿ��� Ư����ȣ ����
        answer = answer.replaceAll("[^-_.a-z0-9]","");
        // 3�ܰ� : ��ħǥ�� �������� ���´ٸ� �ϳ��� ����
        while(answer.indexOf("..") != -1) answer = answer.replace("..",".");
        // 4�ܰ� : ���̵��� ó�� Ȥ�� ���� �ִ� ��ħǥ�� �ִٸ� ����
        answer = answer.replaceAll("^[.]|[.]$","");
        // 5�ܰ� : ���̵� �� ���ڿ����� Ȯ��, ��������� a �Է�
        if(answer.isEmpty()) answer += "a";
        // 6�ܰ� : ���̵� 15���ڸ� �ʰ��ߴٸ� 1~15° ���ڸ� ����� �����
        if(answer.length()>15) answer = answer.substring(0,15);
        // ���̵��� ó�� Ȥ�� ���� �ִ� ��ħǥ�� �ִٸ� ����(�� �� �� ����)
        answer = answer.replaceAll("^[.]|[.]$","");
        // 7�ܰ� : ���̵� ���̰� 2�� �������� Ȯ��, ���϶�� ���� ���ڿ� �ݺ�
        while(answer.length()<3) answer += answer.charAt(answer.length()-1);
        return answer;
    }
}

public class recommendId {
	public static void main(String[] args) {
		Solution11 sol = new Solution11();
		System.out.println(sol.solution("...!@BaT#*..y.abcdefghijklm"));
	}
}
