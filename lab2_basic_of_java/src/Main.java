import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int[] arr = new int[100]; // 存放Q的位置
        int i = 0;
        int cnt = scan.nextInt();

        // 用户输入Q的位置
        while (cnt != 0) {
            arr[i++] = cnt;
            cnt = scan.nextInt();
        }

        // 把Q存放自己的位置
        char[][] table = new char[i][i];
        for (int j = 0; j < i; j++) {
            int curr = arr[j];
            table[curr - 1][j] = 'Q';
        }

        boolean safe = isSafe(table);

        if (safe)
            System.out.println("Safe");
        else
            System.out.println("Not Safe");
    }

    // 判断皇后位置是否安全
    public static boolean isSafe(char[][] table) {
        int n = table.length;

        // 检查每一行是否只有一个皇后
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (table[i][j] == 'Q') {
                    count++;
                    if (count > 1) {
                        return false; // 不安全
                    }
                }
            }
        }

        // 检查每一列是否只有一个皇后
        for (int j = 0; j < n; j++) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (table[i][j] == 'Q') {
                    count++;
                    if (count > 1) {
                        return false; // 不安全
                    }
                }
            }
        }

        // 检查主对角线是否只有一个皇后
        for (int k = 0; k < n * 2 - 1; k++) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                int j = k - i;
                if (j >= 0 && j < n) {
                    if (table[i][j] == 'Q') {
                        count++;
                        if (count > 1) {
                            return false; // 不安全
                        }
                    }
                }
            }
        }

        // 检查次对角线是否只有一个皇后
        for (int k = 1 - n; k < n; k++) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                int j = i + k;
                if (j >= 0 && j < n) {
                    if (table[i][j] == 'Q') {
                        count++;
                        if (count > 1) {
                            return false; // 不安全
                        }
                    }
                }
            }
        }

        return true; // 安全
    }
}