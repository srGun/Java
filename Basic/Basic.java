class Basic{
    public int a;
    public int b;
    public int sum(){
        this.a = a;
        this.b = b;
        return a + b;
    }
}

class main {
    public static void main(String[] args) {
        Basic obj = new Basic();
        int x = 20;
        int y = 10;
        obj.a = x;
        obj.b = y;
        int add = obj.sum();
        System.out.println(add);
    }
}
