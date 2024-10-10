public class practical_21 {
    public static void main(String[] args) {
        Degree d = new Degree();
        d.getDegree();

        Undergraduate ug = new Undergraduate();
        ug.getDegree();

        Postgraduate pg = new Postgraduate();
        pg.getDegree();

        System.out.println("23DCS092_Shubh");
    }
}

class Degree{
    void getDegree(){
        System.out.println("I got a degree");
    }
}

class Undergraduate extends Degree{
    void getDegree(){
        System.out.println("I am an Undergraduate");
    }
}

class Postgraduate extends Degree{
    void getDegree(){
        System.out.println("I am a Postgraduate");
    }
}
