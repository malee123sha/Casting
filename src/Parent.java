public class Parent {
    void printData() {
        System.out.println("Method of Parent Class");
    }
}
class Child extends Parent {
    @Override
    void printData() {
        System.out.println("Method of Child Class");
    }
}
class testCasting {
    public static void main(String[] args) {
        Parent p = new Child(); //Up-casting
        p.printData();
    }
}


