package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class 과제2_선생님 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap();
		Scanner scan = new Scanner(System.in);
		
		int exit = 1; // exit = 0이면 종료
		
		while(exit != 0) {
			//입력
			System.out.println("과목과 점수를 입력해주세요.");
			String subject = scan.next();
			int score = scan.nextInt();
			
			map.put(subject, score);
			System.out.println("계속:1, 종료:0");
			exit = scan.nextInt();
		}
		
		
		int sum = 0;
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String subject = it.next();
			sum += map.get(subject); // 과목의 값이 누적이 될거임.
			System.out.println(subject+":"+map.get(subject));
		}
		
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+(double)sum/map.size());
	
	
	}

}
