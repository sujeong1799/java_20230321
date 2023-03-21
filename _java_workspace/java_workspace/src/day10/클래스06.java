package day10;

public class 클래스06 {

	public static void main(String[] args) {
		/* final은 클래스, 변수, 메서드에 붙일 수 있다.
		 * final : 수정할 수 없다.
		 * final 멤버 변수 : 상수
		 * final 멤버 메서드 : 오버라이딩을 할 수 없다.
		 * final 클래스 : 상속 할 수 없다. 부모 클래스가 될 수 없다.
		 * 
		 * 
		 * */
		
		EzenStudent Ezen = new EzenStudent("인천", "홍길동", "JAVA", "01012345678");
		//생성자를 이용한 객체 생성
		
		Ezen.Print();
		
		Ezen.setName("김코난");
		Ezen.Print();
		
		Ezen.setNumber("01011112222");
		Ezen.setGroup("빅데이터어쩌구");
		Ezen.Print();
		
		System.out.println(Ezen);
		
		System.out.println("----Ezen2----");
		
		EzenStudent Ezen2 = new EzenStudent(); // 기본생성자를 이용
		System.out.println(Ezen2);
		Ezen2.setName("남빵댕");
		Ezen2.setGroup("풀스택");
		Ezen2.setNumber("01033332222");
		System.out.println(Ezen2);
		
	}

}

/* 초기화 방법 : 기본값, 명시적 초기값, 초기화 블럭, 생성자
 * 1. 명시적 초기화 : 멤버변수 선언과 동시에 초기값 지정
 * 2. 초기화 블럭 : {}안에  멤버변수들을 초기화 시키는것
 * 3. 생성자 : 객체를 생성할때 초기화해서 생성
 * 
 * 초기값 우선순위 (생성자가 젤 높음)
 * 기본값 ->  명시적 초기값 -> 초기화 블럭 -> 생성자
 * */

//멤버변수 : 지점, 이름, (수업듣는/수강을 원하는)반, 전화번호
//메서드 : 출력 (toString, sysout 둘 다 가능)
class EzenStudent{
	
	private String place = "인천";
//	private final static String palce = "인천"; // 지점은 고정으로 절대 변하지못하게 지정 가능하다.
	private String name;
	private String group;
	private String number; // 010 -> 8진수라서 String으로 받음 연산에 사용될 값만 int로 받자. //전화번호나 주민등록번호를 받을때는 String으로 받자
	{
		//초기화 블럭 : 멤버변수들을 초기화;
		place = "incheon"; // 기초값이 인천이여도 생성자로 초기화하는 값이 있으면 값이 변경 됨.
		group = "미정";
		
	}
	
	public EzenStudent() {}
	

	public EzenStudent(String place, String name, String group, String number) {
		super();
		this.place = place;
		this.name = name;
		this.group = group;
		this.number = number;
	}

	public void Print() {
		System.out.println("-----Ezen-----");
		System.out.println("지점 : " + place);
		System.out.println("이름 : " + name);
		System.out.println("반 : " + group);
		System.out.println("전화번호 : " + number);
		
	}


	@Override
	public String toString() {
		return "EzenStudent [place=" + place + ", name=" + name + ", group=" + group + ", number=" + number + "]";
	}


	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	

	
}
