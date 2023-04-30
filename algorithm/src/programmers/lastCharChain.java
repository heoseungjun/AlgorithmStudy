package programmers;
class Solution24 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        for(int i=1;i<words.length;i++){
            // ch1 - 현재 단어의 첫 글자, ch2 - 이전 단어의 마지막 글자
            char ch1 = words[i].charAt(0);
            char ch2 = words[i-1].charAt(words[i-1].length()-1);
            for(int j=0;j<i;j++){
            	// 이전에 말했던 단어가 있거나 ch1과 ch2가 서로 같지 않을 때
                if (words[i].equals(words[j]) || ch1 != ch2) {
                    // person - 틀린 사람이 몇 번째 사람인지 나타내는 변수
                    int person = (i+1)%n;
                    if(person == 0) person = n;
                    // answer[1]에는 person이 몇 번째 순서에 틀렸는지 계산한 값을 담음
                    answer[0] = person;answer[1] = (i/n)+1;
                }
            }
            // 틀린 사람을 발견했다면 종료
            if(answer[0]!=0) break;
        }
        return answer;
    }
}
public class lastCharChain {
	public static void main(String[] args) {
		Solution24 sol = new Solution24();
		String[] s = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		System.out.println(sol.solution(3,s)[0]+"번째 사람이 ");
		System.out.println(sol.solution(3,s)[1]+"번째 순서에서 틀렸습니다.");
	}
}
