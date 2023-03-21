package day11;

public class 추상클래스01 {

	public static void main(String[] args) {
		/* 추상메서드 : 메서드의 선언부만 있고, 구현은 없는 메서드
		 * 추상클래스 : 추상메서드 + 일반메서드 + 멤버변수 + 상수(final) 있음
		 * 추상클래스 : 미완성 클래스라 객체를 생성할 수 없다.
		 * 
		 * 추상인지 아닌지 어떻게 알 수 있을까? 추상키워드로 알아보기 가능ㅋ
		 * abstract : 미완성이니 에러나지마라~ 객체생성못해~ (클래스명 앞/ 메서드 앞에 추가하면 됨)
		 * abstract 리턴타입 메서드명(매개변수);
		 * - 부모 클래스에서 상속 받았을 때 특정 메서드가 자식 클래스에 자주 오버라이딩 될 때
		 * 	 해당 메서드를 추상 메서드로 작성
		 * 
		 * - 상속을 받은 클래스에서는 추상메서드가 있다면 '반드시' 구현해야 한다.
		 */ 
		
		Dog d = new Dog("멍멍쓰","개과");
		d.printInfo();
		d.howl();
		
		
		//추상클래스는 객체 생성 불가능
//		Cat c = new Cat("냥이쓰","고양이과"); 
		
		
		Tiger t = new Tiger("랭이쓰","고양이과");
		t.printInfo();
		t.howl();

	}

}

//Animal 클래스 = 추상클래스.
abstract class Animal{ //같은패키지면 같은 이름 못 쓴다. (클래스앞에 abstract을 붙이면 추상클래스 됨) (추상클래스에서는 누가 일반이고 누가 추상인지 모르기때문에 abstract 붙여야함)
	private String name;
	private String category;
	
	public void printInfo() {
		System.out.println("---------------");
		System.out.println("이름 :"+name);
		System.out.println("종류 :"+category);
	}
	
	
	abstract public void howl(); // 추상메서드 (추상클래스가 아닌데 추상메서드를 포함하니까 에러가 난다)


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
}

//추상클래스 Animal을 상속받는 클래스 Dog, Cat
class Dog extends Animal{



	public Dog(String name, String category) {
		super.setName(name);
		super.setCategory(category);
	}

	@Override
	public void howl() {
		System.out.println("으릉렁렁렁ㄹㅇ멍");
		
	}
	
}
//추상클래스를 상속받는 자식클래스는 반드시 추상메서드를 구현해야 한다.
//자식클래스가 추상클래스면 구현안해도 됨.

abstract class Cat extends Animal{
	
	
	public Cat(String name, String category) {
		super.setName(name);
		super.setCategory(category);
	}

	@Override
	public void howl() {
		System.out.println("냐아앙오농");
	}
	
}

class Tiger extends Animal{

	public Tiger(String name, String category) {
		super.setName(name);
		super.setCategory(category);
	}
	
	@Override
	public void howl() {
		System.out.println("어~흥!");
		
	}
	
}
