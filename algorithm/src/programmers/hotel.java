package programmers;
import java.util.Arrays;
import java.util.Date;
import java.text.SimpleDateFormat;
class Solution39 {
    public int solution(String[][] book_time) {
        int answer = book_time.length;
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        try{
            for(int i=0;i<book_time.length;i++){
                for(int j=0;j<book_time.length;j++){
                    Date sTime = format.parse(book_time[i][0]);
                    Date eTime = format.parse(book_time[j][1]);
                    if(sTime.compareTo(eTime)>0) {
                        answer--;j=book_time.length-1;
                        System.out.println(i);
                    }
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return answer;
    }
}
public class hotel {
	public static void main(String[] args) {
		Solution38 sol = new Solution38();
		int x[][] = {{1,4},{3,2},{4,1}};
		int y[][] = {{3,3},{3,3}};
		System.out.println("배열 x : "+Arrays.deepToString(x));
		System.out.println("배열 y : "+Arrays.deepToString(y));
		System.out.println("x와 y의 곱 : "+Arrays.deepToString(sol.solution(x, y)));
	}
}