package programmers;
import java.util.ArrayList;
class Solution43 {
    public int solution(String str1, String str2) {
        float jakard = 0;
        
        ArrayList<String> set1 = new ArrayList<String>();
        ArrayList<String> set2 = new ArrayList<String>();
        ArrayList<String> union = new ArrayList<String>();
        ArrayList<String> intersection = new ArrayList<String>();
        
        str1 = str1.toLowerCase(); str2 = str2.toLowerCase();
        
        for(int i=0;i<str1.length()-1;i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str1.charAt(i+1);
            if((ch1>='a' && ch2<='z') && (ch2>='a' && ch2<='z')) set1.add(ch1+""+ch2);
        }
        
        for(int i=0;i<str2.length()-1;i++) {
            char ch1 = str2.charAt(i);
            char ch2 = str2.charAt(i+1);
            if((ch1>='a' && ch2<='z') && (ch2>='a' && ch2<='z')) set2.add(ch1+""+ch2);
        }

        for(String s:set1) {
            if(set2.remove(s)) intersection.add(s);
            union.add(s);
        }
        
        for(String s:set2) union.add(s);
        
        if(union.size() == 0) jakard = 1;
        else jakard = (float)intersection.size() / union.size();
        return (int)(jakard * 65536);
    }
}
public class newsClustering {
	public static void main(String[] args) {
		Solution43 sol = new Solution43();
		String str1 = "handshake";
		String str2 = "shake hands";
		int answer = sol.solution(str1,str2);
		System.out.println(str1 + " & " + str2 + " = " + answer);
	}
}