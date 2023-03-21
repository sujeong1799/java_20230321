package day12;

public class Exception05 {

	public static void main(String[] args) {
		int arr[]; //null
		int max=10, min=1, size=5;
		
		
		try {
			int arr1[] = randomArr(max, min, size);


		} catch (Exception e) {
			
		}
		System.out.println("종료합니다.");

	}
	
	
	//메서드 생성
	/* 기능 : 배열의 길이(size)가 주어지면 길이만큼 배열을 생성해서 배열을 돌려주는 메서드 
	 * 값은 random으로 반환 => random의 범위는 max, min
	 * - size가 0보다 작다면 예외발생
	 * - max가 0보다 작다면 예외발생
	 * throw로 발생..? 
	 * */
	
	public static int[] randomArr(int max, int min, int size) {
		
		
		if(size <= 0) {
		throw new RuntimeException("배열의 길이가 0보다 작습니다.");
		}
		if(max <=0) {
			throw new RuntimeException("random 범위가 0보다 작습니다.");

		}
		
		int[] arr = new int[size];
		for(int i=0; i<arr.length; i++) {
		arr[i] =(int)(Math.random()*(max-min+1))+min; 
		
		}

		return arr;
	}
			
			
	/* 배열을 받아서 배열에 랜덤값을 채우는 메서드
	 * 
	 * - 배열이 null일 경우 예외발생
	 * - 배열의 길이가 0보다 작을 경우
	 * 
	 * */
	
	public static void randomArr2(int[] arr, int max, int min) throws Exception { // throws Exception 없으면 에러
		
		if(arr == null) {
			throw new Exception("배열이 null 입니다.");
		}
		if(arr.length == 0) {
			throw new Exception("배열길이가 0입니다.");
		}
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*(max-min+1))+min;
		}
		

	}

}
