package Hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Level2_2 {
	
	/*스파이들은 매일 다른 옷을 조합하여 입어 자신을 위장합니다.
	
	예를 들어 스파이가 가진 옷이 아래와 같고 오늘 스파이가 동그란 안경, 긴 코트, 파란색 티셔츠를 입었다면 
	다음날은 청바지를 추가로 입거나 동그란 안경 대신 검정 선글라스를 착용하거나 해야 합니다.
	
	종류	이름
	얼굴	동그란 안경, 검정 선글라스
	상의	파란색 티셔츠
	하의	청바지
	겉옷	긴 코트
	스파이가 가진 의상들이 담긴 2차원 배열 clothes가 주어질 때 서로 다른 옷의 조합의 수를 return 하도록 solution 함수를 작성해주세요.*/
	
	public static void main(String[] args) {
		
		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		Map<String, Set<String>> map = new HashMap<String, Set<String>>();
		Set<String> set = new HashSet<String>();
		
		for (String[] arr : clothes) {
			
			if (map.get(arr[1]) == null) {
				set = new HashSet<String>();
			} else {
				set = map.get(arr[1]);
			}
			
			set.add(arr[0]);
			map.put(arr[1], set);
		}
		
		int answer = 0;
		
		for (String kind : map.keySet()) {
			if (answer == 0) {
				answer = map.get(kind).size()+1;
			} else {
				answer = answer * (map.get(kind).size()+1);
			}
		}
		
		System.out.println(answer-1);
		
	}

}
