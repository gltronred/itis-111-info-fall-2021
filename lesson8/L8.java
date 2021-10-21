import java.io.*;
import java.util.*;

public class L8 {
  public static void main(String[] args) {
    // Игра "Жизнь" - https://ru.wikipedia.org/wiki/%D0%98%D0%B3%D1%80%D0%B0_%C2%AB%D0%96%D0%B8%D0%B7%D0%BD%D1%8C%C2%BB
    //
    // Поле 10x10, соседняя клетка -
    // по горизонтали, вертикали или диагонали
    // Границы "склеены", у верхней строки -
    // соседи в нижней и наоборот, у крайнего
    // левого столбца - соседи в крайнем правом
    // Клетки либо живые, либо мертвые
    //
    // У живой клетки:
    // >3 соседей - она погибает от перенаселения,
    // <2 - от одиночества
    // У мертвой клетки
    // 3 живых соседа - она рождается
    //
    // Вводится начальное состояние поля
    // (размеры того, что нужно, и сами клетки)
    // Промоделировать один шаг
    // Вывести, что получится

    // 000
    // 010
    // 000
    //
    // 00000  00100
    // 01110  00100
    // 00000  00100
    //
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] count = new int[n][n];
    char[][] matrix = new char[n][n];
    int[][] matrixint = new int[n][n];

    // Ввод верхнего левого угла матрицы
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < m; j++) {
            matrixint[i][j] = sc.nextInt();
        }
    }

    // Цикл по итерациям, пока не введём 0
    int p = 1;
    while (p == 1) {
        // Подсчёт количества соседей у каждой клетки
        for (int i = 0; i < matrixint.length; i++) {
            for (int j = 0; j < matrixint.length; j++) {
                count[i][j] = -matrixint[i][j];
                for (int k = -1; k <= 1; k++) {
                    for (int l = -1; l <= 1; l++) {
                        count[i][j]+= matrixint[(i + k + n)%(n)][(j + l + n)%(n)];
                    }
                }
            }
        }

        // Изменение состояния клеток
        for (int i = 0; i < matrixint.length; i++) {
            for (int j = 0; j < matrixint.length; j++) {
                if (count[i][j] < 2) {
                    matrixint[i][j] = 0;
                }
                if (count[i][j] > 3) {
                    matrixint[i][j] = 0;
                }
                if (count [i][j] == 3) {
                    matrixint[i][j] = 1;
                }
            }
        }

        // Вывод
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                if (matrixint[i][j] == 1){
                    matrix[i][j] = '*';
                } else {
                    matrix[i][j] = ' ';
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        p = sc.nextInt();
    }
  }
}
