package day10;

public class EzenComputer {
		/* - 학생기본정보 : 이름, 생년월일, 나이, 전화번호
		 * - 학원정보 : 학원이름 = "EZEN", 지점
		 * - 수강정보 : 수강과목, 수강기간
		 * - 한 명의 학생은 여러 과목을 수강할 수 있따. (그럼 과목이 여러개.,.,.,)
		 * 과목, 기간 = > 배열로 처리 (길이는 5)
		 * 
		 * 출력 
		 * 홍길동, 990909, 20, 010-3333-3333
		 * EZEN, 인천
		 * JAVA(6개월), DB(1개월), html(2개월)
		 * 
		 * 메서드 기능
		 * - 학생의 기본정보 출력 메서드
		 * - 학원의 학원정보 출력 메서드
		 * - 수강정보 출력 메서드
		 * - 학생의 수강정보를 추가하는 기능
		 * */
	
	private String name;
	private String datebirth;
	private int age;
	private String number;
	private final static String ezen = "EZEN";
	private String place;
	
	String[] group = new String[5];
	
	
	
	//생성자
	public EzenComputer() {
		
	}
	
	// 학생 기본정보 생성자
	public EzenComputer(String name, String datebirth, int age, String number, String place) {
		super();
		this.name = name;
		this.datebirth = datebirth;
		this.age = age;
		this.number = number;
		this.place = place;

	}
	
	
	// 메서드
	
	//학생의 기본정보 출력 메서드
	public void studentPrint() {
		System.out.println("이름 : "+name);
		System.out.println("생년월일 : "+ datebirth);
		System.out.println("나이 : "+age);
		System.out.println("전화번호 : "+number);
	}
	
	
	
	//학원의 학원정보 출력 메서드
	public void ezenPrint() {
		System.out.println("학원 : "+ezen);
		System.out.println("지점 : "+place);
	}
	
	
	// 수강정보
	public void addGroup(String g) {
		for(int i=0; i<group.length; i++) {
			if(group[i]==null) {
				group[i] = g;
				break;
			}
		}
	}
	
	
	public void mGroup(String g) {
		for(int i=0; i<group.length; i++) {
			
		}
	}
	
	// 수강정보 출력 메서드
	public void groupPrint() {
		for(int i=0; i<group.length; i++) {
			if(group[i]!=null) {
				System.out.println(group[i]);
			}else {
				break;
			}
				
		}
	}
	
	
	
	
	
	
	// getter/setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDatebirth() {
		return datebirth;
	}

	public void setDatebirth(String datebirth) {
		this.datebirth = datebirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String[] getGroup() {
		return group;
	}

	public void setgroup(String[] group) {
		this.group = group;

		
	}

	public String getEzen() {
		return ezen;
	}
	
	

	
	
}
