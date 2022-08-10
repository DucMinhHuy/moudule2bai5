public class baidoc2 {
//    int frogSize =0;
//    public int getFrogSize(){
//        return frogSize;
//    }
//    public baidoc2(int a){
//        frogSize=a;
//    }
//
//    public static void main(String[] args) {
//        baidoc2 f=new baidoc2(25);
//        System.out.println(f.getFrogSize());
//    }
    private static int frogCount=0;
    static int getCount(){
        return frogCount;
    }
     public baidoc2(){
        frogCount+=1;
    }
}
class TestFrog{
    public static void main(String[] args) {
        new baidoc2();
        new baidoc2();
        new baidoc2();
        System.out.println("from static"+baidoc2.getCount());
        new baidoc2();
        new TestFrog().go();
        baidoc2 f=new baidoc2();
        System.out.println("use ref var "+f.getCount());
    }
    void go(){
        System.out.println("from inst "+baidoc2.getCount());
    }
}
