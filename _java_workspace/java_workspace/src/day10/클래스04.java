package day10;

public class 클래스04 {

	public static void main(String[] args) {
		
		//생성자를 이용하여 객체 생성
		Car c1 = new Car();
		c1.setColor("빨강");
		c1.setDoor(4);
		c1.setAirback(true);
		c1.Print();
		
		Car c2 = new Car("노랑", 2, false);
		c2.Print();
		c2.powerOn();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
	
		System.out.println(c1);
		System.out.println(c2); // 클래스에 toString을 찾아서 있으면 찍어주고 없으면 주소값이 나옴.
		
	}

}


class Car{
	//멤버변수 : color, door, airback, power, speed
	
	private String color;
	private int door;
	private boolean airback;
	private boolean power;
	private int speed; 
	
	
	
	//생성자 : 빈생성자, color, (color,door), (color,door,airback), 전체 생성자
	
	
	public Car() {} // 기본생성자
	
	public Car(String color) { 
		this.color = color; 
		// this는 멤버변수를 의미 
		// 멤버변수와 매개변수의 이름이 같을경우 멤버변수라는 것을 표시하기 위해 사용
	}
	
	public Car(String color, int door) {
		this.color = color;
		this.door = door;
	}
	
	public Car(String color, int door, boolean airback) {
		
		this(color, door); // 위에 있는 생성자 호출 (하나라도 다른애 있으면 못부름)
		this.airback = airback;
	}

	//생성자 자동생성
	
	public Car(String color, int door, boolean airback, boolean power, int speed) {
		//super(); // 부모의 생성자를 호출 (기본생성자) (지금 필요하지 않아서 주석처리) 
		this.color = color;
		this.door = door;
		this.airback = airback;
		this.power = power;
		this.speed = speed;
	}
	

	
	//method : print, powerOn, powerOff, speedUP, speedDown
	
	public void Print() {
		//멤버변수는 내 클래스에서 모든 메서드에서 공유되는 변수
		//멤버변수를 매개변수로 받을 필요가 없음.
		System.out.println("------MyCar------");
		System.out.println(color);
		System.out.println("door : "+door);
		System.out.println("airback 유무 : "+airback);
		System.out.println("-----------------");
	}


	public void powerOn() {
		System.out.println("시동이 켜졌습니다.");
		power = true; 
	}
	
	public void powerOff() {
		System.out.println("시동이 꺼졌습니다.");
		power = false;
	}
	
	public void speedUp() {
		if(power) {
		speed = speed + 10;
		System.out.println("시속 : "+speed);
		}else {
			System.out.println("시동을 먼저 켜주세요.");
		}
	}
	
	public void speedDown() {
		if(speed > 0) {
		speed = speed - 10;
		System.out.println("시속 : "+speed);
		}else {
			System.out.println("시속 : "+speed);
		}
	}
	
	public void airback() {
		if(airback) {
			System.out.println("에어백이 장착되어 있습니다.");
		}else {
			System.out.println("에어백이 없는 차량입니다.");
		}
	}
	
	// toString : 멤버변수들을 출력해주는 메서드
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", door=" + door + ", airback=" + airback+ "]";
	}
	
	
	
	//getter/setter
	


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public boolean isAirback() {
		return airback;
	}

	public void setAirback(boolean airback) {
		this.airback = airback;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	


	
	
	
}