// 線形探索（番兵法）

import java.util.Scanner;
class SeqSearchSen {

    //--- 配列aの先頭n個の要素からkeyと一致する要素を線形探索（番兵法）---//
    static int SeqSearcIdx(int[] a, int n, int key,int[] idex){
        int i = 0;

        a[n] = key;					// 番兵を追加

        System.out.print("   |");
        for(; i < n; i++){
            System.out.printf("%4d",i);
        }
        System.out.println();
        System.out.print("---+");
        for(i = 0; i < n; i++){
            System.out.print("----");
        }
        System.out.println();
        int h = 0;
        for(i = 0; i < n; i++) {
            System.out.print("   |");
            String w = "   *";
            String q = "    ";
            String word = "";
            for (int l = 0; l < i; l++){
                word += q;
            }
            System.out.println(word+w);
            System.out.print("  "+i+"|");
            for (int x = 0; x < n;x++){
                System.out.printf("%4d",a[x]);
            }
            System.out.println();
            if (a[i] == key){		// 探索成功
                idex[h] = i;
                h++;
            }
        }
        return h == 0 ? -1 : h;
    }


    //    static int seqSearchSen(int[] a, int n, int key) {
    //        int i = 0;
    //
    //        a[n] = key;					// 番兵を追加
    //
    //        System.out.print("   |");
    //        for(; i < n; i++){
    //            System.out.printf("%4d",i);
    //        }
    //        System.out.println();
    //        System.out.print("---+");
    //        for(i = 0; i < n; i++){
    //            System.out.print("----");
    //        }
    //        System.out.println();
    //        i = 0;
    //        for(;;) {
    //            System.out.print("   |");
    //            String w = "   *";
    //            String q = "    ";
    //            String word = "";
    //            for (int l = 0; l < i; l++){
    //                word += q;
    //            }
    //            System.out.println(word+w);
    //            System.out.print("  "+i+"|");
    //            for (int x = 0; x < n;x++){
    //                System.out.printf("%4d",a[x]);
    //            }
    //            System.out.println();
    //            if (a[i] == key)		// 探索成功
    //                break;
    //            i++;
    //        }
    //        return i == n ? -1 : i;
    //    }
    //
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要素数：");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1];				// 要素数num + 1の配列
        int[] l = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]：");
            x[i] = stdIn.nextInt();
        }

        System.out.print("探す値：");				// キー値の読込み
        int ky = stdIn.nextInt();

        int idx = SeqSearcIdx(x, num, ky, l);		// 配列xから値がkyの要素を探索

        if (idx == -1)
            System.out.println("その値の要素は存在しません。");
        else{
            int a = 0;
            for (; a < idx; a++){
                System.out.print(l[a]);
            }
            System.out.println();
            System.out.println(idx+"個有ります");
            //System.out.println("その値はx[" + idx + "]にあります。");
        }
    }
}
