import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in); // 입력을 위한 Scanner 객체 생성
        System.out.println("카운트다운 합니다."); // 사용자에게 카운트다운 시작 알림
        int x; // 카운트다운할 숫자를 저장할 변수

        // 양의 정수 입력을 받을 때까지 반복
        do {
            System.out.print("양의 정숫값: "); // 사용자에게 양의 정수를 입력하라는 메시지 출력
            x = stdIn.nextInt(); // 사용자로부터 입력받은 정수를 x에 저장
        } while (x <= 0); // 입력값이 0 이하일 경우 다시 입력 받기

        // x가 0 이상일 동안 반복하여 카운트다운
        for (; x >= 0; x--)
            System.out.println(x); // 현재 x 값을 출력
    }
}
