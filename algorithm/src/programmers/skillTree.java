package programmers;
import java.util.*;
class Solution51 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        String[] str = skill.split("");
        List<String> list = Arrays.asList(str);
        for(int i=0;i<skill_trees.length;i++) {
            int check = 1;
            for(int j=0,k=0;j<skill_trees[i].length();j++) {
                String compare = String.valueOf(skill_trees[i].charAt(j));
                if(list.contains(compare)) {
                    if(compare.equals(list.get(k))) k++;
                    else {
                        check = 0; break;
                    }
                } 
            }
            if(check == 1) answer++;
            check = 1;
        }
        
        return answer;
    }
}
public class skillTree {
	public static void main(String[] args) {
		Solution51 sol = new Solution51();
		String skill = "CBD";
		String[] tree = {"BACDE", "CBADF", "AECB", "BDA"};
		
		System.out.println("���� ��ų ���� : " + skill);
		System.out.println("����ڰ� ���� ��ų Ʈ�� : ");
		for(int i=0;i<tree.length;i++) System.out.println(tree[i]);
		
		System.out.println("\n��� ������ ��ų Ʈ�� ���� : "+sol.solution(skill, tree));
	}
}