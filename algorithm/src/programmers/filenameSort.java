package programmers;
import java.util.Arrays;
class Solution46 {
    public String[] solution(String[] files) {
        int len = files.length, check = 100;
        String[] answer = new String[len];
        String[][] imply = new String[len][3];
        String head = "", number = "", tail = "";
        
        for(int i=0;i<files.length;i++) {
            for(int j=0;j<files[i].length();j++) {
                char ch = files[i].charAt(j);
                if(j<check && ch >= '0' && ch <= '9') {
                    head = files[i].substring(0,j); 
                    check = j;
                }
                if(j>check && (ch>'9' || ch<'0')) {
                    number = files[i].substring(check,j); 
                    tail = files[i].substring(j); 
                    break;
                }
            }
            check = 100;
            imply[i][0] = head; imply[i][1] = number; imply[i][2] = tail;
        }
        
        Arrays.sort(imply, (o1,o2) -> {
            if(o1[0].toLowerCase().compareTo(o2[0].toLowerCase()) > 0) return 1;
            else if(o1[0].toLowerCase().compareTo(o2[0].toLowerCase()) < 0) return -1;
            else {
                if(Integer.parseInt(o1[1]) > Integer.parseInt(o2[1])) return 1;
                else if(Integer.parseInt(o1[1]) < Integer.parseInt(o2[1])) return -1;
                else return 0;
            }
        });
        for(int i=0;i<len;i++) answer[i] = imply[i][0]+imply[i][1]+imply[i][2];
        return answer;
    }
}
public class filenameSort {
	public static void main(String[] args) {
		Solution46 sol = new Solution46();
		String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
		String[] sort_files = sol.solution(files);
		for(int i=0;i<files.length;i++) {
			System.out.println("정렬 전 : "+files[i]+" | "+"정렬 후 : "+sort_files[i]);
		}
	}
}