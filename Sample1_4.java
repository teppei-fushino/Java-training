
class Sample1_4{
    public static void main(String[] args) {
        final Foo obj1 = new Foo(100);
        //obj1.num1= 28;
        //obj1 = new Foo(300);
        Foo obj2 = new Foo(300);
        //obj2.num2= 28;
        System.out.println(obj1.num1);
        System.out.println(obj2.num2);
        
    }
    
}

class Foo{
    final int num1 = 10;
    final int num2;
    Foo(int i){ num2 = i;}
    //public static void main(String[] agrs){}
}



