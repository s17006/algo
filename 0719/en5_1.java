// 階乗値を再帰的に求める

import java.util.Scanner;

class Factorial {

	//--- 非負の整数値nの階乗値を返却 ---//
	//static int factorial(int n) {
	//	if (n > 0)
	//		return n * factorial(n - 1);
	//	else
	//		return 1;
	//}
    static int factorial(int n) {
        int a = 1;
        for (int i = 1; i <= n;){
            a = a * i;
            i += 1;
        }
        return a;
    }
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数を入力せよ：");
		int x = stdIn.nextInt();

		System.out.println(x + "の階乗は" + factorial(x) + "です。");
	}
}
