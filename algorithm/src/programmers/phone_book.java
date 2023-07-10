package programmers;
import java.util.Arrays;
class Solution49 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i=0;i<phone_book.length-1;i++) {
            if(phone_book[i+1].startsWith(phone_book[i])) {
                answer = false; break;
            }
        }
        return answer;
    }
}
public class phone_book {
	public static void main(String[] args) {
		Solution49 sol = new Solution49();
		String[] phone_book = {"119", "97674223", "1195524421"};
		System.out.println("전화번호 목록은 아래와 같습니다.");
		for(int i=0;i<phone_book.length;i++) System.out.println(phone_book[i]);
		System.out.println("\n어떤 번호가 다른 번호의 접두어인 경우가 있다면 false, 없다면 true : "+sol.solution(phone_book));
	}
}