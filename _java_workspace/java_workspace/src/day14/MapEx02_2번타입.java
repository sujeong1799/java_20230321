package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx02_2번타입 {
	HashMap<String, Integer> map  = new HashMap<>();
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		MapEx02_2번타입 ex = new MapEx02_2번타입();  

		ex.input(ex.map);
		ex.print();
		
		
		
		
		
	}
	public void input(HashMap<String, Integer> map) { // 매개변수 있는 버전.
		int size = 3;

		while(map.size()<size) {

			System.out.println("상품명과 가격을 적어주세요.");
			String name = scan.next();
			int price = scan.nextInt();
		
			map.put(name, price);
		}
				
	}
	
	public void print() { 
		int sum = 0;
		Iterator<String> it = map.keySet().iterator(); // 자료형 잊지말고 넣어주자.
		while(it.hasNext()) {
			String name = it.next(); // key값 반환
			int price = map.get(name); // Value값 반환 map에서 직접호출
			System.out.println("상품명 : "+name+", 가격 : "+price+"원");
			sum += price;
		}
		System.out.println("총 지불 금액 :"+sum+"원");
		
	}
	
}
