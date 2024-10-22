import java.util.Scanner; // Scanner를 사용해 사용자 입력을 받기 위한 클래스 임포트

// 별을 원하는 개수만큼 출력하는 프로그램
public class Test02 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in); // 입력을 받을 Scanner 객체 생성
        System.out.print("몇개의 *를 표시할까요?: "); // 사용자에게 몇 개의 별을 출력할지 물어보기
        int n = stdIn.nextInt(); // 입력받은 개수를 n에 저장

        // 사용자가 입력한 개수가 0보다 클 때만 별을 출력
        if (n > 0) {
            // n만큼 반복하며 별 출력
            for (int i = 0; i < n; i++)
                System.out.print('*'); // 별을 한 줄에 출력
            System.out.println(); // 별 출력 후 줄바꿈
        }
    }
}
