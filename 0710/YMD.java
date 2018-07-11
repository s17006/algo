class YMD{
    int y;
    int m;
    int d;
    YMD(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    YMD after(int n){
       return new YMD(this.y,this.m,this.d + n);
    }
    YMD before(int n){
       return new YMD(this.y,this.m,this.d - n);
    }
    public static void main(String[] args){
       YMD day = new YMD(1998,12,5);
        YMD a = day.after(10);
        YMD b = day.before(4);
        System.out.println(day.y+" "+day.m+" "+day.d);
        System.out.println(a.d);
        System.out.println(b.d);
    }
}
