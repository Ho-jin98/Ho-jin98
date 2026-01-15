package step2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("======" + "계산기를 실행합니다" + "======");
        String input1 = " ";
        while (input1.equals(" ")) {
            try {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = Integer.parseInt(sc.next());
                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = Integer.parseInt(sc.next());
                if (num1 < 0 || num2 < 0) {
                    System.out.println("두 숫자 모두 0 이상의 양의 정수를 입력해주세요.");
                    continue;
                }
                    System.out.print("사칙연산 기호(+, -, *, /)를 입력해주세요: ");
                    char c = sc.next().charAt(0);
                    if (c != '+' && c != '-' && c != '*' && c != '/') {
                        System.out.println("사칙연산 기호(+, -, *, /)중 하나를 입력하세요.");
                    continue;
                    }
                    //TODO : default가 클래스 안으로 들어가서 if문 활용
                    //TODO : calculator 기능 호출
                    int result = calculator.calculate(num1, num2, c);
                    //TODO : 반환 값을 받아주는 상자를 만들어 줘야함, -> int result
                    System.out.println("계산 결과: " + result);
                    calculator.setResults(result);
                    //TODO : 저장하는 기능을 호출하기
                    //TODO : Calculator 클래스에 void로 출력문이 있음.
                    System.out.print("첫 번째 결과 값을 삭제하겠습니까? (yes/no): ");
                    String input3 = sc.next();
                    if (input3.equalsIgnoreCase("yes")) {
                        calculator.removeResults();
                    } else if (input3.equalsIgnoreCase("no")) {
                        System.out.println("현재 저장되어 있는 결과 값: " + calculator.getResults());
                        //TODO : .getResults() > 게터를 사용하여 저장되어 있는 값들을 보여줌
                    } else {
                        System.out.println("yes와 no중에 입력해주세요");
                        continue;
                    }

            }catch(Exception e){
                    System.out.println("숫자만 입력하세요");
                    continue;
                }
            System.out.println("계산을 계속 하겠습니까?");
            System.out.print("exit 입력시 종료, 계속 하려면 아무거나 입력: ");
            String input2 = sc.next();
            if (input2.equalsIgnoreCase("exit")) {
                System.out.println("계산기 프로그램을 종료합니다");
                break;
            }
    //TODO :  equalsIgnoreCase >> 대,소문자가 섞여 있어도 상관없이 처리해줌
    //TODO :  .toLowerCase(); >> 들어오는 문자 모두 소문자로 바꿔줌
    //TODO :  .toUpperCase(); >> 들어오는 문자 모두 대문자로 바꿔줌

        } sc.close();

    }
}