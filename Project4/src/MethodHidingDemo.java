
class Parent{
public static void study() {
System.out.println("Medicine");
}
}
class Child extends Parent{
public static void study() {
System.out.println("Acting");
}
}
public class MethodHidingDemo {
public static void main(String[] args) {
Parent p = new Parent();
p.study();

Child c = new Child();
c.study();

Parent p2 = new Child();
p2.study();
}
}




