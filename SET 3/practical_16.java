import java.util.Scanner;

public class practical_16 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the real part :");
            int r = sc.nextInt();
            System.out.println("Enter the imaginary part :");
            int im = sc.nextInt();
            complex c1 = new complex(r,im);
            c1.putdata();

            System.out.println("Enter the real part :");
            r = sc.nextInt();
            System.out.println("Enter the imaginary part :");
            im = sc.nextInt();
            complex c2 = new complex(r,im);
            c2.putdata();

            c1.sum(c2);
            c1.difference(c2);
            c1.product(c2);

        System.out.println("23DCS092_Shubh");
    }
}


class complex {
    int real;
    int imag;

    complex(int r, int im) {
        real = r;
        imag = im;
    }

    void putdata(){
        System.out.println(real + " + " + imag + "i");
    }

    void sum(complex c2){
        int sumreal = real + c2.real;
        int sumimag = imag + c2.imag;

        System.out.println("The sum of two Complex number :" + sumreal + " + " + sumimag + "i");
    }

    void difference(complex c2){
        int difreal = real - c2.real;
        int difimag = imag - c2.imag;

        System.out.println("The Difference of two Complex number : (" + difreal + ") + ("+ difimag + ") i");
    }

    void product(complex c2){
        int prodreal = (real * c2.real) - (imag * c2.imag);
        int prodimag = (real * c2.imag) + (imag * c2.real);

        System.out.println("The Product of two Complex number : (" + prodreal + ") + ("+ prodimag + ") i");
    }
}