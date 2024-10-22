import java.util.Scanner;

public class Test_03 {
    public static void main(String[] args) {


        Scanner stdIn = new Scanner(System.in);

        System.out.println("요소 수 :");
        int n = stdIn.nextInt();            //요소 수 입력
        int[] a= new int[n];           //배열생성

        for (int j =0; j < n; j++){
            System.out.println("a["+j+"]=");
            a[j] = stdIn.nextInt();
        }

        System.out.println("찾을 숫자: ");
        int key = stdIn.nextInt();

        int i;
        for (i = n-1; i >=0; i--)
            if (a[i]==key)
                break;

        if (i >= 0)   //탐색 성공
            System.out.println("그 값은 a ["+ i + "]에 있습니다.");
        else          // 탐색 실패
            System.out.println("해당 값이 존재하지 않습니다.");
    }
}
