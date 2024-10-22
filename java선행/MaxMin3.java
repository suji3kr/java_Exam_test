import java.util.Scanner;

public class MaxMin3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요 (종료하려면 Q 또는 q 입력): ");
            String inputA = scanner.next();

            // "Q" 또는 "q"가 입력되면 루프 종료
            if (inputA.equalsIgnoreCase("Q")) {
                break;
            }

            System.out.print("두 번째 숫자를 입력하세요 (종료하려면 Q 또는 q 입력): ");
            String inputB = scanner.next();

            // "Q" 또는 "q"가 입력되면 루프 종료
            if (inputB.equalsIgnoreCase("Q")) {
                break;
            }

            try {
                // 입력값을 정수로 변환
                int a = Integer.parseInt(inputA);
                int b = Integer.parseInt(inputB);
                int max, min;

                // 최대값과 최소값 계산
                if (a > b) {
                    max = a;
                    min = b;
                } else {
                    max = b;
                    min = a;
                }

                // 결과 출력
                System.out.println("max = " + max);
                System.out.println("min = " + min);

            } catch (NumberFormatException e) {
                System.out.println("유효하지 않은 입력입니다. 숫자를 입력하세요.");
            }
        }

        // Scanner 리소스 닫기
        scanner.close();
    }
}
