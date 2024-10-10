public class practical_17 {
    public static void main(String[] args) {
        ParentClass parent = new ParentClass();
        ChildClass child = new ChildClass();

        parent.printParent();
        child.printParent();
        child.printChild();

        System.out.println("23DCS092_Shubh");
    }
    
}
class ParentClass {
    public void printParent() {
        System.out.println("This is parent class");
    }
}
class ChildClass extends ParentClass{
    public void printChild() {
        System.out.println("This is child class");
    }
}
