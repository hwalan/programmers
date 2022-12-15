package Hash;

import java.util.HashMap;
import java.util.Map;

public class Level1_2 {
	
	/*수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
	
	마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
	완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.*/
	
	public static void main(String[] args) {
		
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		String answer = "";
		Map<String, Integer> all = new HashMap<String, Integer>();
		
		for (String str : participant) {
			all.put(str, all.getOrDefault(str, 0) + 1);
		}
		
		for (String str : completion) {
			all.put(str, all.get(str)-1);
		}
		
		for (String str : all.keySet()) {
			if (all.get(str) != 0) {
				answer = str;
			}
		}
		
		System.out.println(answer);
		
	}

}
