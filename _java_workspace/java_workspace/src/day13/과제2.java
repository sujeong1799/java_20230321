package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class 과제2 {

	public static void main(String[] args) {
		/* 과목과 점수를 입력받아 출력, 합계, 평균 같이 출력
		 * 종료 키워드가 나올때까지 반복(종료 :0)
		 * 과목과 점수를 입력해주세요 > 0입력시종료 아니면 반복
		 * 국어:89
		 * 수학:97
		 * 0 : 종료
		 * ----
		 * 입력받은 map 출력후 합계:, 평균:
		 * ----
		 * 
		 * 
		 * */

		HashMap<String, Integer> map = new HashMap();
		int sum = 0;
		double avg = 0;
		String str = null;
		
		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.println("과목과 점수를 입력하겠습니까? (y/n)");
			char ch = scan.next().charAt(0);
			if(ch=='n') {
				System.out.println("종료합니다.");
				break;
			}
			if(ch=='y') {
			System.out.println("과목을 입력해주세요.");
			str = scan.next();
			
			System.out.println("점수를 입력해주세요.");
			int num1 = scan.nextInt();

			map.put(str, num1);
			}
			
			sum += map.get(str);
		}
		avg = sum/map.size();
		System.out.println("-------------------------");
		System.out.println(map);
		
		System.out.println("합계:"+sum);
		System.out.println("평균 :"+avg);
		System.out.println("-------------------------");
		}
			
	}


