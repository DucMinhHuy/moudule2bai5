public class baitap2 {
    private String name="john";
    private String classes="C02";

    public baitap2(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }
    String setModifier(){
        return name;
    }
    String setClasses(){
        return classes;
    }
    void display(){
        System.out.println(name+classes);
    }
}
class Test{
    public static void main(String[] args) {
        baitap2 h1=new baitap2("huy","C06");
        h1.display();

    }


}
