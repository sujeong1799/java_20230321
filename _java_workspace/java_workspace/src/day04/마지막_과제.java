package day04;

import java.util.Scanner;

public class 마지막_과제 {

	public static void main(String[] args) {
		/* 주사위를 던져서 총 30칸을 이동하면 완주
		 * 주사위 : 1 ~ 6까지의 랜덤 수 o 
		 * 주사위 : 3
		 * 3칸 전진 > 27칸 남았습니다. 
		 * 주사위 : 6
		 * 6칸 전진 > ~칸 남았습니다.
		 * ...
		 * 도착~!! 총 이동횟수 : ?번입니다. 
		 * */
		
		//주사위 맹들기
		
		int random = 0; // 주사위 값
		int sum = 0; // 이동거리 합산
		int count = 0; // 주사위 던진 횟수 (이동횟수)
		int last = 30; // 최종 목표값
		
		while(sum < last) { // sum이 last가 될때까지 반복
			random = (int)(Math.random()*6)+1; // 1~6까지 랜덤수 생성
			sum += random; // 거리합산
			count++; // 이동횟수

			System.out.println("주사위 : "+random+"칸 전진 = > "+(last-sum)+"칸 남았습니다.");	
		
	}System.out.println("도착!! 총 이동횟수 : "+count);


		
	}
}


