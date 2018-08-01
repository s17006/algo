// 単純挿入ソート

import java.util.Scanner;

class InsertionSort {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }

    //--- 単純挿入ソート ---//
    static void insertionSort(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i+1; j < n; j++){
                if (a[j]<a[min])
                    min = j;
            }
            for (int m = 0; m < n; m++){
                if (m == i){
                    System.out.print("  * ");
                }
                else if (m == min){
                    System.out.print("  + ");
                }
                else{
                    System.out.print("    ");
                }
            }
            System.out.println("");
            for (int m = 0; m < n; m++)
                System.out.printf("%3d ",a[m]);
            System.out.println("");
            swap(a,i,min);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("単純挿入ソート");
        System.out.print("要素数：");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]：");
            x[i] = stdIn.nextInt();
        }

        insertionSort(x, nx);				// 配列xを単純挿入ソート

        System.out.println("昇順にソートしました。");
        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "]＝" + x[i]);
    }
}
