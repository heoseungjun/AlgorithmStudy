package programmers;
import java.util.*;
class Solution53 {
    public String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length];
        
        for(int i=0;i<str.length;i++) str[i] = String.valueOf(numbers[i]);
        
        Arrays.sort(str,(o1,o2) -> (o1+o2).compareTo(o2+o1));
        
        if(str[str.length-1].equals("0")) return "0";
        for(int i=str.length-1;i>=0;i--) answer += str[i];
        return answer;
    }
}
public class mostBigNum {
	public static void main(String[] args) {
		Solution53 sol = new Solution53();
		int[] numbers = {3, 30, 34, 5, 9};
		
		System.out.println("주어진 배열 numbers의 숫자 : ");
		for(int i=0;i<numbers.length;i++) System.out.println(numbers[i]);
		
		System.out.println("\nnumbers의 숫자들로 만들 수 있는 가장 큰 수 : "+sol.solution(numbers));
	}
}