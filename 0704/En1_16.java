import java.util.Scanner;

public class En1_16 {

    static void spira(int n) {
		for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(' ');
			for (int j = 1; j <=  i; j++)
                if (i < 10)
                    System.out.print(i);
                else
                    System.out.print(i%10);
			for (int j = 1; j < i; j++)
                if (i < 10)
                    System.out.print(i);
                else
                    System.out.print(i%10);
			System.out.println();
		}
    }

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("ピラミッドと段数表示");

		do {
			System.out.print("段数は：");
			n = stdIn.nextInt();
		} while (n <= 0);

        spira(n);



	}
}
