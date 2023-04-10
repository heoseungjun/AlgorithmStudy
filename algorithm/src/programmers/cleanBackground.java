package programmers;
import java.lang.Math;
class Solution21 {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int l,r,u,d;
        l = u = 50;
        r = d = 0;
        
        for(int i=0;i<wallpaper.length;i++){
            for(int j=0;j<wallpaper[i].length();j++){
                if(wallpaper[i].charAt(j)=='#'){
                    l = Math.min(l,j);
                    u = Math.min(u,i);
                    r = Math.max(r,j);
                    d = Math.max(d,i);
                }
            }
        }
        answer[0] = u;answer[1] = l;answer[2] = d+1;answer[3] = r+1;
        return answer;
    }
}
public class cleanBackground {
	public static void main(String[] args) {
		Solution21 sol = new Solution21();
		String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
		for(int i=0;i<4;i++) System.out.println("드래그 범위 위쪽-왼쪽-아래쪽-오른쪽 순서 : "+sol.solution(wallpaper)[i]);
	}
}
