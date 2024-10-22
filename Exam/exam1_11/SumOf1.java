package exam1_11;

import java.util.Scanner;

class SumOf1 {
    //---배열 a의 모든 요소의 합을 구한다--//
    // 일반 for 루프를 사용하여 배열 요소의 합을 계산하는 메서드
    static int sumOf(int[]a) {
        int sum =0;
        for (int i = 0; i < a.length; i++)
            sum += a[i];
        return sum;
    }
    // 확장 for 문을 사용하여 배열 요소의 합을 계산하는 메서드
    static int sumOf2 (int[]a) {
        int sum =0;
        //확장 for문
        for (int i :a)
            sum += i;
        return sum;
    }


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소 수:");
        int num = stdIn.nextInt();
        int[]x = new int[num];  // num 개의 요소를 가지는 배열


        //배열에 요소 입력받기
        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]:");
            x[i] = stdIn.nextInt();
        }

        // 첫 번째 메서드를 사용하여 합계 계산 및 출력
        System.out.println("모든 요소의 합은 " + sumOf(x) +"입니다.");
        // 두 번째 메서드를 사용하여 합계 계산 및 출력
        System.out.println("모든 요소의 합 (확장 for문 사용): " + sumOf2(x) + "입니다.");
    }
}

