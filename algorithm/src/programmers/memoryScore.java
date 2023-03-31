package programmers;
class Solution17 {
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i=0;i<photo.length;i++){
            for(int j=0;j<photo[i].length;j++){
                for(int k=0;k<name.length;k++){
                    if(photo[i][j].equals(name[k])) answer[i] += yearning[k];
                }
            }
        }
        return answer;
    }
}

public class memoryScore {
	public static void main(String[] args) {
		Solution17 sol = new Solution17();
		String[] name = {"may", "kein", "kain", "radi"};
		int[] yearning = {5, 10, 1, 3};
		String[][] photo = {
				{"may", "kein", "kain", "radi"},
				{"may", "kein", "brin", "deny"},
				{"kon", "kain", "may", "coni"}
		};
		
		for(int i=0;i<sol.solution(name,yearning,photo).length;i++) System.out.println(sol.solution(name,yearning,photo)[i]);
	}
}
