// 正方形の表を表示
import java.util.Scanner;
public class quiz{

	public static void main(String[] args) {
		System.out.println("-----**で正方形-----");
        Scanner stdIn = new Scanner(System.in);
        int n;
        n = stdIn.nextInt();
        System.out.println("段数は"+n);

        //1行目と2行目の処理
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)
				System.out.printf("*");
        System.out.println();
		}
	}
}
