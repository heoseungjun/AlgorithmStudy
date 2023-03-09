package programmers;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class Solution5 {
    public String solution(String X, String Y) {
        String answer = "";
        
        String[] split1 = X.split("");
        String[] split2 = Y.split("");
        
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> strX = new ArrayList<String>(Arrays.asList(split1));
        ArrayList<String> strY = new ArrayList<String>(Arrays.asList(split2));
        
        for(int i=0;i<strX.size();i++){
            String attr = strX.get(i);
            if(strY.contains(attr)) {
                list.add(attr);
                strY.remove(attr);
            }
        }
        
        if(list.isEmpty()) answer = "-1";
        else {
            Collections.sort(list,Collections.reverseOrder());
            for(int i=0;i<list.size();i++) answer += list.get(i);
            if(answer.replaceAll("0","").isEmpty()) answer = "0";
        }
        return answer;
    }
}

public class numFriend {
	public static void main(String[] args) {

	}
}
