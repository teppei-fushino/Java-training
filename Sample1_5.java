class Sample1_5{
    public static void main(String[] args){
        System.out.println(MethodE());
    }
    int instanceVal;
    static int staticVal;

    int MethodA(){return instanceVal;}
    int MethodB(){return staticVal;}
    //static int methodC(){return instanceVal;}
    static int MethodD(){return staticVal;}
    static int MethodE(){
        Sample1_5 obj = new Sample1_5();
        return obj.instanceVal;
    }
}