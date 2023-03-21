package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set01 {

	public static void main(String[] args) {
		/* Set 순서보장X, 중복X
		 * HashSet
		 * index가 없음.
		 * 
		 * */
		
		HashSet<String> set = new HashSet<String>();
		set.add("바나나");
		set.add("딸기");
		set.add("바나나");
		set.add("복숭아");
		System.out.println(set);
		set.add("홍길동");
		set.add("이순신");
		
		System.out.println(set);
		
		//for문을 이용해서 set을 돌릴수는 없음. 왜? get(index)이 없으니까
		//향상된 for문은 됨
		
		for( String tmp : set ) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.print(tmp+" ");
		}
		
		//set은 순서가 없어서 정렬이 안됨 -> set을 list로 변환한 후 정렬
		//중복된것을 걸러낼때 쓴당
		System.out.println();
		List<String> list = new ArrayList<String>(set); // set을 list로 바꾸는방법
		Collections.sort(list);
		System.out.println(list);
		
		
		// 내림차순
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
			
				return o2.compareTo(o1);
			}
			
		});
		
		System.out.println(list);
	}

}
