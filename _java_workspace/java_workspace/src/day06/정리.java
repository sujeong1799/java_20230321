package day06;

public class 정리 {

	public static void main(String[] args) {
		/* 정리
		 * 
		 * 1. 변수
		 * ◈ 일반변수(지역변수, 기본형변수) : 값을 저장하는 기본 메모리공간
		 *  - 정수형 : int, byte, short, long(접미사L)
		 *  - 실수형 : double, float(접미사f)
		 *  - 문자형 : char(정수형으로 분류하기도 한다. 왜? 유니코드표에 코드로 저장되어 있어서) : 딱 한글자만 받아들임
		 *  - 논리형 : boolean(true/false)
		 *  
		 * ◈ 참조변수 : 객체의 주소를 저장하는 변수(객체명) 객체는 new 키워드를 통해 객체 생성
		 * (String은 자주 쓰여서 new를 안써도 생성된다)
		 * 
		 * ◈ 자료형 변환 : 변수, 상수, 리터럴 값들을 일시적으로 다른 자료형으로 변환
		 *  - 자동형변환 : 정수 -> 실수, 작은바이트 -> 큰바이트
		 *  - (수동)명시적형변환 : 자동으로 형변환이 안되는 경우 (자료형)변수명
		 *  
		 * 2. 연산자
		 * ◈ 대입연산자 (=)
		 *  - 오른쪽에 있는 값을 왼쪽 변수에 저장
		 *  - 왼쪽에는 반드시 저장가능한 변수/객체가 와야한다.
		 *  - 왼쪽과 오른쪽의 자료형은 반드시 같아야함.
		 * 
		 * ◈ 산술연산자 ( + - * / %)
		 *  - 정수 / 정수 = 정수
		 *  - 나누기할때 0으로 나누면 에러 발생 (0으로 나눌수없음)
		 * 
		 * ◈ 비교연산자 ( >=, <=, >, <, ==, != )
		 *  - 항상 결과가 true / false로 표현
		 * 
		 * ◈ 논리연산자 ( &&, ||, ! )
		 *  - && : and 여러개의 조건이 모두 맞아야 true 하나라도 틀리면 false ~이고, ~면서
		 *  - || : or  여러개의 조건 중 하나만 맞아도 true ~이거나, 또는
		 *  - ! : not 현재 조건의 반대
		 *  
		 * ◈ 증감연산자 ( ++, -- )
		 *  - 1씩증가, 1씩 감소 위치에 따라 증가되고 감소되는 순서가 결정됨.
		 *  - i++, ++i
		 *  
		 * ◈ 조건선택연산자 ( (조건식) ? true : false)
		 *  - 조건식이 참이면 true값 아니면 false값 선택
		 *  
		 * 3. 조건문 : 조건식이 참이면 실행문을 실행
		 * ◈ if, switch
		 *  - if : 조건식이 반드시 true / false로 구분되어야 함.
		 *  - switch : 값이 나오는 식, 변수  
		 *  	- 반드시 하나의 case가 끝나면 break 문을 닫아줘야한다.
		 *  	- break를 생략하면 하위 모든 case가 실행된다.
		 *  
		 * 4. 반복문 : 규칙성이 있는 반복을 할 때
		 * ◈ for, while, do~while문 : 조건식은 true 조건으로 작성.
		 * 		for(초기화, 조건식; 증감식){
		 * 		실행문;
		 * 		}
		 * 	
		 * 		while(조건식) {
		 * 			실행문;
		 * 		}
		 * 		- 실행문에 반드시 조건식이 false가 될 수 있는 구문을 포함.
		 * 
		 * 		do {      
		 * 			실행문;
		 * 		} while(조건식);
		 * 		- 무조건 1번은 실행되어야하는 반복문에서 사용.
		 * 
		 * 5. break, continue문
		 * ◈ break : 반복문을 빠져나가기위한 구문 / if문을 같이 동반한다.
		 *  - switch문에서 case를 빠져나가기위해 쓰기도한다.
		 * 
		 * ◈ continue : pass하는 역할
		 *  - 조건이 맞을 때 실행하지않고, 다음 증감으로 이동
		 *  - while문에서는 증감식 찾을 수 없기 때문에 바로 조건식으로 이동한다. (무한루프 조심)
		 *  
		 * 6. 배열
		 *  - 동일한 자료형을 가진 데이터를 모아놓은 형태
		 *  - 배열 선언
		 *  	자료형 배열명[] = new 자료형[개수] // 선언하고 배열 생성
		 *  	자료형[] 배열명 = new 자료형[개수]
		 *  	둘 다 같은 의미임
		 *  - 배열의 index는 0부터 시작 ~ 배열.length-1 (-1붙이는 이유? 0부터 시작하니까.)
		 *  - 배열.length : 배열의 총 길이
		 *  - 배열[index] = 값; // 배열의 index 번지에 값을 저장
		 *  - 변수 = 배열 [index]; // 배열의 index 번지의 값을 변수로 추출
		 *  
		 * */

	}

}
