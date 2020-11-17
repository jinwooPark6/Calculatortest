package test;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator cal = new Calculator();
		while (true) {
			System.out.println("2개 숫자 계산기");
			System.out.println("연산을 선택해주세요.");
			System.out.println("1. 더하기 2. 빼기 3. 곱하기 4. 나누기 5. 종료");
			int userNumber = scanner.nextInt();
			if (userNumber == 1) {
				System.out.println("더하실 숫자를 입력해주세요");
				System.out.println("숫자 1: ");
				cal.setNum1(scanner.nextInt());
				System.out.println("숫자 2: ");
				cal.setNum2(scanner.nextInt());
				cal.setResult(cal.getNum1() + cal.getNum2());
				System.out.println("결과: " + cal.getResult());
			} else if (userNumber == 2) {
				System.out.println("빼실 숫자를 입력해주세요");
				System.out.println("숫자 1: ");
				cal.setNum1(scanner.nextInt());
				System.out.println("숫자 2: ");
				cal.setNum2(scanner.nextInt());
				cal.setResult(cal.getNum1() - cal.getNum2());
				System.out.println("결과: " + cal.getResult());
			} else if (userNumber == 3) {
				System.out.println("곱할 숫자를 입력해주세요");
				System.out.println("숫자 1: ");
				cal.setNum1(scanner.nextInt());
				System.out.println("숫자 2: ");
				cal.setNum2(scanner.nextInt());
				cal.setResult(cal.getNum1() * cal.getNum2());
				System.out.println("결과: " + cal.getResult());
			} else if (userNumber == 4) {
				System.out.println("나눌 숫자를 입력해주세요");
				System.out.println("숫자 1: ");
				cal.setNum1(scanner.nextInt());
				System.out.println("숫자 2: ");
				cal.setNum2(scanner.nextInt());
				cal.setResult(cal.getNum1() / cal.getNum2());
				System.out.println("결과: " + cal.getResult());

			} else {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}

		}

	}

}
