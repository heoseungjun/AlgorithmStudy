package programmers;
import java.util.Stack;
class Solution20 {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> burger = new Stack<>();
        for(int i=0;i<ingredient.length;i++){
            burger.push(ingredient[i]);
            int size = burger.size();
            if(size>=4){
                if(burger.get(size-4)==1 && 
                   burger.get(size-3)==2 && 
                   burger.get(size-2)==3 && 
                   burger.get(size-1)==1) 
                {
                    answer++;
                    for(int j=size-1;j>size-5;j--) burger.pop();
                }
            }
        }
        return answer;
    }
}

public class hamburger {
	public static void main(String[] args) {
		Solution20 sol = new Solution20();
		int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
		System.out.println("만들 수 있는 햄버개 개수 : "+sol.solution(ingredient)+"개");
	}
}
