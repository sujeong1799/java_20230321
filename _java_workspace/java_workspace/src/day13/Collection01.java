package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Collection01 {

	public static void main(String[] args) {
		/* 컬렉션 프레임워크 : 표준화된 방식의 자료구조
		 * List, Set, Map
		 * 데이터를 묶어서 관리할 때 사용
		 * 주로 배열대신 사용
		 * 
		 * List : 배열과 동일
		 * 	- 값을 하나씩 저장 
		 *  - 순서를 보장 (선입선출)
		 *  - 중복을 허용
		 *  - 배열 대신 가장 많이 사용
		 * 
		 * set 
		 *  - 값을 하나씩 저장
		 *  - 순서를 보장하지 않음 (index) 번지가 없다.
		 *  - 중복 X
		 *  
		 * Map
		 *  - 값을 두개 저장, key/value 쌍으로 저장
		 *  - key는 중복 불가, value는 중복 가능
		 *  - key가 중복되면 덮어쓰기 됨.
		 *  - 아이디 / 패스워드처럼 같이 묶어서 하나의 자료로 저장해야 할 때 사용
		 *
		 * int arr[]; : 기본 자료형 사용가능.
		 * collection에서는 어떤 클래스로 데이터를 관리할지 지정해줘야 한다.
		 * 
		 * int -> Integer, String
		 * 나머지 자료형들은 첫글자를 대문자로 만들어주면 됨. -> Byte, Boolean...
		 * 클래스를 지정하지 않으면 Object가 자동으로 들어간다.
		 * 
		 * */
		
//		List list1 = new List(); // 쓸 수 없음. 에러남 
		List list1 = new ArrayList(); // 전부 import해서 써야함. // 클래스 지정 안함 Object클래스 자동지정 케이스
//		ArrayList = 구현된 리스트?
		ArrayList list2 = new ArrayList(); // Object 클래스 자동지정
		
		// 숫자만 가능한 ArrayList 생성
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//문자열만 가능한 ArrayList 생성
		ArrayList<String> list3 = new ArrayList<String>(); 
//		          ↑ 클래스 넣는곳
		
		//add() : 요소를 추가
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println("list 출력 : "+list); // List는 기본 toString을 가지고 있어서 [1, 2, 3] 이런식으로 출력함.
		
		//size() : list의 총 개수
		
		System.out.println("총 개수 : "+list.size());
		
		System.out.println();
		
		// list3에 문자 5개 지정후 출력, 총 개수 출력 
		list3.add("강백호");
		list3.add("서태웅");
		list3.add("정대만");
		list3.add("송태섭");
		list3.add("채치수");
		
		System.out.println("list3 출력 : "+list3);
		System.out.println("총 개수 : "+list3.size());
		
		System.out.println();
		//리스트를 생성하고 1~10까지 저장한 후 출력
		System.out.println("리스트 생성 후 1~10까지 저장 후 출력");
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		
		int size = 10; // 사이즈 정하고 들어가도 됨
		for(int i=0; i<size; i++) {
			list4.add(i); 
			
		}
		System.out.println(list4);
		
		System.out.println();
		//get(index) : index 번지의 값을 가져와라
		System.out.println("get을 이용해 값 가져오기");
		System.out.println(list4.get(0)); // 0번지 가져와서 찍어
		System.out.println(list4.get(1));

		System.out.println();
		//set(index, 값) : index번지 값을 이걸로 바꿔
		System.out.println("set을 이용해 값 바꾸기");
		list4.set(0, 11);
		System.out.println(list4.get(0));
		System.out.println(list4);
		
		System.out.println();
		//remove(index) : index 번지값 삭제
		//remove(Object) : Object 값을 넣으면 값으로 삭제된다.
		System.out.println("remove로 0번지 삭제");
		list4.remove(0);
		System.out.println(list4);
		System.out.println();
		System.out.println("Object 값으로 삭제");
		Integer  a = 3;
		list4.remove(a);
		System.out.println(list4);
		
		System.out.println();
		//contains(Object) : list에 값이 있는지 검사 있으면 true / 없으면 false
		System.out.println("clear로 싹 다 지우기");
		list4.clear(); // 싹 다 지워라
		System.out.println(list4);
		
		System.out.println();
		//isEmpty() : list가 비었는지 체크 비어있으면 true
		System.out.println("isEmpty으로 비어있는지 체크");
		System.out.println(list4.isEmpty());
		
		System.out.println();
		System.out.println("1~5까지 입력 후 요소 출력");
		//list4에 for문으로 1~5까지만 입력
		size = 5;
		for(int i = size; i>0; i--) {
			list4.add(i);
		}
		System.out.println(list4);
		
		//list4 요소 출력
		for(int i = 0; i<list4.size(); i++) {
			System.out.print(list4.get(i)+" ");
		}
		System.out.println();
		System.out.println("-------------------");
		//향상된 for문으로 요소 출력 -> 요즘 자주 사용함 
		for(int tmp : list4) {
			System.out.print(tmp + " ");
		}
		System.out.println(); 
		System.out.println("-------------------");
		
		//Iterator : 컬렉션을 출력하기위해 사용
		/* list는 순서를 보장하기 때문에 get(i)를 이용하여 원하는 번지에 접근 가능
		 * Set은 순서를 보장하지 않기 때문에 for문을 이용하지 못함.
		 * 그래서 Iterator나 향상된 for문 처럼 순서와 상관없이 값을 가져올 수 있는 구문에서 출력가능.
		 * 
		 * */
		System.out.println();
		System.out.println("Iterator로 출력");
		Iterator<Integer> it = list4.iterator();
		while(it.hasNext()) {// hasNext() :  다음 요소가 있는지 체크 값이 있으면 true / false
			Integer tmp = it.next(); // next() 다음 요소 가져오기
			System.out.print(tmp+" ");
	
		}
		System.out.println();
		
		System.out.println();
		System.out.println("indexOf로 위치 찾기?");
		//indexOf(값) : 해당 값의 list index 번지를 반환  (위치를 알고싶을때? 쓴?다?) / 없다면 -1리턴
		Integer b = 5;
		System.out.println(list4.indexOf(b));

		

		
		
		System.out.println();
		System.out.println("sort를 이용한 오름차순, 내림차순");
//		Collections.sort(list4); //오름차순 정렬만 가능하다.
		System.out.println(list4);
		//sort(객체)
		// - 객체 : Comparator 인터페이스를 구현한 객체를 넣어야함. ( 익명클래스를 사용)
		// - 비교(Compare) 메서드를 사용하여 객체를 정렬 
		//내림차순 / 오름차순
		list4.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// o1 - o2 : 오름차순
				// o2 - o1 : 내림차순  
				
				return o1 - o2; // 작으면 앞으로가고 크면 뒤로가 
			}
			
		});
		System.out.println(list4);
		
		
	}
}
