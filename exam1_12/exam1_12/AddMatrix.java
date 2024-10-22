package Exam.src.exam1_12;

public class AddMatrix {
    static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
        // 행렬 크기 비교
        if (x.length != y.length || y.length != z.length || x[0].length != y[0].length || y[0].length != z[0].length) {
            return false;
        }
        // 행렬 더하기
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) { // j를 증가시키도록 수정
                z[i][j] = x[i][j] + y[i][j];
            }
        }
        return true;
    }

    static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) { // j를 증가시키도록 수정
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = {{6, 3, 4}, {5, 1, 2}};
        int[][] c = new int[2][3];

        if (addMatrix(a, b, c)) { // a, b의 합을 c에 대입
            System.out.println("행렬 a");
            printMatrix(a);
            System.out.println("\n행렬 b");
            printMatrix(b);
            System.out.println("\n행렬 c");
            printMatrix(c);
        } else {
            System.out.println("행렬의 크기가 일치하지 않습니다.");
        }
    }
}
