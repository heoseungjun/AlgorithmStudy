package programmers;
class Solution11 {
    public String solution(String new_id) {
        String answer = "";
        // 1단계 : 대문자를 소문자로 변경
        answer = new_id.toLowerCase();
        // 2단계 : 불필요한 특수기호 제거
        answer = answer.replaceAll("[^-_.a-z0-9]","");
        // 3단계 : 마침표가 연속으로 나온다면 하나로 변경
        while(answer.indexOf("..") != -1) answer = answer.replace("..",".");
        // 4단계 : 아이디의 처음 혹은 끝에 있는 마침표가 있다면 제거
        answer = answer.replaceAll("^[.]|[.]$","");
        // 5단계 : 아이디가 빈 문자열인지 확인, 비어있으면 a 입력
        if(answer.isEmpty()) answer += "a";
        // 6단계 : 아이디가 15글자를 초과했다면 1~15째 글자만 남기고 지우기
        if(answer.length()>15) answer = answer.substring(0,15);
        // 아이디의 처음 혹은 끝에 있는 마침표가 있다면 제거(한 번 더 시행)
        answer = answer.replaceAll("^[.]|[.]$","");
        // 7단계 : 아이디 길이가 2자 이하인지 확인, 이하라면 현재 문자열 반복
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
