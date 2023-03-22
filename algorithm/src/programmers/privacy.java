package programmers;
import java.util.ArrayList;
class Solution12 {
    public int[] solution(String today, String[] terms, String[] privacies) {
    	ArrayList<Integer> result = new ArrayList<Integer>();
        
        for(int i=0;i<privacies.length;i++){
            int year = Integer.parseInt(privacies[i].substring(0,4));
            int month = Integer.parseInt(privacies[i].substring(5,7));
            int day = Integer.parseInt(privacies[i].substring(8,10));
            
            for(int j=0;j<terms.length;j++){
                char plevel = privacies[i].charAt(11);
                char tlevel = terms[j].charAt(0);
                if(plevel==tlevel){
                    month += Integer.parseInt(terms[j].substring(2));
                    day -= 1;
                    if(month>12){
                        year += 1;
                        month -= 12;
                    }
                    if(day==0) {
                        month -= 1;
                        day = 28;
                    }
                    if(year<Integer.parseInt(today.substring(0,4))) result.add(i+1);
                    else if(year==Integer.parseInt(today.substring(0,4))){
                        if(month<Integer.parseInt(today.substring(5,7))) result.add(i+1);
                        else if(month==Integer.parseInt(today.substring(5,7)) && day<Integer.parseInt(today.substring(8))) result.add(i+1);
                    }
                }
            }
        }
        int[] answer = new int[result.size()];
        for(int i=0;i<answer.length;i++) answer[i] = result.get(i);
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
