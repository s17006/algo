// ユークリッドの互除法によって最大公約数を求める

import java.util.Scanner;

class EuclidGCD {

    //--- 整数値x, yの最大公約数を求めて返却 ---//
    static int gcd(int x, int y) {
        while(y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return(x);
    }
    static int gcdArray(int[] a, int start, int no) {
        if (no == 1)
            return a[start];
        else if(no == 2)
            return gcd(a[start],a[start+1]);
        else
            return gcd(a[start],gcdArray(a, start + 1, no -1));
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("何個の整数の最大公約数を求めます。");
        int num;
        do {
            num = stdIn.nextInt();
        }while(num <= 1);

        int[] x = new int[num];
        for(int i = 0; i < num; i++) {
            System.out.print("x["+i+"]:");
            x[i] = stdIn.nextInt();
        }
        System.out.println("最大公約数は" + gcdArray(x,0,num) + "です。");
    }
}
