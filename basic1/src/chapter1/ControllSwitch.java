package chapter1;

import java.util.Scanner;

public class ControllSwitch {
	
	public static void main(String[] args) {
		
		//	Switch문 : 특정 변수 또는 표현식에 따라 실행할 코드 블럭의 범위를 결정하는 것
		
		/*
		 
		switch (변수-일반표현식) {
		case 값1:
			변수-일반표현식이 값1과 같을때 시작할 코드 블럭 위치
		case 값2:
			변수-일반표현식이 값2과 같을때 시작할 코드 블럭 위치
			switch 내부에서 break문을 만나면 switch 코드블럭을 종료
			break;
		case 값3:
			변수-일반표현식이 값3과 같을때 시작할 코드 블럭 위치
		default:
			변수-일반표현식이 case의 값과 일치하는 것이 없거나
			바로 위에서 break문을 만나지 않으면 실행되는 코드
		}
		
		*/
		//	git체크*
		//	number가 0이면 A,B,C를 출력
		//	1 B,C
		//	2 C
		//	3 D,E,F
		//	4 E,F
		//	0~4가 아니면 F
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력 > ");
		int number;
		number = sc.nextInt();
		switch (number) {
		case 0: System.out.print("A");
		case 1: System.out.print("B");
		case 2: System.out.println("C");break;
		case 3: System.out.print("D");
		case 4: System.out.print("E");
		
		default:System.out.println("F");
			
		}
		sc.close();
		System.out.println("======================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
