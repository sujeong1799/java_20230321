package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map01 {

	public static void main(String[] args) {
		/* Map
		 * - 값을 2개 저장, key / value 값으로 저장
		 * - key는 중복불가, value는 중복가능
		 * - HashMap을 가장 많이 사용
		 * 
		 * HashMap<String, Integer> map = new HashMap<String, Integer>();
		 *                                              ↑ 생략가능
		 * Map은 값이 2개여서 Iterator를 사용할 수 없음
		 * Map -> set으로 변경 후 출력 
		 * 
		 * list, set => .add() // 값 추가할때    .get(index); // 값 뽑을때
		 * map => .put(); // 추가 
		 * getkey(), getValue(); // 추출
		 * */
		
		HashMap<String, Integer> map = new HashMap();
		map.put("햄버거", 7000);
		map.put("피자", 15000);
		map.put("음료", 2000);
		map.put("과자", 2000);
		map.put("사탕", 500);
	
		System.out.println("1"+map);
		System.out.println(map.keySet()); // key값
		System.out.println(map.values()); // value 값
		
		//key가 햄버거인 값을 출력
		System.out.println(map.get("햄버거")); // .get(key값)을 주면 value값이 나온다.
		
		//
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+" : "+map.get(key));
		}
		System.out.println();
		//향상된 for문 
		System.out.println("---향상된 for문");
		for(String tmp : map.keySet()) {
			System.out.println(tmp+":"+map.get(tmp));
		}
		System.out.println();
		System.out.println("-----entry이용");
		System.out.println(map.entrySet()); // entry는 []로 나오고
		System.out.println(map); // map은 {}로 나옴
		
		System.out.println();
		System.out.println("---entrySet이용");
		for(Map.Entry<String, Integer> tmp : map.entrySet()) {
			System.out.println(tmp.getKey()+":"+tmp.getValue());
			
		}
		System.out.println();
		
		int sum = 0;
		for(int tmp : map.values()) {
			sum += tmp;
		}
		System.out.println(sum);
		
		
		
		//선생님버전
		sum = 0;
		for(String tmp : map.keySet()) {
			sum += map.get(tmp);
		}
		System.out.println(sum);
		
		
		
	}

}
