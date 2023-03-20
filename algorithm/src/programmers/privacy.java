package programmers;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
class Solution12 {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date day;
		try {
			day = sdf.parse(today);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

        for(int i=0;i<privacies.length;i++){
			Date privacy;
			try {
				privacy = sdf.parse(privacies[i].substring(0,10));
			} catch (ParseException e) {
				e.printStackTrace();
			}
            for(int j=0,k=0;j<terms.length;j++){
                if(privacies[i].substring(11)==terms[j].substring(0)) {
                    
                    
                }
            }
        }
        return answer;
    }
}

public class privacy {
	public static void main(String[] args) {

	}
}
