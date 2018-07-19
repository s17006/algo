// int型スタック

public class IntStack {
    private int max;			// スタックの容量
    private int ptrA;			// スタックポインタ
    private int ptrB;
    private int[] stk;		// スタックの本体

    public enum AorB {StackA, StackB};

    //--- 実行時例外：スタックが空 ---//
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() { }
    }

    //--- 実行時例外：スタックが満杯 ---//
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() { }
    }

    //--- コンストラクタ ---//
    public IntStack(int capacity) {
        ptrA = 0;
        ptrB = capacity-1;
        max = capacity;
        try {
            stk = new int[max];				// スタック本体用の配列を生成
        } catch (OutOfMemoryError e) {	// 生成できなかった
            max = 0;
        }
    }

    //--- スタックにxをプッシュ ---//
    public int push(AorB sw, int x) throws OverflowIntStackException {
        if(ptrA >= ptrB + 1)
            throw new OverflowIntStackException();
        switch(sw){
            case StackA: stk[ptrA++] = x;break;
            case StackB: stk[ptrB--] = x;break;
        }
        return x;
    }
    //--- スタックからデータをポップ（頂上のデータを取り出す） ---//
    public int pop(AorB sw) throws EmptyIntStackException {
        int x = 0;
        switch (sw){
            case StackA:
                if(ptrA <= 0)
                    throw new EmptyIntStackException();
                x = stk[--ptrA];
                break;
            case StackB:
                if(ptrB >= max-1)
                    throw new EmptyIntStackException();
                x = stk[++ptrB];
                break;
        }
        return x;
    }

    //--- スタックからデータをピーク（頂上のデータを覗き見） ---//
    public int peek(AorB sw) throws EmptyIntStackException {
        int x = 0;
        switch (sw){
            case StackA:
                if(ptrA <= 0)
                    throw new EmptyIntStackException();
                x = stk[ptrA-1];
                break;
            case StackB:
                if(ptrB >= max-1)
                    throw new EmptyIntStackException();
                x = stk[ptrB+1];
                break;
        }
        return x;
    }

    //--- スタックからxを探してインデックス（見つからなければ-1）を返す ---//
    public int indexOf(AorB sw, int x) {
        switch(sw){
            case StackA:
                for(int i = ptrA - 1; i >= 0; i--)
                    if(stk[i] == x)
                        return i;
                break;
            case StackB:
                for(int i = ptrB + 1; i < max; i++)
                    if(stk[i] == x)
                        return i;
                break;
        }
        return -1;
    }

    //--- スタックを空にする ---//
    public void clear(AorB sw) {
        switch (sw){
            case StackA: ptrA = 0; break;
            case StackB: ptrB = max - 1; break;
        }
    }

    //--- スタックの容量を返す ---//
    public int capacity(){
        return max;
    }

    //--- スタックに積まれているデータ数を返す ---//
    public int size(AorB sw) {
        switch(sw){
            case StackA: return ptrA;
            case StackB: return max - ptrB - 1;
        }
        return 0;
    }

    //--- スタックは空であるか ---//
    public boolean isEmpty(AorB sw) {
        switch(sw){
            case StackA: return ptrA <= 0;
            case StackB: return ptrB >= max -1;
        }
        return true;
    }

    //--- スタックは満杯であるか ---//
    public boolean isFull() {
        return ptrA >= ptrB + 1;
    }

    //--- スタック内の全データを底→頂上の順に表示 ---//
    public void dump(AorB sw) {
        switch(sw){
            case StackA:
                if(ptrA <= 0)
                    System.out.println("スタックは空です。");
                else{
                    for (int i = 0; i < ptrA; i++)
                        System.out.print(stk[i] + " ");
                    System.out.println();
                }
            case StackB:
                if(ptrB >= max -1)
                    System.out.println("スタックは空です。");
                else{
                    for(int i = max -1; i > ptrB; i--)
                        System.out.print(stk[i]+ " ");
                    System.out.println();
                }
        }
    }
}
