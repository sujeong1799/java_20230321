package day10;

public class EzenComputerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] group = new String[5];
		String[] month = new String[5];
		
		EzenComputer ez = new EzenComputer();
		ez.setName("홍길동");
		ez.setDatebirth("010101");
		ez.setAge(40);
		ez.setNumber("01000001111");
		ez.studentPrint();
		
		ez.ezenPrint();
		ez.setPlace("인천");
		ez.ezenPrint();
		
		ez.addGroup("JAVA(6개월)");
		ez.groupPrint();
		ez.addGroup("DB(2개월)");
		ez.addGroup("html(1개월)");
		ez.addGroup("컴활(5개월)");
		ez.groupPrint();
		
		System.out.println();
		
		EzenComputer ez1 = new EzenComputer("김땡이","020202",20,"01001011010","안산");
		ez1.studentPrint();
		ez1.addGroup("JAVA(1개월)");
		ez1.addGroup("html(2개월)");
		ez1.groupPrint();
		ez1.ezenPrint();
		


		
	}

}
