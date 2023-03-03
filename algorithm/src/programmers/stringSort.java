package programmers;
import java.util.*;
class Solution3 {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        // strings 원소의 n번째 인덱스 값과 strings의 원소를 담을 2차원 배열
        String[][] compare = new String[strings.length][strings.length];
        for(int i=0;i<strings.length;i++){
            compare[i][0] = String.valueOf(strings[i].charAt(n));
            compare[i][1] = strings[i];
        }
        
        // 2차원 배열의 첫번째 세로줄을 서로 비교, 서로 같다면 두번째 세로줄 기준으로 비교
        Arrays.sort(compare, new Comparator<String[]>(){
            public int compare(String[] o1, String[] o2){
                if(o1[0].equals(o2[0])){
                    return o1[1].compareTo(o2[1]);
                }else{
                    return o1[0].compareTo(o2[0]);
                }
            }
        });
        for(int i=0;i<answer.length;i++) answer[i] = compare[i][1];
        return answer;
    }
}

public class stringSort {
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		String[] str = {"sun", "bed", "car"};
		String[] answer = sol.solution(str, 1);
		for(int i=0;i<answer.length;i++) System.out.println(answer[i]);
	}
}
