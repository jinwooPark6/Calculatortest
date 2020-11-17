package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator cal = new Calculator();
		System.out.println("덧셈 계산기");
		System.out.println("더하실 숫자를 입력해주세요");
		System.out.println("숫자 1: ");
		cal.setNum1(scanner.nextInt());
		System.out.println("숫자 2: ");
		cal.setNum2(scanner.nextInt());
		cal.setResult(cal.getNum1() + cal.getNum2());
		System.out.println("합: " + cal.getResult());
	}

}
