class Sample1_10{
    public static void main (String[] args){
        int[] ary = {1,2};
        String obj1 = "tanaka";
        Foo obj2 = new Foo();
        Bar obj3 = new Bar();
        System.out.println(ary);
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);//printlnメソッドはtoStringメソッドが呼ばれる
    }
}
class Bar{
    public String toString(){
        return "This is an object made from Bar";
    }
}
class Foo{}

