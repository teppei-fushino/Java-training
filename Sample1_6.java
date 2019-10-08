class Sample1_6{
    public static void main(String[] args){
        MySingleton obj1 = MySingleton.getInstance();
        MySingleton obj2 = MySingleton.getInstance();
        if(obj1 ==obj2){
            System.out.println("obj1 == obj2");//こっちに入っている
        }else{
            System.out.println("obj1 != obj2");
        }
    }
}

public class MySingleton{
    private static final MySingleton instance = new MySingleton();
    private MySingleton(){};
    public static MySingleton getInstance(){
        return instance;
    }
}

