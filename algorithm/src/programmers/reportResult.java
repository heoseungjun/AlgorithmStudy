package programmers;
import java.util.*;
class Solution14 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        // report���� ���� ������ �ߺ� ����
        HashSet<String> set = new HashSet<String>(Arrays.asList(report));
        // �ʿ��� ���� : �Ű����� �Ű� ���, �Ű����Ƚ�� - �����ؾ��ϴ���
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<id_list.length;i++) map.put(id_list[i],0);
        for(int i=0;i<report.length;i++) {
            String[] arr = report[i].split(" ");
        }
        return answer;
    }
}

public class reportResult {
	public static void main(String[] args) {
		
	}
}
