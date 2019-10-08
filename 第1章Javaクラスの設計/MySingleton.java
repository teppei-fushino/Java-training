public class MySingleton{
    public static void main(String[] args){
        private static final MySingleton instance = new MySingleton();
        private MySingleton(){};
        public static MySingleton getInstance(){
            System.out.println("hello");
            return instance;
        }
    }
}