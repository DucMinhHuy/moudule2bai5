public class thuchanh2 {
    private String name;
    private String english;
    public static int numberCar;

    public thuchanh2(String name, String english) {
        this.name = name;
        this.english = english;
        numberCar++;
    }
    public void display(){
        System.out.println(name+""+english);
    }
}
class car{
    public static void main(String[] args) {
        thuchanh2 car1=new thuchanh2("toyota","japan");
        thuchanh2 car2=new thuchanh2("huyndai","koreun");
        thuchanh2 car3=new thuchanh2("winfast","vietnam");
        car1.display();
        car2.display();
        car3.display();
    }
}