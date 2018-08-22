// 再帰に対する理解を深めるための真に再帰的なメソッド（再帰を除去）

import java.util.Scanner;

class RecurX2 {

    static IntStack nst = new IntStack(100);
    static IntStack swst = new IntStack(100);
	//--- 再帰を除去したrecur ---//
	static void recur(int n) {
        nst.push(n);
        inst sw = 0;
		while (true) {
            if (n>0){
			    if (sw == 0) {
				    n = n - 1;
                    nst.push(n);
                    nst.push(sw)
                    continue;
			    }
                if (sw == 1){
                    n = n -2;
                    nst.push(n);
                    swst.push(sw);
                    sw = 0;
                }
            }
        }
			if (s.isEmpty() != true) {		// スタックが空でなければ
				n = s.pop();					// 保存していた値をnにポップ
				System.out.println(n);
				n = n - 2;
				continue;
			}
			break;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数を入力せよ：");
		int x = stdIn.nextInt();

		recur(x);
	}
}
