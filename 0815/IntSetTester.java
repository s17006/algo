// int型集合クラスIntSetの利用例

public class IntSetTester {

	public static void main(String[] args) {
		IntSet s1 = new IntSet(20);
		IntSet s2 = new IntSet(5);
		IntSet s3 = new IntSet(20);

		s1.add(10);			// s1 = {10}
		s1.add(15);			// s1 = {10, 15}
		s1.add(20);			// s1 = {10, 15, 20}
		s1.add(25);			// s1 = {10, 15, 20, 25}

		s1.copyTo(s2);		// s2 = {10, 15, 20, 25}
		s2.add(12);			// s2 = {10, 15, 20, 25, 12}
        System.out.println(s2);
        System.out.println("今からs2の集合が満杯か調べる");
        System.out.println(s2.isFull());
		s2.remove(25);		// s2 = {10, 15, 20, 12}
        System.out.println(s2);
        System.out.println("ｓ２の要素を一つ消してもう一度満杯かを調べる");
        System.out.println(s2.isFull());

		s3.copyFrom(s2);	// s3 = {10, 15, 20, 12}
        System.out.println("次はｓ２の要素が空かどうかを調べる");
        System.out.println(s2);
        System.out.println(s2.isEmpty());
        s2.clear();
        System.out.println(s2);
        System.out.println("ついでにクリアのメソッドの実験もしてからかどうか調べる");
        System.out.println(s2.isEmpty());
	}
}
