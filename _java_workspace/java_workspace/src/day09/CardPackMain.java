package day09;

public class CardPackMain {

	public static void main(String[] args) {
		
		/* 카드 생성
		 * 
		 * */
		
		Card c = new Card(); // 기본 생성자를 주면 1하트 나오게 이미 설정.

		
		//pack을 통으로 찍는건 안됨. 		
		CardPack cp = new CardPack();   
//		for(int i=0; i<52; i++) {
//			System.out.println(cp[i]); // 에러 에러 에러
//		} 
		
//		Card tmp = cp.pick(); // 가장 위에 있는 카드 한장을 tmp에 저장
//		tmp.Print();
//		
//		tmp = cp.pick(); // 가장 위에 있는 카드 한장을 tmp에 저장
//		tmp.Print();
//		
//		tmp = cp.pick();
//		tmp.Print();
		
		
		
		//모양대로 4열횡대
		//한 모양이 끝나면 줄바꿈
		
//		for(int i=1; i<=4; i++) { // 1.문자 찍고
//			System.out.println(); // 3. 줄바꿈해줘.
//			for(int j=1; j<=13; j++) { // 2. 숫자 찍어
//				Card tmp = cp.pick();
//				tmp.Print();
//			}
//
//		}
		for(int i=1; i<53; i++) {//52로 하면 마지막 하트1이 안찍힘./i=0으로하면 ◆K 혼자 ㅇ떨어짐
			Card tmp = cp.pick();
			tmp.Print();
			if(i%13==0) {
				System.out.println();
			}
		}
		System.out.println();

		System.out.println("------------------------------------");
		
		cp.init();// 다시 52개 생성
		cp.shuffle(); // 섞기!
		 a: for(int i=1; i<=4; i++) { 
			for(int j=1; j<=13; j++) {
				Card tmp = cp.pick();
				if(tmp != null) { //tmp가 null이 아니면 print
					tmp.Print();
				}else { // null이면 카드가 없습니다.
					System.out.println("카드가 없습니다.");
					break a;
				}
			  }
			System.out.println(); //줄바꿈 프린트
			}
		 
		
		
		System.out.println("------------------------------------");

		cp.init();// 다시 52개 생성
		cp.shuffle(); // 섞기!
		cp.pick().Print();


			
	
	}
}
