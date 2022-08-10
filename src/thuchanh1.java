public class thuchanh1 {
    private int age;
    private String name;
    private static String collon="bbdit";

    public thuchanh1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //    thuchanh1(int r,String n){
//        age=r;
//        name=n;
//    }
    static void change(){
        collon="thai binh";
    }
    void display(){
        System.out.println(age+""+name+""+collon);
    }
}

