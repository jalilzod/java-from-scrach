import java.util.Scanner;

public class spirial {


    public static void  main(String[]args) {
        int MAX_SIZE = 100;
        int n, i, j, num = 1;
        int [][]matrix = new int[MAX_SIZE][MAX_SIZE];

        // 用户输入N
        System.out.println("Enter the size of the snake matrix "+ MAX_SIZE);
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        // 初始化矩阵
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                matrix[i][j] = 0;
            }
        }

        // 填充贪蛇
        int row = 0, col = 0;
        while (num <= n * n) {
            // 向右填充
            while (col < n && matrix[row][col] == 0) {
                matrix[row][col++] = num++;
            }
            col--;  // 回退到上一个位置
            row++;  // 向下移动一行

            // 向下填充
            while (row < n && matrix[row][col] == 0) {
                matrix[row++][col] = num++;
            }
            row--;  // 回退到上一个位置
            col--;  // 向左移动一列

            // 向左填充
            while (col >= 0 && matrix[row][col] == 0) {
                matrix[row][col--] = num++;
            }
            col++;  // 回退到上一个位置
            row--;  // 向上移动一行

            // 向上填充
            while (row >= 0 && matrix[row][col] == 0) {
                matrix[row--][col] = num++;
            }
            row++;  // 回退到上一个位置
            col++;  // 向右移动一列
        }

        // 打印贪蛇矩阵
        System.out.println("Snake Matrix:\n");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
