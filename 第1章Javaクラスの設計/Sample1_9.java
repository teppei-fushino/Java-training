class Sample1_9{
    public static void main(String[] args){
        Vals obj = Vals.A;
        obj.foo();
    }
}

enum Vals{
    A{void foo() {System.out.println("A");}},
    B{void foo() {System.out.println("B");}};
    abstract void foo();
}
