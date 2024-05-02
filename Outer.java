class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }

    public static void main(String[] args) {
        OuterClass o = new OuterClass();
        InnerClass oo = new o.InnerClass();
    }
}