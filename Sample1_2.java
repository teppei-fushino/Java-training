class Sample1_2{
    public static void main (String[] args){
        //リテラルの先頭および末尾、記号の前後にはアンダースコアは記述できない

        float x1 = 3_.1415F;//NG
        float x2 = 3._1415F;//NG
        long x3 = 999_99_9999_L;//NG
        int x4 = _52;//NG
        int x5 = 5_2;//OK
        int x6 = 52_;//NG
        int x7 = 5________2;//OK
        int x8 = 0_x52;//NG
        int x9 = 0x_52;//NG
        int x10 = 0x5_2;//OK
        int x11 = 0_52;//OK

        System.out.println("OK");
    }

}