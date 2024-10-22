import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in); // 입력을 위한 Scanner 객체 생성
        int n; // 사용자로부터 입력받을 양의 정수 변수

        // 양의 정수를 입력받을 때까지 반복
        do {
            System.out.print("양의 정숫값: "); // 사용자에게 양의 정수를 입력하라는 메시지 출력
            n = stdIn.nextInt(); // 사용자로부터 입력받은 정수를 n에 저장
        } while (n <= 0); // 입력값이 0 이하일 경우 다시 입력 받기

        int factorial = 1; // 팩토리얼 값을 저장할 변수, 초기값은 1
        int i = 1; // 곱셈을 위한 변수 i, 초기값은 1

        // 1부터 n까지 반복하여 팩토리얼 계산
        while (i <= n) {
            factorial *= i; // 현재 i 값을 factorial에 곱함
            i++; // i를 1 증가시킴
        }

        // 결과 출력
        System.out.println("1부터 " + n + "까지의 곱은 " + factorial + "입니다."); // 팩토리얼 결과 출력
    }
}
