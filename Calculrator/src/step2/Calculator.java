package step2;

public class Calculator {

    int num1;
    int num2;
    char c;
    int total = (num1 + num2);


    Calculator(int num1, int num2, char c) {
        this.num1 = num1;
        this.num2 = num2;
        this.c = c;
        this.total = (num1 + num2);
    }

    public int calculator(int num1, int num2) {
        total = (num1 + num2);
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
                    System.out.println("0으로 나눌 수 없습니다");
                }
            default:
                System.out.println("사칙연산 기호(+, -, *, /)중 하나를 입력해주세요.");
        }
        return total;
    }

}

