package day11;

public class CustomerMain {

	public static void main(String[] args) {
		
		
		Customer[] customerList = new Customer[10]; // 10개의 객체를 담을 배열? 똑같은 값을 반복해서 담을 순 없다.
		//업캐스팅 => 묵시적인 형변환이 가능
		// 다운캐스팅 => 반드시 명시적으로 형변환을 해줘야함
		
		//업캐스팅했다가 다운은 가능하지만 안될수도 이썽요

		Customer cLee = new Customer(10001,"홍길동");
		Customer gHong = new GoldCustomer(10002,"윤민영");
		Customer vChoi = new VipCustomer(10003,"망난이",11311);
		
		//VIP에 대한 상담사를 가져오고 싶으면 다운캐스팅을 해줘야한대요 
		//다운캐스팅 하는방법?
//		GoldCustomer vCustomer =(VipCustomer)vChoi; //(VipCustomer)넣으면 됨
		//instanceof : 원래 인스턴스의 형이 맞는지 여부를 체크하는 명령어 true/false 임
		if(vChoi instanceof VipCustomer) { // vChoi가 VipCustomer인지 
			VipCustomer vCustomer = (VipCustomer)vChoi;
			vCustomer.getAgentID();
		}else if(vChoi instanceof GoldCustomer) {
			GoldCustomer vCustomer = (GoldCustomer)vChoi;
			vCustomer.getSaleRatio();
		}else {
			System.out.println("error");
		}
		
		
		
		int cnt=0;
		customerList[cnt] = cLee;
		cnt++;
		customerList[cnt] = gHong;
		cnt++;
		customerList[cnt] = vChoi;
		cnt++;
		
		
		System.out.println("-----고객 정보 출력-----");
		//for문을 활용해서 고객정보 출력
		for(int i=0; i<cnt; i++) {
		customerList[i].customerInfo();
		}
		
		System.out.println("---할인율과 포인트 계산---");
		int price=100_000;
		
		//for문을 활용하여 할인율과 포인트 계산 내역 출력
		for(int i=0; i<cnt; i++) {
			System.out.println(customerList[i].customerName+"님이 지불하실 금액 : "+customerList[i].calcPrice(price));
			System.out.println(customerList[i].customerName+"남의 현재 보너스 포인트는 "+customerList[i].bonusPoint+"점 입니다.");
			System.out.println();
		}
		
		
		
		
//		cLee.calcPrice(1000000);
//		cLee.customerInfo();
//		cLee.calcPrice(10000);
//		cLee.customerInfo();
//		
//		
//		gHong.customerInfo();
//		
//		vChoi.customerInfo();
//		
//		
//		System.out.println("=====할인율과 포인트 계산=====");
//		int price = 100000;
//		int cost =cLee.calcPrice(price);
//		System.out.println(cLee.getCustomerName()+"님이 지불하실 금액은 "+ cost+"원입니다.");
//		System.out.println(cLee.getCustomerName()+"님의 현재 포인트는 "+cLee.bonusPoint+"점 입니다.");
//		
		
//		
//		price = 100000;
//		int cost1 = gHong.calcPrice(price);
//		System.out.println(gHong.getCustomerName()+"님이 지불하실 금액은 "+ cost1+"원입니다.");
//		System.out.println(gHong.getCustomerName()+"님의 현재 포인트는 "+gHong.bonusPoint+"점 입니다.");
//		
//		price = 100000;
//		int cost2 = vChoi.calcPrice(price);
//		System.out.println(gHong.getCustomerName()+"님이 지불하실 금액은 "+ cost2+"원입니다.");
//		System.out.println(gHong.getCustomerName()+"님의 현재 포인트는 "+vChoi.bonusPoint+"점 입니다.");
		
		
		
		
		
		
//		System.out.println();
//		GoldCustomer c = new GoldCustomer();
//		c.setCustomerID(00010);
//		c.setCustomerName("홍길동");
//		c.calcPrice(20000);
//		c.customerInfo();
		
		
//		VIPCustomer v = new VIPCustomer();
//		v.setCustomerID(00030);
//		v.setCustomerName("홍이");
//		v.calcPrice(20000);
//		v.customerInfo();
	}

}
