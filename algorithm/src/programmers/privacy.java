package programmers;
class Solution12 {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        for(int i=0;i<privacies.length;i++){
            int year = Integer.parseInt(privacies[i].substring(0,4));
            int month = Integer.parseInt(privacies[i].substring(5,7));
            int day = Integer.parseInt(privacies[i].substring(8,10));
            
            for(int j=0,k=0;j<terms.length;j++){
                String plevel = privacies[i].substring(11);
                String tlevel = terms[j].substring(0,2);
                if(plevel.equals(tlevel)){
                    month += Integer.parseInt(terms[j].substring(2));
                    if(month<=12){
                        if(year>Integer.parseInt(today.substring(0,4))) answer[k++] = i+1;
                    }else{
                        year += 1;
                        month -= 12;
                        if(year>Integer.parseInt(today.substring(0,4))) answer[k++] = i+1;
                        if(year==Integer.parseInt(today.substring(0,4)) && month>Integer.parseInt(today.substring(5,7))) answer[k++] = i+1;
                    }
                }
            }
        }
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
