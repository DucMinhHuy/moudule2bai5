public class baidoc1 {
    static int count=0;
//    static int gethuy(){
//        return count;
//    }
    baidoc1(){
        count+=1;
        System.out.println(count);
    }

    public static void main(String[] args) {
       baidoc1 c1= new baidoc1();
       baidoc1 c2= new baidoc1();
       baidoc1 c3= new baidoc1();
//        System.out.println(baidoc1.gethuy());
    }
}
