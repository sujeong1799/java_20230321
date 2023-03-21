package day13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class List02 {

	public static void main(String[] args) {
		/* --메뉴판--
		 * 1. 햄버거 : 7000
		 * 2. 피자 : 15000
		 * 3. 음료 : 2000
		 * 4. 과자 : 2000
		 * 5. 사탕 : 500
		 * 6. 프로그램 종료
		 * 
		 * 메뉴를 선택해주세요. 1, 수량을 선택해주세요. 2 - > 1번메뉴 햄버거 2개 주문
		 * 주문을 끝내시려면 0을 눌러주세요. (프로그램종료 ㄴㄴ 주문만 끝내는거임)
		 * 메뉴를 선택해주세요. 2, 수량을 선택해주세요. 1 -> 2번메뉴 피자 1개 주문
		 * 주문을 끝내시려면 0을 눌러주세요. 0
		 * 프로그램 종료
		 * 
		 * 0을 누르면 메뉴를 선택해주세요가 나와야한다.
		 * 
		 * -- 선택한 메뉴
		 * 햄버거 2개, 피자 1개 선택 총 지불금액 : 100원 입니다
		 * 
		 * 
		 * */

		
		
		FoodManager fm = new FoodManager();
		ArrayList<String> order1 = new ArrayList<String>();
		ArrayList<Integer> order2 = new ArrayList<Integer>();
		
		Scanner scan = new Scanner(System.in);
		int cMenu;
		int cCount = 0;
		int sum = 0;
		
		do {
			fm.PrintMenu();
			cMenu = scan.nextInt();
						
			if(cMenu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
				
			if(cMenu < 6) {
				System.out.println("수량을 선택해주세요.");
				cCount = scan.nextInt(); 
				fm.sale(cMenu, cCount);
				sum += cCount * fm.price.get(cMenu-1);
				order1.add(fm.menu.get(cMenu-1));
				order2.add(cCount);
					
				}else {
					System.out.println("잘못된 메뉴입니다.");					
				}
				
		}while(true);
		
		
		//햄버거 2개, 음료 2개 선 총 지불 금액 : ?
		System.out.println("-----주문 확인-----");
		for(int i=0; i<order1.size(); i++) {
				System.out.print(order1.get(i)+" ");
				System.out.println(order2.get(i)+"개 ");
				
		}
		System.out.println(sum);

	}
}



class FoodManager{
	//멤버변수 ArrayList : 가격리스트, 메뉴리스트 각자 설정 0번지 가격 메뉴는 0번지 메뉴랑 일치 / 추가되면 음식은 메뉴에 음식가격은 가격에 ..
	// 그 외 멤버변수는 알아서 선언
	
	ArrayList<String> menu = new ArrayList<String>();
	ArrayList<Integer> price = new ArrayList<Integer>();

	
	
	//메서드 정의
	//void PrintMenu(),-> 메뉴판 위에꺼 출력하능거임
	public void PrintMenu() {
		System.out.println("-----메뉴판-----");
		System.out.println("1. 햄버거 7000원");
		System.out.println("2. 피자 15000원");
		System.out.println("3. 음료  2000원");
		System.out.println("4. 과자  2000원");
		System.out.println("5. 사탕   500원");
		System.out.println("메뉴를 선택해주세요. 주문 종료 :0");
		add();

	}
	//추가 메서드 void add() -> ?
	public void add() {
		menu.add("햄버거");
		menu.add("피자");
		menu.add("음료");
		menu.add("과자");
		menu.add("사탕");
		
		price.add(7000);
		price.add(15000);
		price.add(2000);
		price.add(2000);
		price.add(500);
		

	}
	
	//
	
	public void menuPrint() {
		
	}
	
	
	//sale(int menu, int count(수량임)) -> 몇개 주문받았다 금액 얼마다 나타내줌
	public void sale(int cMenu, int cCount) {
		
		System.out.println("주문하신 메뉴는 "+ menu.get(cMenu-1)+" "+cCount+"개");
	}
	
	
	
	
	
	
	
	
}


