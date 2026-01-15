package step2;

import java.util.ArrayList;

public class Calculator {
    // 속성
    private ArrayList<Integer> results;
//TODO : ArrayList<Integer>를 results 변수 안에 넣어주는 것,
//TODO : ArrayList<Integer>은 컬렉션에서 제공하는 클래스중 하나이다.

    // 생성자
    public Calculator() {
        this.results = new ArrayList<>();
    }

    // 기능
    public int calculate(int num1, int num2, char c) {
        int result = 0;
        switch (c) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                try {
                    result = num1 / num2;
                    break;
                } catch (ArithmeticException e) {
                    System.out.println("0으로 나눌 수 없습니다");
                }
                break;

            default:
                System.out.print("사칙연산 기호(+, -, *, /)를 입력해주세요: ");
        }
        return result;
    }

    // TODO : 저장하는 기능 (세터 - 변경사항이 생김)
    public void setResults(int result) {
        this.results.add(result);
        // TODO : results.add(result); >> this키워드를 사용하지 않았을 때 에러 발생
        // TODO : IndexOutOfBoundsException >> 인덱스의 범위를 벗어난 에러
        // TODO : Index 3 out of bounds for length 1
        System.out.println("계산 결과 값 저장" + results);
    }
    //TODO : 조회는 저장된 값을 출력하면 됨.

    // TODO : 삭제하는 기능
    public void removeResults() {
        this.results.remove(0);
        System.out.println("첫 번째 결과 값이 삭제되었습니다");
        System.out.println("현재 남아 있는 값: " + results);
    }
    //TODO : 가장 먼저 저장된 데이터 삭제 >> index 0번째
    //TODO : this.results.remove(인덱스 ?번째로 입력)

    //TODO : 게터 - 외부에서 속성을 참조할 수 있게 만들어 주는 기능
    //TODO : 게터를 통해서 사용자가 저장된 값을 삭제하지 않았을 때 남아있는 값을 보여주기 위해
    //TODO : 게터를 사용하여 속성을 참조해서 보여줌
    public ArrayList<Integer> getResults() {
        return results;
    }
    public static int parseInt(String input1, int num1){
        try{
            return Integer.parseInt(input1);
        } catch (NumberFormatException e) {
            return num1;
        }
    }

}