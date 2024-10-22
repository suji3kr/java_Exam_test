package Exam.src.exam1_12;

import java.util.Scanner;

public class ArrayRemoveOf {
    static int[] arrayRmvOf(int[] a, int idx) {
        // 인덱스가 유효한지 확인
        if (idx < 0 || idx >= a.length) {
            return a.clone(); // 유효하지 않으면 원본 배열 반환
        } else {
            int[] c = new int[a.length - 1];
            int i = 0;
            // 삭제할 인덱스까지 복사
            for (; i < idx; i++)
                c[i] = a[i];
            // 삭제할 인덱스 이후 복사
            for (; i < c.length; i++)
                c[i] = a[i + 1];
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요소 수:");
        int num = stdIn.nextInt();
        int[] x = new int[num]; // 요소 수 num인 배열

        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "]:");
            x[i] = stdIn.nextInt(); // stdIn을 srdIn으로 변경
        }
        System.out.print("삭제할 요소의 인덱스: ");
        int idx = stdIn.nextInt(); // stdIn을 srdIn으로 변경

        int[] y = arrayRmvOf(x, idx); // 배열 x에서 x[idx]를 삭제한 배열 생성

        for (int i = 0; i < y.length; i++) // 배열 y 표시
            System.out.println("y[" + i + "]=" + y[i]);

        stdIn.close(); // Scanner 닫기
    }
}
