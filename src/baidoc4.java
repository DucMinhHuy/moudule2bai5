class Student{
    int age;
    String name;
    static String college ="thai binh";
    static void change(){
          college="viet nam";
    }
    Student(int r,String n){
        age=r;
        name=n;
    }
    void display(){
        System.out.println(age+""+name+""+college);
    }

    public static void main(String[] args) {
        change();
        Student s1=new Student(111,"hang");
        Student s2=new Student(222,"thanh");
        Student s3=new Student(333,"huy");
        s1.display();
        s2.display();
        s3.display();
    }
}
class a{
    static {
        System.out.println("khoi static duoc trieu hoi");
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}