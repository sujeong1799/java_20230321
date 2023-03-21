package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		/* 하루 일과를 저장하는 list <String>으로 생성
		 * */
		
		ArrayList<String> Mylist = new ArrayList<String>(); 
		
		Mylist.add("일어나기");
		Mylist.add("학원가기");
		Mylist.add("공부하기ㅡㅡ");
		Mylist.add("맛.있.는 점심 묵기^ㅇ^");
		Mylist.add("과제.. 나머지는 안돼!");
		Mylist.add("집가기");
		Mylist.add("복습하기");
		Mylist.add("나만의 시간ㅋ");
		Mylist.add("울면서 자기");
		
		System.out.println(Mylist);
		
		System.out.println(Mylist.get(4));
		System.out.println(Mylist.set(1, "버스타고 학원가기 끼약"));
		System.out.println(Mylist);

		String a = "집가기";
		Mylist.remove(a);
		System.out.print(Mylist+" ");
		System.out.println();
		System.out.println();
		System.out.println("----for문으로 요소 출력----");
		for(String tmp : Mylist) {
			System.out.println(tmp);
		}
		
		System.out.println("--------------------");
		Iterator<String> it = Mylist.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.print(tmp+ " ");
			
		}
		
		Collections.sort(Mylist);
		System.out.println(Mylist); // 가나다라 순서대로 나옴
		
		Mylist.sort(new Test());
		System.out.println(Mylist);
		
	}

}

class Test implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	


	
}


