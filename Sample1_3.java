class A{
    public static void main(String[] args){}


//スーパクラス
class SuperA{}
final class SuperB{}//finalクラスは継承できない
class SuperC{void print(){}}
class SuperD{final void print(){}}//finalメソッドのオーバーライドもできない

class SubA extends SuperA{}
//class SubB extends SuperB{}
class SubC extends SuperC{}
//class SubD extends SuperD{void pring{}}
}
