public class practical_23 {
    public static void main(String[] args) {
        shape circle = new Circle(10, "black");
        shape rectangle = new Rectangle(20, 30, "red");

        sign cirSign = new sign(circle, "welcome to campus");
        sign recSign = new sign(rectangle, "welcome!");

        cirSign.display();
        recSign.display();
        System.out.println("23DCS092_Shubh");
    }
}

interface shape {
    String color();

    int area();

    default String info() {
        return "This is a shape with color " + color() + " area " + area();
    }
}

class Circle implements shape {
    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String color() {
        return color;
    }

    public int area() {
        return (int) (3.14 * radius * radius);
    }
}

class Rectangle implements shape {
    private int length;
    private int width;
    private String color;

    public Rectangle(int length, int width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public String color() {
        return color;
    }

    public int area() {
        return length * width;
    }
}

class sign {
    private shape shape;
    private String text;

    public sign(shape shape, String text) {
        this.shape = shape;
        this.text = text;
    }

    void display() {
        System.out.println("Sign text: " + text);
        System.out.println(shape.info());
    }
}
