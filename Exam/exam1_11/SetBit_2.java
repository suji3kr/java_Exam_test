package exam1_11;//임의의 비트를 조작
import java.util.Scanner;
class SetBit_2{
    //---int형 비트구성--//
    static void printBits(int x) {
        for (int i = 31; i>=0; i--)
            System.out.print(((x>>> i &1) == 1) ? '1':'0');
    }

    //--- x의 pos 위치에 있는 비트부터 n개 비트를 1로 변경한 값을 반환 --//
    static int setN(int x,int pos, int n) {
        return x | (~(~0 << n )<<pos);
    }
    //--- x의 pos 위치에 있는 비트부터 n개 비트를 0로 변경한 값을 반환 --//
    static int resetN (int x,int pos, int n) {
        return x & ~(~(~0 << n )<<pos);
    }
    //--- x의 pos 위치에 있는 비트부터 n개 비트를 반전시킨 값을 반환 --//
    static int inverseN (int x,int pos, int n) {
        return x ^ (~(~0 << n )<<pos);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수x의 pos번째 비트를 변경합니다.");
        System.out.print("x: "); int x = stdIn.nextInt();
        System.out.print("pos: "); int pos = stdIn.nextInt();
        System.out.print("n: "); int n = stdIn.nextInt();

        System.out.print("x                     = "); printBits(x);
        System.out.print("\nset(x,pos,n)        = "); printBits(setN(x,pos,n));
        System.out.print("\nreset(x,pos,n)      = "); printBits(resetN(x,pos,n));
        System.out.print("\nnverse(x,pos,n)     = "); printBits(inverseN(x,pos,n));
        System.out.println();
    }
}

