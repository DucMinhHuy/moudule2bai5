
public class baitap1 {

    private double radius;
//    private double Area;
    private String color="red";

    public baitap1(double radius) {
        this.radius = radius;
    }
    double getRadius(){
        return radius;
    }
    double getArea(){
        return radius*radius*Math.PI;
    }
    public void display(){

    }
}
class TestCircle{
    public static void main(String[] args) {
        baitap1 radius=new baitap1(25);
        System.out.println(radius.getArea());
    }
}
