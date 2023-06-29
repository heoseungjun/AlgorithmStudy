package programmers;
class Solution42 {
    public int solution(String dirs) {
        int answer = 0, check = 0;
        int[][] visit = new int[11][11];
        int x = 6, y = 5;
        visit[x][y] = 1;
        for(int k=0; k<dirs.length(); k++){
            if(dirs.charAt(k)=='U') {
                if(y==0) continue;
                else visit[x][--y] += 1;
            }
            else if(dirs.charAt(k)=='D') {
                if(y==10) continue;
                else visit[x][++y] += 1;
            }
            else if(dirs.charAt(k)=='R') {
                if(x==10) continue;
                else visit[++x][y] += 1;
            }
            else {
                if(x==1) continue;
                else visit[--x][y] += 1;
            }
            if(visit[x][y] == 2) check++;
            if(visit[x][y] == 1 || check == 1) answer++;
        }
        return answer;
    }
}
public class visitLength {
	public static void main(String[] args) {
		Solution42 sol = new Solution42();
		String dirs = "ULURRDLLU";
		System.out.println("방문 길이 : "+sol.solution(dirs));
	}
}