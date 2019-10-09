//out変数はSystemクラスのstatic変数
import static java.lang.System.out;
//random()メソッドはMathクラスのstaticメソッド
import static java.lang.Math.random;

class Sample1_14{
    public static void main(String[] args){
        //staticインポートしたstaticメンバをしようしたコード
        out.println(random());
        //staticインポートを私用しないコード
        System.out.println(Math.random());
    }
}