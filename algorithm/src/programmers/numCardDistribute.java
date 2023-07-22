package programmers;
import java.lang.Math;
class Solution54 {
	public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0, num1 = arrayA[0], num2 = arrayB[0], a_check = 0, b_check = 0;
       
        for(int i=1;i<arrayA.length;i++) {
            num1 = gcd(arrayA[i],num1);
            num2 = gcd(arrayB[i],num2);
        }
        
        for(int i=0;i<arrayA.length;i++) {
            if(arrayA[i] % num2 == 0) a_check++;
            if(arrayB[i] % num1 == 0) b_check++;
        }
        
        if(a_check == 0 && b_check == 0) answer = Math.max(num1,num2);
        else if(a_check == 0 && b_check != 0) answer = num2;
        else if(b_check == 0 && a_check != 0) answer = num1;
        return answer;
    }
    public int gcd(int x, int y) {
        if(y == 0) return x;
        return gcd(y, x%y);
    }
}
public class numCardDistribute {
	public static void main(String[] args) {
		Solution54 sol = new Solution54();
		int[] arrayA = {14, 35, 119};
		int[] arrayB = {18, 30, 102};
		
		System.out.println("arrayA�� arrayB�� �� ���� : ");
		for(int i=0;i<arrayA.length;i++) {
			System.out.println(arrayA[i]+" "+arrayB[i]);
		}
		
		System.out.println("\narrayA(or B)�� ��� ���Ҹ� ���� �� ������ arrayB(or A)�� ��� ���ҿ� ������ �������� �ʴ� �� �� �ִ�");
		System.out.println(": "+sol.solution(arrayA, arrayB));
	}
}