package Stack;

import java.util.ArrayList;
import java.util.List;

public class Level2_2 {
	
	/*프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.
	
	또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.
	
	먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때 
	각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.*/
	
	public static void main(String[] args) {
		
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		
		int[] temp = new int[progresses.length];
		
		for (int i = 0; i < progresses.length; i++) {
			temp[i] = (int) Math.ceil((double) (100 - progresses[i]) / (double) speeds[i]);
		}
		
		List<Integer> list = new ArrayList<Integer>();
		
		int preDay = temp[0];
		int count = 0;
		
		for (int i = 0; i < temp.length; i++) {

			if (preDay >= temp[i]) {
				count++;
			} else {
				list.add(count);
				count = 1;
                preDay = temp[i];
			}
			
			if (i == temp.length-1 && count != 0) {
				list.add(count);
			}
		}
        
        int[] answer = new int[list.size()];
		
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		for (int i : answer) {
			System.out.print(i + " ");
		}
	}

}
