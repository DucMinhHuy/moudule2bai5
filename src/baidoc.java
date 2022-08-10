public class baidoc {
    static int frogCount =0;
    public baidoc(){
        frogCount+=1;
    }

    public static void main(String[] args) {
        new baidoc();
        new baidoc();
        new baidoc();
        System.out.println("Frog count is now"+ frogCount);

    }
}
