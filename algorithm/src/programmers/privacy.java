package programmers;
import java.util.ArrayList;
class Solution12 {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        int getTdate = Integer.parseInt(today.substring(0,4))*12*28 + Integer.parseInt(today.substring(5,7))*28 + Integer.parseInt(today.substring(8,10));

        for(int i=0;i<privacies.length;i++){
            char plevel = privacies[i].charAt(11);
            int pyear = Integer.parseInt(privacies[i].substring(0,4));
            int pmonth = Integer.parseInt(privacies[i].substring(5,7));
            int pday = Integer.parseInt(privacies[i].substring(8,10));

            if(pday==1) pday=29;
            
            for(int j=0;j<terms.length;j++){
                char tlevel = terms[j].charAt(0);
                int term = Integer.parseInt(terms[j].substring(2));
                if(plevel==tlevel) {
                    pmonth += term;
                    pday -= 1;
                    if(pmonth>12) {
                        pyear += pmonth/12;
                        pmonth = pmonth%12;
                    }
                    int getPdate = pyear*12*28 + pmonth*28 + pday;
                    if(getTdate>getPdate) arr.add(i+1);
                }
            }
        }
        int[] answer = new int[arr.size()];
        for(int i=0;i<arr.size();i++) answer[i]=arr.get(i); 
        return answer;
    }
}

public class privacy {
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		String[] terms = {"A 6", "B 12", "C 3"};
		String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		for(int i=0;i<sol.solution("2022.05.19", terms, privacies).length;i++) {
			System.out.println(sol.solution("2022.05.19", terms, privacies)[i]);
		}
	}
}
