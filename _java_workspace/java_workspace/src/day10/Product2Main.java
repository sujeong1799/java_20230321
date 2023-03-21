package day10;

import java.util.Scanner;

public class Product2Main {

	public static void main(String[] args) {
		
		
		Product2[] p = new Product2[10]; // 배열 
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		char menu = 'y';
		int cnt=0;  //p객체의 인덱스를 핸들링하기 위한 변수 (배열을 다 안채워도 프린트 가능하게)
		
		while(menu != 'n') { // n이 아닐때까지 돌릴거야
			System.out.println("상품을 등록하시겠습니까? (y/n)");
			menu = scan.next().charAt(0);
			
			if(menu == 'y') {
				System.out.println("상품명 > ");
				String name = scan.next();
				
				System.out.println("가격 > ");
				int price = scan.nextInt();

				//생성자를 이용하여 객체 생성 후 배열에 객체 담기
//				Product2 tmp = new Product2(name, price);
//				p[cnt]=tmp;
				
				
				//insertProduct 메서드를 활용하여 객체 생성 후 등록
				p[cnt] = new Product2(); // 비어있는 객체 생성
				p[cnt].insertProduct2(name, price);
				cnt++; // index 증가
				//입력받은 값을 바로 더하는 방법
//				sum = sum + price;

			}else{
				if(menu=='n') {
					System.out.println("상품등록 종료");
					
				}else {
					System.out.println("y/n만 입력 가능합니다.");	
				}
			
			}
			
		}
		
		System.out.println("-----등록된 제품-----");
		for(int i=0; i<cnt; i++) {
			
			//메서드 사용한 경우
//			System.out.println(p[i].출력 메서드명);
						
			// toString이 있으면 가능
			System.out.println((i+1)+"번째 상품 : "+p[i]);
			sum=sum+p[i].getPrice(); // sum 총합계 구하는법
			
		}
		System.out.println(cnt+"개의 상품, 상품 총 가격 : "+sum);

		
		
		
		
	}

}
