package day11;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 5개의 문자열 배열을 생성한 후, 5개의 파일명을 입력받는 코드를 작성
		 * 입력받은 파일 중 이미지 파일 검색하여 출력하는 코드
		 * 이미지파일 형식은 (jpg, png, gif, jpeg)
		 * String[] fileName = {"java.txt", "String.jpg", "method.png",
		 * "String.pdf", "java.pdf"}
		 * 
		 *  여기서 이미지 확장자만 출력하세요
		 *  ----이미지 파일----
		 *  String.jpg
		 *  method.png
		 * */
		String[] img = {"jpg", "png", "gif", "jpeg"};
		
		String[] fileName = new String[5];
		
		//파일명 입력받는 코드
		System.out.println("파일명을 입력해주세요 (5개)");
		for(int i=0; i<fileName.length; i++) {
		Scanner scan = new Scanner(System.in);
		fileName[i] = scan.next();
		}
		
		for(int i=0; i<fileName.length; i++) {
			for(int j=0; j<img.length; j++) {
				if(fileName[i].contains(img[j])) {
					System.out.println(fileName[i]);		
				}
			}
		}
	
	}
	
	
}
