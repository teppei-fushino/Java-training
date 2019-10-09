//ルール１：同一のオブジェクトに対してhashCode()メソッドが複数回呼び出されても同一の整数値を返す
//ルール２；２つのオブジェクトをequalsメソッドで比較してtrueでかえる場合は
//         ２つのオブジェクトのハッシュコードの値は同じとなる
//ルール３：２つのオブジェクトをequalsメソッドで比較してfalseがかえる場合は、２つのオブジェクトのハッシュコードは同じでも異なる値でもどちらでも良い、ただし、異なる値を返した方がパフォーマンスが工場する場合がある
//

class Sample1_13{
    public static void main (String[] args){
        Foo f1 = new Foo();Foo f2 = new Foo();
        System.out.println("f1.equals(f2):"+ f1.equals(f2));//false
    }
}
class Foo{
    private int num;
    //Fooがoを利用できてかつ型変換をして、oのnumがFooのnumと等しいかどうか
    public boolean equals(Object o){
        if((o instanceof Foo) && ((Foo)o).num == this.num) {
            return true;
        }else{
            return false;
        }
    }
    //hashCodeを5倍にして返す
    public int hashCode(){
        return num*5;
    }
}

