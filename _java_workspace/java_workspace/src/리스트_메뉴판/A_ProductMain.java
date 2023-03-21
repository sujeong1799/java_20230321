package 리스트_메뉴판;

import java.util.Scanner;

public class A_ProductMain {

	public static void main(String[] args) {
		
		A_productManager pm = new A_productManager();
		
		Scanner scan = new Scanner(System.in);
		pm.addmenu();

		int menu = 0;
		
		while(menu != 5) {
			
			System.out.println("1.상품추가 | 2. 가격수정 ");
			System.out.println("3.상품삭제 | 4. 상품리스트");
			System.out.println("5.상품주문 | 6. 주문내역");
			System.out.println("7.종료");
			
			menu = scan.nextInt();
			
			switch (menu) {
			case 1:
				pm.add(scan);
				break;
			case 2:
				pm.update(scan);
				break;
			case 3:
				pm.delete(scan);
				break;
			case 4:
				pm.printProduct();
				break;
			case 5:
				pm.orderPick(scan);
				break;
			case 6:
				pm.printOrder();
				break;
			case 7:
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}

}
