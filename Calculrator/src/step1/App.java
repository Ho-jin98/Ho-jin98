package step1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //TODO : 정수형 int를 0으로 나누게 되면 런타임 에러가 발생함,
        //TODO : 하지만 실수형 double은 0으로 나누어도 에러가 발생하지 않고, infinity 또는 NAM을 반환함
        //TODO : 또는 Try-catch 예외처리 블록 활용
        Scanner sc = new Scanner(System.in);
        System.out.println("======" + "계산기를 실행합니다" + "======");
        String str1 = " ";
        while (str1.equals(" ")) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.print("사칙 연산 기호를 입력하세요 (+,-,*,/): ");
            char c = sc.next().charAt(0);
            switch (c) {
                case '+':
                    System.out.println("덧셈 결과: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("뺄셈 결과: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("곱셈 결과: " + (num1 * num2));
                    break;
                case '/':
                    try {
                        System.out.println("나눗셈 결과: " + (num1 / num2));
                        break;
                    } catch (ArithmeticException e) {
                        System.out.println("0으로 나눌 수 없습니다"); }
                default:
                    System.out.println("사칙연산 기호(+, -, *, /)중 하나를 입력해주세요.");
                    continue;
  //TODO : continue를 사용하여 사용자가 사칙연산 기호를 잘못 입력한 경우 "첫 번째 숫자를 입력하세요"로 돌아감
            }
            System.out.print("계산을 계속 하겠습니까? (exit 입력시 종료): ");
            String str2 = sc.next();
            if (str2.equals("exit")) {
                System.out.println("계산기 프로그램을 종료합니다");
                break;}
        } sc.close();
    }
}
