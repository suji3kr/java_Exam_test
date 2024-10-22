import java.util.Scanner;

public class EvenNumberInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("숫자를 입력하세요 (종료하려면 Q 또는 q 입력): ");
            String input = scanner.next();

            // "Q" 또는 "q"가 입력되면 루프 종료
            if (input.equalsIgnoreCase("Q")) {
                break;
            }

            try {
                // 입력값을 정수로 변환
                int number = Integer.parseInt(input);

                // 짝수인 경우에만 출력
                if (number % 2 == 0) {
                    System.out.println("입력한 짝수: " + number);
                }
                // 홀수인 경우는 출력하지 않음

            } catch (NumberFormatException e) {
                System.out.println("유효하지 않은 입력입니다. 숫자를 입력하세요.");
            }
        }

        // Scanner 리소스 닫기
        scanner.close();
    }
}
