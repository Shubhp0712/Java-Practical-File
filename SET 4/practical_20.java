public class practical_20 {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.print1();
        s1.print2();
        s1.print4();

        System.out.println("23DCS092_Shubh");
    }

}

class Shape {

    void print1() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {
    void print2() {
        System.out.println("This is rectangular Shape.");
    }
}

class Circle extends Shape {
    void print3() {
        System.out.println("This is circular Shape.");
    }
}

class Square extends Rectangle {
    void print4() {
        System.out.println("Square is a rectangle.");
    }
}