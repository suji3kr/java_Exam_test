public class MaxMin {
    public static void main(String[] args) {

        int a = 3;
        int b = 8;
        int max = 0, min = 0;

        if (a > b) {
            max = a;
            min = b;

        } else {
            max = b;
            min = a;
        }
        System.out.println("max=" + max);
        System.out.println("min=" + min);
    }
}