package step2;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======" + "계산기를 실행합니다" + "======");
        String str1 = " ";
        while (str1.equals(" ")) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            if (num1 < 0 || num2 < 0) {
                System.out.println("0 이상의 양의 정수를 입력해주세요.");
                continue;
            }
            System.out.print("사칙 연산 기호를 입력하세요 (+,-,*,/): ");
            char c = sc.next().charAt(0);
            // TODO : Calculator 계산하는 기능 호출





            System.out.print("계산을 계속 하겠습니까? (exit 입력시 종료): ");
            String str2 = sc.next();
            if (str2.equals("exit")) {
                System.out.println("계산기 프로그램을 종료합니다");
                break;}
        } sc.close();





    }
}
