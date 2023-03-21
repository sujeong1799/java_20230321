package day14;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx01 {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		String curr = today.toString();
		System.out.println(curr);
		//2023-02-17T15:31:32.747972300
		//날짜만 분리시켜 추출하여 찍기
		//subString, indexOf 사용
		System.out.println(curr.substring(0,curr.indexOf("T")));
		
		LocalDate mon = today.toLocalDate();
		System.out.println(mon);
		
		System.out.println(curr.substring(11, curr.indexOf(".")));
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(dtf.format(today));
		
		
		//내가 원하는 날짜 생성
		LocalDateTime sDate = LocalDateTime.of(2009, 9, 30, 8, 30, 55);
		System.out.println(sDate.format(dtf));
		
	}

}
