package programmers;
import java.util.ArrayList;
class Solution5 {
    public String solution(String X, String Y) {
        String answer = "";
        ArrayList<Character> list = new ArrayList<Character>();
        ArrayList<String> strX = new ArrayList<String>();
        ArrayList<String> strY = new ArrayList<String>();
        
        for(int i=0;i<X.length();i++) strX.add(String.valueOf(X.charAt(i)));
        for(int i=0;i<Y.length();i++) strY.add(String.valueOf(Y.charAt(i)));
        
        for(int i=0;i<strX.size();i++){
            for(int j=0;j<strY.size();j++){
                if(strX.get(i).equals(strY.get(j))) {
                    list.add(X.charAt(i));
                    strX.remove(i);
                    break;
                }
            }
        }
        if(list.isEmpty()) answer = "-1";
        else {
            for(int i=0;i<list.size();i++) answer += String.valueOf(list.get(i));
        }
        return answer;
    }
}

public class numFriend {
	public static void main(String[] args) {

	}
}
