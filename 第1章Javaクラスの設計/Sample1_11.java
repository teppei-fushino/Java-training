//equalsメソッド

class Sample1_11{
    public static void main (String[] args){
        Foo f1 = new Foo();Foo f2 = new Foo();
        System.out.println("f1.equals(f2):"+ f1.equals(f2));//false
        Foo f3 = new Foo();Foo f4 = f3;
        System.out.println("f3.equals(f4):"+ f3.equals(f4));//true
        Bar b1 = new Bar();
        System.out.println("f3.equals(b1):"+ (f3.equals(b1)));//false
        System.out.println("f3.equals(null):"+ f3.equals(null));//fals特にnullとの比較はfalseになる
    }
}
class Bar{}
class Foo{}

